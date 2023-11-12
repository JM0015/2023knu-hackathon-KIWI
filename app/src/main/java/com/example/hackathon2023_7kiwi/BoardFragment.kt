package com.example.hackathon2023_7kiwi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon2023_7kiwi.adapter.BoardAdapter
import com.example.hackathon2023_7kiwi.databinding.ActivityNoticeBoardBinding
import com.example.hackathon2023_7kiwi.dto.Datum

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BoardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 레이아웃을 인플레이트하고 바인딩 객체를 생성합니다.
        val binding = ActivityNoticeBoardBinding.inflate(inflater, container, false)

        val dataList = mutableListOf<Datum>()
        for (i in 1..10) {
            dataList.add(Datum("${i}", "title ${i}", "content ${i}"))
        }

        val boardAdapter = BoardAdapter(dataList)
        binding.recyclerView.adapter = boardAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        binding.additionBtn.setOnClickListener {
            startActivity(Intent(context, writingBoardActivity::class.java))
        }
        // 바인딩 객체의 root를 반환합니다.
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BoardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BoardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}