package com.example.fragmentstatepageadapter.fragments


import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.example.fragmentstatepageadapter.R
import com.example.fragmentstatepageadapter.activities.MainActivity
import com.example.fragmentstatepageadapter.activities.SecondActivity
import kotlinx.android.synthetic.main.fragment_one_layout.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentThree : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeUI()
    }

    private fun initializeUI() {
        button1.setOnClickListener {
            showToast(R.string.go_to_fgm1_txt)
            //navigate fo fragment method call
            (activity as MainActivity).setViewPager(0)
        }

        button2.setOnClickListener {
            showToast(R.string.go_to_fgm2_txt)
            //navigate fo fragment method call
            (activity as MainActivity).setViewPager(1)
        }

        button3.setOnClickListener {
            showToast(R.string.go_to_fgm3_txt)
            //navigate fo fragment method call
            (activity as MainActivity).setViewPager(2)
        }

        button4.setOnClickListener {
            showToast(R.string.go_to_second_act_txt)

            val intent = Intent(activity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showToast(stringResId: Int) {
        val message = Toast.makeText(activity, getString(stringResId), Toast.LENGTH_SHORT)
        message.setGravity(Gravity.BOTTOM, 0, 100)
        message.show()
    }
}
