package com.everis.myapplication.global.tutorial


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import com.everis.myapplication.tutorial.TutorialActivity
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
            startActivity(Intent(context, TutorialActivity::class.java))
        }
    }

    companion object {
        fun newInstance(): GlobalTutorialFragment = GlobalTutorialFragment()
    }
}
