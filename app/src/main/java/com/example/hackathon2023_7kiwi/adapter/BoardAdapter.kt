package com.example.hackathon2023_7kiwi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon2023_7kiwi.CustomAdapter
import com.example.hackathon2023_7kiwi.databinding.ItemMainBinding
import com.example.hackathon2023_7kiwi.dto.Datum

class BoardAdapter (val dataList: MutableList<Datum>) : RecyclerView.Adapter<BoardAdapter.Holder>() {

    class Holder(val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {
        // 3. 받은 데이터를 화면에 출력한다.
        fun setTry(datum: Datum) {
            with(binding){
                index.text = datum.index
                itemTitle.text = datum.titles
                itemContent.text = datum.contents
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        // 1. 사용할 데이터를 꺼내고
        val datum = dataList[position]
        // 2. 홀더에 데이터를 전달
        holder.setTry(datum)
    }

    override fun getItemCount() = dataList.size


}