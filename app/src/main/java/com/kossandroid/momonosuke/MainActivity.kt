package com.kossandroid.momonosuke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kossandroid.momonosuke.databinding.ActivityMainBinding
import com.kossandroid.multiads.AlertMessage

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnTest.setOnClickListener {
            AlertMessage.showmessage(this, "test", "sukses ", {
                Toast.makeText(this, "dismises=d", Toast.LENGTH_SHORT).show()
            })
        }

    }
}