package com.example.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlinlearning.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val messageRecive: String? = intent.getStringExtra("message")
        binding.textView.text = messageRecive

        binding.calculateNm.setOnClickListener {
            //check if fields is empty
            val firststring = binding.edFirstNumber.text.toString()
            val secondString = binding.edSecondNumber.text.toString()
            if (firststring.equals("") || secondString.equals("")) {
                Toast.makeText(this, "fileds should not be empty", Toast.LENGTH_LONG).show()
            } else {

//converting value to int
                val firstNumber = firststring.toInt()
                val secondNumber = secondString.toInt()
                val result = calculate(firstNumber, secondNumber)
                Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
//change visibility to view
                binding.resultTextView.visibility = View.VISIBLE
                //set result to textview
                binding.resultTextView.text = result.toString()
            }


        }


    }

    private fun calculate(firsts: Int, second: Int): Int {

        return firsts + second


    }


}