package com.everis.myapplication.global

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everis.myapplication.R
import com.everis.myapplication.global.main.GlobalMainFragment
import kotlinx.android.synthetic.main.activity_global.*

class GlobalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_global)

        if (savedInstanceState == null) {
            bnvGlobal?.selectedItemId = R.id.action_main
            showMainView()
        }

        bnvGlobal?.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_list -> {
                    // TODO: Show GlobalListFragment.

                    true
                }

                R.id.action_tutorial -> {
                    // TODO: Show GlobalTutorialFragment.

                    true
                }

                R.id.action_main -> {
                    showMainView()

                    true
                }

                R.id.action_browser -> {
                    // TODO: Show GlobalBrowserFragment.

                    true
                }
                R.id.action_profile -> {
                    // TODO: Show GlobalProfileFragment.

                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun showMainView() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.flGlobalContainer, GlobalMainFragment.newInstance())
            .commit()
    }
}
