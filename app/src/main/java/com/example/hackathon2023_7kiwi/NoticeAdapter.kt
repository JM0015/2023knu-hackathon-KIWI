package com.example.hackathon2023_7kiwi

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBinding
import com.example.hackathon2023_7kiwi.databinding.NoticeItemMainBinding
import com.example.hackathon2023_7kiwi.dto.NoticeData

class NoticeAdapter(val noticeList: MutableList<NoticeData>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class NoticeViewHolder(val binding: NoticeItemMainBinding): RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = noticeList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("song", "onBindViewHolder : $position")
        val binding = (holder as NoticeViewHolder).binding

        //binding.noticeItemImg.setImageResource(noticeList[position].img)
        binding.noticeItemTitleData.text = noticeList[position].title
        binding.noticeItemContextData.text = noticeList[position].context

//        binding.noticeItemRoot.setOnClickListener {
//            Log.d("song", "item root clicked : $position")
//        }

        binding.noticeItemRoot.setOnClickListener {
            Log.d("song", "item root click : $position")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        NoticeViewHolder(NoticeItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))

}