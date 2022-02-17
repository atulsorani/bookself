package com.at.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var book1 = findViewById<ImageView>(R.id.book1)
        var book2 = findViewById<ImageView>(R.id.book2)
        var book3 = findViewById<ImageView>(R.id.book3)
        var book4 = findViewById<ImageView>(R.id.book4)
        var book5 = findViewById<ImageView>(R.id.book5)
        var book6 = findViewById<ImageView>(R.id.book6)

        book1.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book1")
            startActivity(intent)
        }

        book2.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book2")
            startActivity(intent)
        }

        book3.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book3")
            startActivity(intent)
        }

        book4.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book4")
            startActivity(intent)
        }


        book5.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book5")
            startActivity(intent)
        }

        book6.setOnClickListener {
            val intent =Intent(this, ShowImage::class.java)
            intent.putExtra("referance", "book6")
            startActivity(intent)
        }
    }
}