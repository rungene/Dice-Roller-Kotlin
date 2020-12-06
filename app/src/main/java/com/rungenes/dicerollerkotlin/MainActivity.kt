package com.rungenes.dicerollerkotlin

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
   lateinit var  imageRoll:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)



        rollButton.setOnClickListener {
         diceRolled()
        }
        imageRoll = findViewById(R.id.roll_imageview)
    }

    private fun diceRolled() {

        val random = Random.nextInt(6)+1

        val drawableResource =when(random){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6

            else->R.drawable.empty_dice
        }

        imageRoll.setImageResource(drawableResource)


    }
}