package com.example.androidscaleyreproductionanr

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidscaleyreproductionanr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val parentView = RelativeLayout(this)
        parentView.layoutParams = ViewGroup.LayoutParams(1000, 2000)
        parentView.setBackgroundColor(0xFF00FF00.toInt())
        parentView.scaleY = -1f
        parentView.rotationX = 180f

        // add a child view to the parentView which we invert as well:
        val childView = LinearLayout(this)
        childView.orientation = LinearLayout.VERTICAL
        childView.layoutParams = ViewGroup.LayoutParams(800, 1800)
        childView.setBackgroundColor(0xFF0000FF.toInt())
        childView.scaleY = -1f
        childView.rotationX = 180f

        parentView.addView(childView)

        // add 20 text views to the child view
        for (i in 0..19) {
            val textView = TextView(this)
            val layoutPrams = ViewGroup.MarginLayoutParams(200, 100)
            layoutPrams.topMargin = 10
            textView.layoutParams = layoutPrams
            textView.setBackgroundColor(0xFFD3D3D3.toInt())
            textView.gravity = Gravity.CENTER
            textView.text = "Text $i"

            childView.addView(textView)
        }

        binding.rootLayout.addView(parentView)
    }
}