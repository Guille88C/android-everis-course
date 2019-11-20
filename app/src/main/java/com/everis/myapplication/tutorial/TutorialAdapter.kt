package com.everis.myapplication.tutorial

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.everis.myapplication.tutorial.child1.TutorialFirstFragment
import com.everis.myapplication.tutorial.child2.TutorialSecondFragment

class TutorialAdapter(fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    private val lFragments = arrayListOf(
        TutorialFirstFragment.newInstance(),
        TutorialSecondFragment.newInstance()
    )

    private val lTitles = arrayListOf("Tab 1", "Tab 2")

    override fun getItem(position: Int): Fragment {
        return lFragments[position]
    }

    override fun getCount(): Int = lFragments.size

    override fun getPageTitle(position: Int): CharSequence? {
        return lTitles[position]
    }
}