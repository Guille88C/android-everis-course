package com.everis.myapplication.tutorial.child2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class TutorialSecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorial_second, container, false)
    }

    companion object {
        fun newInstance(): TutorialSecondFragment = TutorialSecondFragment()
    }
}