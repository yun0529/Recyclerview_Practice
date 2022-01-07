package com.example.recyclerviewpractice.src.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.databinding.ItemVpBinding


private lateinit var binding:ItemVpBinding

class VpAdapter(var textList: ArrayList<Text>) : RecyclerView.Adapter<VpAdapter.PagerViewHolder>() {
    var mViewPagerState: HashMap<Int, Int> = HashMap()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        binding = ItemVpBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return PagerViewHolder(binding)
    }

    override fun getItemCount(): Int = textList.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(textList[position])
    }

//    fun addUserItems(user: Text){
//        userItems.add(user)
//        userCheckBoxStatus.add(UserCheckStatus(userItems.size - 1, false))
//        notifyItemInserted(userItems.size-1)
//    }

    inner class PagerViewHolder(private val binding : ItemVpBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(text: Text){
            binding.itemTvText.text = text.tv.toString()
        }


    }
}