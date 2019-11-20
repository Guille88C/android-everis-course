package com.everis.myapplication.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everis.myapplication.R
import com.everis.myapplication.list.list.ListFragment

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_list)

        supportFragmentManager.beginTransaction()
            .replace(R.id.flListContainer, ListFragment.newInstance())
            .commit()
    }
}
