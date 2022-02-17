package com.at.bookshelf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class ShowImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_image)
        var actionBar: ActionBar? =supportActionBar
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setTitle("View Books")
        }

        var viewImages =  findViewById<ImageView>(R.id.viewImage)

        val refer1 = intent.getStringExtra("referance").toString()

        if (refer1 == "book1"){
            viewImages.setImageResource(R.drawable.bookone)
        }else if (refer1 == "book2"){
            viewImages.setImageResource(R.drawable.booktwo)
        }else if (refer1 == "book3"){
            viewImages.setImageResource(R.drawable.bookthree)
        }else if (refer1 == "book4"){
            viewImages.setImageResource(R.drawable.bookfor)
        }else if (refer1 == "book5"){
            viewImages.setImageResource(R.drawable.bookfive)
        }else if (refer1 == "book6"){
            viewImages.setImageResource(R.drawable.booksix)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}