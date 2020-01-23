package com.example.fragmentstatepageadapter.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SectionsStatePagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private val mFragmentList: MutableList<Fragment> = mutableListOf()
    private val mTitleList: MutableList<String> = mutableListOf()

    fun addFragment(fragment: Fragment, title: String){
        mFragmentList.add(fragment)
        mTitleList.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }
}