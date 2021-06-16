package com.example.wintrade_loading_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wintrade_loading_screen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val DURATION = 10000L
    private val ROTATION = 2500f
    private val COUNTER_ROTATION = -2500f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.loadingCircle1.animate().rotationBy(ROTATION).duration = DURATION
        binding.loadingCircle2.animate().rotationBy(ROTATION).duration = DURATION
        binding.loadingCircle3.animate().rotationBy(COUNTER_ROTATION).duration = DURATION
        binding.loadingCircle4.animate().rotationBy(ROTATION).duration = DURATION
        binding.loadingCircle5.animate().rotationBy(COUNTER_ROTATION).duration = DURATION
        binding.loadingCircle6.animate().rotationBy(COUNTER_ROTATION).duration = DURATION
        binding.loadingCircle7.animate().rotationBy(ROTATION).duration = DURATION

    }
}