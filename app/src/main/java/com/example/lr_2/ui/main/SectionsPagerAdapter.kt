package com.example.lr_2.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.lr_2.R
import com.example.lr_2.ui.MyFragment.MyFragment
import com.example.lr_2.ui.NewFrafmentFromTabbed.ListFragment
import com.example.lr_2.ui.NewFrafmentFromTabbed.NewTabbedFragment
import com.example.lr_2.ui.gallery.GalleryFragment
import com.example.lr_2.ui.home.HomeFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages instead of 2.
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NewTabbedFragment()
            1 -> ListFragment()
            else -> MyFragment()
        }
    }
}