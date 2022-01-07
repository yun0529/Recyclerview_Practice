package com.example.recyclerviewpractice.src.rv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recyclerviewpractice.databinding.ItemRvTestBinding
import com.example.recyclerviewpractice.databinding.ItemVpBinding

private lateinit var binding : ItemRvTestBinding
data class Text(val tv: Int)
class RvAdapter(private val dataSet: ArrayList<Test>,var con :Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER = 0
    private val TYPE_ITEM = 1
    private val TYPE_FOOTER = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemRvTestBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolder -> holder.bind(dataSet[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }



    inner class ViewHolder(private val binding : ItemRvTestBinding) : RecyclerView.ViewHolder(binding.root){
        var textData = arrayListOf<Text>()
        fun bind(data : Test){
            binding.itemIvImg.setImageResource(data.img)
            //binding.itemTvText.text = data.context
            binding.itemView.isFocusable = true
            binding.itemView.isClickable = true
            binding.itemView.setOnClickListener {
                Toast.makeText(con,data.context + "_$layoutPosition 가 눌림",Toast.LENGTH_SHORT).show()
            }
            for(i in 0 until 10){
                textData.add(Text(i))
            }
            binding.itemVp.adapter = VpAdapter(textData)
            binding.itemVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }

    }

}