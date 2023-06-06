package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Listeners {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(list, this)
        recyclerView.adapter = adapter
    }

    private val list = mutableListOf(
        ItemViewModel("User 1", "You may have a new message"),
        ItemViewModel("User 2", "You may have a new message"),
        ItemViewModel("User 3", "You may have a new message"),
        ItemViewModel("User 4", "You may have a new message"),
        ItemViewModel("User 5", "You may have a new message"),
        ItemViewModel("User 6", "You may have a new message"),
        ItemViewModel("User 7", "You may have a new message"),
        ItemViewModel("User 8", "You may have a new message"),
        ItemViewModel("User 9", "You may have a new message"),
        ItemViewModel("User 10", "You may have a new message"),
        ItemViewModel("User 11", "You may have a new message"),
        ItemViewModel("User 12", "You may have a new message"),
        ItemViewModel("User 13", "You may have a new message"),
        ItemViewModel("User 14", "You may have a new message"),
        ItemViewModel("User 15", "You may have a new message"),
        ItemViewModel("User 16", "You may have a new message"),
        ItemViewModel("User 17", "You may have a new message"),
        ItemViewModel("User 18", "You may have a new message"),
        ItemViewModel("User 19", "You may have a new message"),
        ItemViewModel("User 20", "You may have a new message"),
        ItemViewModel("User 21", "You may have a new message"),
        ItemViewModel("User 22", "You may have a new message"),
        ItemViewModel("User 23", "You may have a new message"),
        ItemViewModel("User 24", "You may have a new message"),
        ItemViewModel("User 25", "You may have a new message"),
        ItemViewModel("User 26", "You may have a new message"),
    )

    override fun onItemClick(it: Int) {
        val name = list[it].name
        val message = list[it].message
        Toast.makeText(this, " $name is clicked \n Opening detail page ", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, SecondActivity::class.java)
            .putExtra("name", name)
            .putExtra("message", message)
        startActivity(intent)
    }
}