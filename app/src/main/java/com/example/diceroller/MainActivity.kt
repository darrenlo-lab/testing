package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }
    private fun countDice() {
        //123

            val resultText: TextView = findViewById(R.id.result_text)
             val resultText1: TextView = findViewById(R.id.result_text1)
              val resultText12: TextView = findViewById(R.id.result_text2)
        // If text is the default "Hello World!" set that text to 1.
            if (resultText.text == "Hello World!") {
                resultText.text = "1"
            }
            else {
                // Otherwise, increment the number up to 6.
                // The text value in resultText.text is an instance of the CharSequence class;
                // it needs to be converted to a String object before it can be converted to an int.
                var resultInt = resultText.text.toString().toInt()

                if (resultInt < 6) {
                    resultInt++
                    resultText.text = resultInt.toString()
                }
            }


        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        }
        else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText1.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText1.text = resultInt.toString()
            }
        }

    }
    }
}

