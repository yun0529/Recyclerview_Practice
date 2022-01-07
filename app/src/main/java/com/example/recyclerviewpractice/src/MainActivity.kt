package com.example.recyclerviewpractice.src

import android.content.Intent
import android.os.Bundle
import com.example.recyclerviewpractice.config.BaseActivity
import com.example.recyclerviewpractice.databinding.ActivityMainBinding
import com.example.recyclerviewpractice.src.custom.CustomRvActivity
import com.example.recyclerviewpractice.src.rv.RvActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnNextPage.setOnClickListener {
            val intent = Intent(this,RvActivity::class.java)
            startActivity(intent)
        }

        binding.btnCustomRv.setOnClickListener {
            val intent = Intent(this,CustomRvActivity::class.java)
            startActivity(intent)
        }
    }

}