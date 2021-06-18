package com.example.carouselview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var imageArray:ArrayList<Int> = ArrayList()
    var carouselView:CarouselView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageArray.add(R.drawable.androidimg)
        imageArray.add(R.drawable.css)
        imageArray.add(R.drawable.hadoop)
        imageArray.add(R.drawable.html)
        imageArray.add(R.drawable.java)
        imageArray.add(R.drawable.kotlin)
        imageArray.add(R.drawable.python)
        imageArray.add(R.drawable.swift)





        carouselView = findViewById(R.id.carouselView)

        carouselView!!.pageCount = imageArray.size

        carouselView!!.setImageListener(imageListener)

    }

    var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position]) }
}