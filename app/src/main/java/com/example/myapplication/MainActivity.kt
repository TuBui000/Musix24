package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.ViewFlipper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.ImageButton

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

        val searchbtn = findViewById<ImageView>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        val homebtn = findViewById<ImageView>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
        val albumbtn = findViewById<ImageView>(R.id.albumbtn)
        albumbtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

    }
}