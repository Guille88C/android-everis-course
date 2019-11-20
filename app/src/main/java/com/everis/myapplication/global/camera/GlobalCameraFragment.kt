package com.everis.myapplication.global.camera


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.everis.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class GlobalCameraFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_camera, container, false)
    }

    companion object {
        fun newInstance(): GlobalCameraFragment = GlobalCameraFragment()
    }
}
