package com.camille.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var button: Button
    var randomDicer: Dicer = Dicer.NO_DICE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        button = findViewById(R.id.button)

        button.setOnClickListener { onButtonClick() }

    }

    private fun onButtonClick() {
        val randomNumber: Int = Random.nextInt(1, 6)
        randomDicer = Dicer.valueOf("DICE${randomNumber}")
        image.setImageResource(randomDicer.source)
    }

}

enum class Dicer(val source: Int) {
    DICE1(R.drawable.dice_1),
    DICE2(R.drawable.dice_2),
    DICE3(R.drawable.dice_3),
    DICE4(R.drawable.dice_4),
    DICE5(R.drawable.dice_5),
    DICE6(R.drawable.dice_6),
    NO_DICE(R.drawable.empty_dice),
}






