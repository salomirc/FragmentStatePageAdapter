package com.example.fragmentstatepageadapter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentstatepageadapter.R
import com.example.fragmentstatepageadapter.adapters.SectionsStatePagerAdapter
import com.example.fragmentstatepageadapter.fragments.FragmentOne
import com.example.fragmentstatepageadapter.fragments.FragmentThree
import com.example.fragmentstatepageadapter.fragments.FragmentTwo
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG: String = "MainActivity"
//private lateinit var mSectionsStatePageAdapter: SectionsStatePagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Started")

        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = SectionsStatePagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentOne(), "Fragment 1")
        adapter.addFragment(FragmentTwo(), "Fragment 2")
        adapter.addFragment(FragmentThree(), "Fragment 3")

        mViewPager.adapter = adapter
    }

    fun setViewPager(fgmIndex: Int){
        mViewPager.setCurrentItem(fgmIndex, true)
    }
}
