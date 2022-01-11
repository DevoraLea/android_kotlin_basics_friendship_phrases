package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motivationapp.adapter.ItemAdapter
import com.example.motivationapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView= findViewById<RecyclerView>(R.id.recycleAffirmation)
        recyclerView.adapter = ItemAdapter(this,DataSource().loadAffirmation())
       // recyclerView.setHasFixedSize(true)
    }
}