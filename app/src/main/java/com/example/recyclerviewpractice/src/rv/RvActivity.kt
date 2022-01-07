package com.example.recyclerviewpractice.src.rv

import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.R
import com.example.recyclerviewpractice.config.BaseActivity
import com.example.recyclerviewpractice.databinding.ActivityRvBinding

data class Test(val img: Int , val context : String)

class RvActivity : BaseActivity<ActivityRvBinding>(ActivityRvBinding::inflate) {
    lateinit var rvAdapter : RvAdapter
    private var data = arrayListOf<Test>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addData()
        //var mGridLayoutManager = GridLayoutManager(this, 3)
        rvAdapter = RvAdapter(data,this)
        binding.rvPractice.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvPractice.adapter = rvAdapter
        val dividerItemDecoration = DividerItemDecoration(applicationContext, LinearLayoutManager(this).orientation)
        binding.rvPractice.addItemDecoration(dividerItemDecoration)


    }
    private fun addData(){
        for(i in 0 until 20){
            data.add(Test(R.drawable.ic_launcher_background,"텍스트$i"))
        }
    }
}