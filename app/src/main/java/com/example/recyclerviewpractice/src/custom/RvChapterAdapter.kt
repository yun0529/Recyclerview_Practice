package com.example.recyclerviewpractice.src.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewpractice.R
import com.example.recyclerviewpractice.databinding.ItemCustomRvChapterBinding

private lateinit var binding : ItemCustomRvChapterBinding

class RvChapterAdapter(private val chapterSet: ArrayList<Chapter>, var con : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemCustomRvChapterBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val (id, chapterName, imageUrl) = chapterSet[position]
        when(holder){
            is ViewHolder -> holder.bind(chapterSet[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return chapterSet.size
    }



    inner class ViewHolder(private val binding : ItemCustomRvChapterBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : Chapter){
            binding.citemIv.setImageResource(R.drawable.ic_launcher_background)
            binding.citemTv.text = data.chapterName
        }

    }

}