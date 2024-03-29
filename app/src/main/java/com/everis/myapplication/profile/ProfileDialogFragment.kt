package com.everis.myapplication.profile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.everis.myapplication.R


/**
 * A simple [Fragment] subclass.
 */
class ProfileDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_dialog, container, false)
    }

    companion object {
        const val TAG = "ProfileDialogFragment"

        fun newInstance(): ProfileDialogFragment = ProfileDialogFragment()
    }
}
