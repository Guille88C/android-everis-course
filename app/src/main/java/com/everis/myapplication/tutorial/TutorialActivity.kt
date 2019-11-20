package com.everis.myapplication.tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        vpTutorial?.adapter = TutorialAdapter(fm = supportFragmentManager)
        tlTutorial?.setupWithViewPager(vpTutorial)
    }
}
