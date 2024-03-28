package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_search)




        val searchbtn = findViewById<ImageView>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val homebtn = findViewById<ImageView>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
        val albumbtn = findViewById<ImageView>(R.id.albumbtn)
        albumbtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }



}