package com.example.hackathon2023_7kiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.hackathon2023_7kiwi.databinding.ActivityNaviBinding

private const val TAG_BOARD = "BoardFragment"
private const val TAG_NOTICE = "NoticeFragment"
private const val TAG_MY_PAGE = "MyPageFragment"
class NaviActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(TAG_MY_PAGE, MyPageFragment())

        binding.navigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.boardFragment -> setFragment(TAG_BOARD, BoardFragment())
                R.id.noticeFragment -> setFragment(TAG_NOTICE, NoticeFragment())
                R.id.mypageFragment -> setFragment(TAG_MY_PAGE, MyPageFragment())
//                R.id.boardFragment -> startActivity(Intent(this, noticeBoard::class.java))
//                R.id.noticeFragment -> startActivity(Intent(this, noticeActivity::class.java))
//                R.id.mypageFragment -> startActivity(Intent(this, MyPageActivity::class.java))
            }
            true
        }
    }

    private fun setFragment(tag: String, fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val fragTransaction = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null){
            fragTransaction.add(R.id.mainFrameLayout, fragment, tag)
        }

        val board = manager.findFragmentByTag(TAG_BOARD)
        val notice = manager.findFragmentByTag(TAG_NOTICE)
        val myPage = manager.findFragmentByTag(TAG_MY_PAGE)

        if (board != null){
            fragTransaction.hide(board)
        }
        if (notice != null){
            fragTransaction.hide(notice)
        }
        if (myPage != null) {
            fragTransaction.hide(myPage)
        }

        if (tag == TAG_BOARD) {
            if (board!=null){
                fragTransaction.show(board)
            }
        }
        else if (tag == TAG_NOTICE) {
            if (notice != null) {
                fragTransaction.show(notice)
            }
        }
        else if (tag == TAG_MY_PAGE){
            if (myPage != null){
                fragTransaction.show(myPage)
            }
        }

        fragTransaction.commitAllowingStateLoss()
    }
}