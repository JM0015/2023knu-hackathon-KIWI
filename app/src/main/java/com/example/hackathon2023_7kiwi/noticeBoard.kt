package com.example.hackathon2023_7kiwi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBoardBinding
import com.example.hackathon2023_7kiwi.databinding.ItemMainBinding

//var dataList = mutableListOf<datum>()

class noticeBoard : AppCompatActivity() {

    private val binding by lazy { ActivityNoticeBoardBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_board)
        setContentView(binding.root)
        //supportActionBar?.setTitle("Title")

        var data: Datum
        var dataList = mutableListOf<Datum>()
        for (i in 1..10) {
            data = Datum(i, "title ${i}", "content ${i}")
            dataList.add(data)
        }

        printRecycler(dataList)
    }

    private fun printRecycler(dataList: MutableList<Datum>) {
        // 1. 데이터를 불러온다
        //val data = dataList
        // 2. adapter 를 생성
        val customAdapter = CustomAdapter(dataList)
        // 3. 화면의 RecyclerView 와 연결
        binding.recyclerView.adapter = customAdapter
        // 4. 레이아웃 매니저 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

class CustomAdapter(private val dataList: MutableList<Datum>) : RecyclerView.Adapter<CustomAdapter.Holder>() {

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

    class Holder(val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {
        // 3. 받은 데이터를 화면에 출력한다.
        fun setTry(datum: Datum) {
            with(binding){
                index.text = "${datum.index}"
                itemTitle.text = "${datum.titles}"
                itemContent.text = "${datum.contents}"
            }
        }
    }
}

data class Datum(var index: Int, var titles: String, var contents: String)