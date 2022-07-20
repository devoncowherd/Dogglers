package com.example.googledogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googledogglers.utils.DogAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bella = Dog("Bella", R.drawable.bella)
        val faye = Dog("Faye", R.drawable.faye)
        val frankie = Dog("Frankie", R.drawable.frankie)
        val leroy = Dog("Leroy", R.drawable.leroy)
        val nox = Dog("Nox",R.drawable.nox)
        val tzeitel = Dog("Tzietel", R.drawable.tzeitel)
        val dogList : List<Dog> = listOf(bella, faye, frankie, leroy, nox, tzeitel)
        val adapter = DogAdapter(dogList)
        val dogRecycler : RecyclerView = findViewById(R.id.dogRecycler)

        dogRecycler.layoutManager = LinearLayoutManager(this)
        dogRecycler.adapter = adapter

    }
}