package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemViewBinding

class Adapter(
    val list: List<ItemViewModel>,
    private val itemClick: () -> Unit
    ):RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    inner class ItemViewHolder(
        val binding: ItemViewBinding,
        private val itemClick: () -> Unit
        ): RecyclerView.ViewHolder(binding.root) {

       fun bindItemView(model: ItemViewModel){
           binding.itemviewText1.text = model.name
           binding.itemviewText2.text = model.message
           binding.root.setOnClickListener{
               itemClick.invoke()
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflate = ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(inflate, itemClick)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindItemView(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}