package com.everis.myapplication.global.profile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.fragment_global_profile.*

/**
 * A simple [Fragment] subclass.
 */
class GlobalProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bGlobalProfile?.setOnClickListener {
            // TODO
        }
    }

    companion object {
        fun newInstance(): GlobalProfileFragment = GlobalProfileFragment()
    }
}
