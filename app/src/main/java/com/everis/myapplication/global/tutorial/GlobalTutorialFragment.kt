package com.everis.myapplication.global.tutorial


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.fragment_global_tutorial.*

/**
 * A simple [Fragment] subclass.
 */
class GlobalTutorialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_tutorial, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bGlobalTutorial?.setOnClickListener {
            // TODO: Navigate to TutorialActivity
        }
    }

    companion object {
        fun newInstance(): GlobalTutorialFragment = GlobalTutorialFragment()
    }
}
