package com.example.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koinexample.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val course = Course()
//        val friend = Friend()
        val student: Student by inject() // inject is used to lazily inject the dependencies , get() can be used to get dependency non-lazily

        binding.textView.text = student.doWork()
    }
}