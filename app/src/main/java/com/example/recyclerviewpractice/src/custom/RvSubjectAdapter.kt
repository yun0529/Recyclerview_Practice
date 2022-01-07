package com.example.recyclerviewpractice.src.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewpractice.databinding.ItemCustomRvChapterBinding
import android.R

import android.widget.TextView




private lateinit var binding : ItemCustomRvChapterBinding

class RvSubjectAdapter(private val subjectSet: ArrayList<Subject>, var con : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER = 0
    private val TYPE_ITEM = 1
    private val TYPE_FOOTER = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemCustomRvChapterBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolder -> holder.bind(subjectSet[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return subjectSet.size
    }



    inner class ViewHolder(private val binding : ItemCustomRvChapterBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : Subject){

        }

    }

    inner class GridViewHolder(private val binding : ItemCustomRvChapterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Subject) {
            binding.
            recyclerView = itemView.findViewById(R.id.rvChapters)
            tvSubjectName = itemView.findViewById(R.id.tvSubjectName)
        }
    }
}