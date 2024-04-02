package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.ViewFlipper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val imageList = arrayListOf(
        R.drawable.b1,
        R.drawable.b2,
        R.drawable.b3
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setTheme(R.style.Theme_MyApplication)
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        val viewFlipper = findViewById<ViewFlipper>(R.id.viewflipper)
        val inAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        val outAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right)

        viewFlipper.inAnimation = inAnimation
        viewFlipper.outAnimation = outAnimation

        for (image in imageList) {
            val imageView = ImageView(this)
            imageView.setImageResource(image)
            imageView.layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT,
            )
            viewFlipper.addView(imageView)
        }
//        val nextbtn = findViewById<Button>(R.id.btnnext)
//        nextbtn.setOnClickListener{
//            viewFlipper.showNext()
//        }
//
//        val previousbtn = findViewById<Button>(R.id.btnprevious)
//        previousbtn.setOnClickListener{
//            viewFlipper.showPrevious()
//        }

        val searchbtn = findViewById<TextView>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val homebtn = findViewById<TextView>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val libarybtn = findViewById<TextView>(R.id.libarybtn)
        libarybtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val allsongs = findViewById<TextView>(R.id.allsongsbtn)
        allsongs.setOnClickListener {
            val intent = Intent(this@MainActivity, AllsongsActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val premium = findViewById<TextView>(R.id.premiumbtn)
        premium.setOnClickListener {
            val intent = Intent(this@MainActivity, PremiumActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

    }
}