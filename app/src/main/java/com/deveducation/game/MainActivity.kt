package com.deveducation.game


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.random.Random
import android.text.Editable
import android.text.TextWatcher
import androidx.core.view.isVisible


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var leftcard=0
    var rightcard=0

    var userScore=0
    var pcScore=0

fun restart(view: View){
    textView1.text=""
    textView3.text=""
}

    fun exit(view: View){
        exit(view)
    }



    fun Deal(View:View){

        val left= (2..14).random()
        val right= (2..14).random()


        val a=resources.getIdentifier("@drawable/card$left", null ,packageName)
        imageView1.setImageResource(a)
        var b=resources.getIdentifier("@drawable/card$right", null ,packageName)
        imageView2.setImageResource(b)

        if (left>right){
            userScore=userScore+1
        }else if (right>left){
            pcScore=pcScore+1
        }
        else{
            null
        }

        textView1.setText(userScore.toString())
        textView3.setText(pcScore.toString())

        if (userScore==20){

            textView5.text="USER WIN THE GAME"
        }




    }




}


