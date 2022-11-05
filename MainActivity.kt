package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorlist
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathlist
import com.example.paintapp.R

class MainActivity : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintbrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redbtn= findViewById<ImageButton>(R.id.redColor)
        val bluebtn= findViewById<ImageButton>(R.id.blueColor)
        val blackbtn= findViewById<ImageButton>(R.id.blackColor)
        val erazer= findViewById<ImageButton>(R.id.whiteColor)

        redbtn.setOnClickListener{
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.RED
            currentcolor(paintbrush.color)
        }

        bluebtn.setOnClickListener{
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.BLUE
            currentcolor(paintbrush.color)

        }

        blackbtn.setOnClickListener{
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.BLACK
            currentcolor(paintbrush.color)

        }

        erazer.setOnClickListener{
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            pathlist.clear()
            colorlist.clear()
            path.reset()
        }

    }
    private fun currentcolor{
        currentBrush=color
        path=Path()
    }
}