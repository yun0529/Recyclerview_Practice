package com.example.recyclerviewpractice.src.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewpractice.databinding.ItemCustomRvChapterBinding

private lateinit var binding : ItemCustomRvChapterBinding

class RvAdapter(private val chapterSet: ArrayList<Chapter>, var con : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER = 0
    private val TYPE_ITEM = 1
    private val TYPE_FOOTER = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemCustomRvChapterBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
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
            Glide.with(con).load(data.imageUrl).into(binding.citemIv)
            binding.citemTv.text = data.chapterName
        }

    }

}