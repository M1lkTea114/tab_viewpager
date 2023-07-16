package com.example.tab_viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tab_viewpager.fragment.FirstFragment
import com.example.tab_viewpager.fragment.SecondFragment

class MainViewPagerAdapter(f: Fragment): FragmentStateAdapter(f) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> FirstFragment()
        }
    }
}