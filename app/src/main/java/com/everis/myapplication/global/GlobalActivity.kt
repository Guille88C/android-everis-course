package com.everis.myapplication.global

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everis.myapplication.R
import com.everis.myapplication.global.camera.GlobalCameraFragment
import com.everis.myapplication.global.list.GlobalListFragment
import com.everis.myapplication.global.main.GlobalMainFragment
import com.everis.myapplication.global.profile.GlobalProfileFragment
import com.everis.myapplication.global.tutorial.GlobalTutorialFragment
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
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flGlobalContainer, GlobalListFragment.newInstance())
                        .commit()
                    true
                }

                R.id.action_tutorial -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flGlobalContainer, GlobalTutorialFragment.newInstance())
                        .commit()

                    true
                }

                R.id.action_main -> {
                    showMainView()

                    true
                }

                R.id.action_camera -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flGlobalContainer, GlobalCameraFragment.newInstance())
                        .commit()

                    true
                }
                R.id.action_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flGlobalContainer, GlobalProfileFragment.newInstance())
                        .commit()

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
