package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_search)




        val searchbtn = findViewById<TextView>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val homebtn = findViewById<TextView>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val libarybtn = findViewById<TextView>(R.id.libarybtn)
        libarybtn.setOnClickListener {
            val intent = Intent(this@SearchActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val premium = findViewById<TextView>(R.id.premiumbtn)
        premium.setOnClickListener {
            val intent = Intent(this@SearchActivity, PremiumActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }



}