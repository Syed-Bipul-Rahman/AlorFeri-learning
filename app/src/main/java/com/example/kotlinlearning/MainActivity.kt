package com.example.kotlinlearning

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


        binding.textview.text = "Hallo ich bin bipul, Ich komme aus dinajpur";

        binding.button.setOnClickListener {
            var userName: String = binding.edtext.text.toString()
            if (userName.equals("")) {
                Toast.makeText(this, "please type something and try again", Toast.LENGTH_LONG)
                    .show()

            } else {
                userName = "you typed : " + userName

                Toast.makeText(this, userName, Toast.LENGTH_LONG).show()
            }

        }

    }
}