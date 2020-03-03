package com.deveducation.game


import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var leftcard=0
    var rightcard=0

    var userScore=0
    var pcScore=0

fun restart(view: View) {

    textView1.text=""
    textView3.text=""
    deal.visibility= VISIBLE
    textView5.visibility = GONE
    textView1.visibility = VISIBLE
    textView2.visibility = VISIBLE
    textView3.visibility = VISIBLE
    textView4.visibility = VISIBLE


}

    fun exit(view: View){
        exit(view)
    }



    fun Deal(View:View){

        textView5.text=""

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


        textView1.setText(userScore.toString())
        textView3.setText(pcScore.toString())

        if (userScore==10) {
        textView5.text="USER WIN THE GAME"
            textView5.visibility=VISIBLE
            userScore=0
            pcScore=0
            deal.visibility= GONE

            textView1.visibility= GONE
            textView2.visibility= GONE
            textView3.visibility= GONE
            textView4.visibility= GONE


                    }
        else if(pcScore==10){
            textView5.text="PC WIN THE GAME"
            textView5.visibility=VISIBLE
            userScore=0
            pcScore=0
            deal.visibility= GONE
            textView1.visibility= GONE
            textView2.visibility= GONE
            textView3.visibility= GONE
            textView4.visibility= GONE
        }
    }




}


