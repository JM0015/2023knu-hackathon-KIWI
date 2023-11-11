package com.example.hackathon2023_7kiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBoardBinding
import com.example.hackathon2023_7kiwi.databinding.ItemMainBinding

class noticeBoard : AppCompatActivity() {

    val binding by lazy { ActivityNoticeBoardBinding.inflate(layoutInflater) }
    val binding1 by lazy { ItemMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_board)
        setContentView(binding.root)
        supportActionBar?.setTitle("Title")

        val datas = mutableListOf<String>()
        for (i in 1..10) {
            datas.add("item $i")
        }

        binding.noticeBoard.LayoutManager = LinearLayoutManager(this)
        binding.noticeBoard.adapter = MyAdapter(datas)
        binding.noticeBoard.addItemDecoration(DividerItemDecoration(this,
            LinearLayoutManager.VERTICAL))
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyAdapter.MyViewHolder(ItemMainBinding.inflate(layoutInflater.from(parent.context), parent, false))
    override fun getItemCount(): Int = datas.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("kkang", "onBindViewHolder : $position")
        val binding = (holder as MyAdapter.MyViewHolder).binding

        binding1.itemData.text = datas[position]

        binding1.itemRoot
    }
}

class MyAdapter(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class MyViewHolder(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}