package com.gonz.mx.amazon.ui.motion.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gonz.mx.amazon.ui.motion.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }
    }
}
