package com.example.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textview.text = "Type your age to start your journey ";

        binding.button.setOnClickListener {
            var ageString: String = binding.edtext.text.toString()
            if (ageString.equals("")) {
                Toast.makeText(this, "please type your and try again", Toast.LENGTH_LONG)
                    .show()

            } else {
                //convert string to int value for perform operation
                var age = ageString.toInt()
                //checking user age to set welcome message
                val welcomeMessage = when {
                    age <= 17 -> "Your are child now"
                    age >= 18 -> "Welcome to our app"
                    age > 80 -> "you are too old to use our app"
                    else -> "Opps! something wrong"
                }


                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("message", welcomeMessage)
                startActivity(intent)


            }

        }

    }
}