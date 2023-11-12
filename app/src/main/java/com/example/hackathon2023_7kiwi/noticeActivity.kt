package com.example.hackathon2023_7kiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon2023_7kiwi.adapter.NoticeAdapter
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBinding
import com.example.hackathon2023_7kiwi.dto.NoticeData

class noticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNoticeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.toolbar)
        supportActionBar?.setTitle("Title")

//        val noticeList = mutableListOf<NoticeData>()
//        for (i in 1..10) {
////            noticeList.add(NoticeData(R.drawable.cat, "Title $i", "Context $i"))
//            noticeList.add(NoticeData("Title $i", "Context $i"))
//        }

        var noticeList = mutableListOf<NoticeData>()
        noticeList.add(NoticeData(R.drawable.cat, "홍길동1", "hi"))
        noticeList.add(NoticeData(R.drawable.cat, "홍길동2", "hi"))
        noticeList.add(NoticeData(R.drawable.cat, "홍길동3", "hi"))

        binding.noticeRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.noticeRecyclerView.adapter = NoticeAdapter(noticeList)

        //binding.noticeRecyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
//        binding.addBtn.setOnClickListener {
//            noticeList.add(NoticeData("new"))
//            (binding.noticeRecyclerView.adapter as NoticeAdapter).notifyDataSetChanged()
//        }
    }
}