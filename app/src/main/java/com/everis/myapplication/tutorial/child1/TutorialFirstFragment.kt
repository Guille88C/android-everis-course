package com.everis.myapplication.tutorial.child1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class TutorialFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorial_first, container, false)
    }

    companion object {
        fun newInstance(): TutorialFirstFragment = TutorialFirstFragment()
    }
}
