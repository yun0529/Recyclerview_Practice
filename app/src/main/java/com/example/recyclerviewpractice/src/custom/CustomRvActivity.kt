package com.example.recyclerviewpractice.src.custom

import android.os.Bundle
import com.example.recyclerviewpractice.config.BaseActivity
import com.example.recyclerviewpractice.databinding.ActivityCustomRvBinding

data class Chapter (val id : Int, val chapterName: String , val imageUrl: String)
data class Subject (val id : Int, val subjectName: String , val chapters : ArrayList<Chapter>)

class CustomRvActivity : BaseActivity<ActivityCustomRvBinding>(ActivityCustomRvBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}