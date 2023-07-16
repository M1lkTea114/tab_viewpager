package com.example.tab_viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tab_viewpager.adapter.MainViewPagerAdapter
import com.example.tab_viewpager.databinding.FragmentMainBinding

class MainFragment: Fragment() {

    private lateinit var mBinding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMainBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    private fun initView() {
        val adapter = MainViewPagerAdapter(this)
        mBinding.viewPager.adapter = adapter
    }
}