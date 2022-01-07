package com.example.recyclerviewpractice.src.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.databinding.ItemCustomRvChapterBinding
import android.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.databinding.ItemRvSubjectBinding


private lateinit var binding : ItemRvSubjectBinding
class RvSubjectAdapter(private val subjectSet: ArrayList<Subject>, var con : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemRvSubjectBinding.inflate(LayoutInflater.from(parent.context),parent, false)
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

    inner class ViewHolder(private val binding : ItemRvSubjectBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data : Subject){
            binding.rvChapters.adapter = RvChapterAdapter(data.chapters,con)
            binding.rvChapters.layoutManager =
                LinearLayoutManager(con, LinearLayoutManager.HORIZONTAL, false)
            binding.rvChapters.setHasFixedSize(true)
            binding.tvSubjectName.text = data.subjectName
        }

    }
}