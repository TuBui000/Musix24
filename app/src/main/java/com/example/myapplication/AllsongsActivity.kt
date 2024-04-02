package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AllsongsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_allsongs)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.allsong)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val searchbtn = findViewById<TextView>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val homebtn = findViewById<TextView>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val libarybtn = findViewById<TextView>(R.id.libarybtn)
        libarybtn.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val allsongs = findViewById<TextView>(R.id.allsongsbtn)
        allsongs.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, AllsongsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val premium = findViewById<TextView>(R.id.premiumbtn)
        premium.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, PremiumActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val player = findViewById<LinearLayout>(R.id.itemsong)
        player.setOnClickListener {
            val intent = Intent(this@AllsongsActivity, PlayerActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}