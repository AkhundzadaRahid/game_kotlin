package com.deveducation.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat.setBackground
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    lateinit var  leftcard  = imageView1
    lateinit var  rightcard = imageView2

    var Userscore=0
    var PCscore=0



    fun Deal (view: View){


    }



}
