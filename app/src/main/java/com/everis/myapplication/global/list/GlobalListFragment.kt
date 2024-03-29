package com.everis.myapplication.global.list


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.fragment_global_list.*

/**
 * A simple [Fragment] subclass.
 */
class GlobalListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bGlobalList?.setOnClickListener {
            // TODO: Navigate to ListActivity.
        }
    }

    companion object {
        fun newInstance(): GlobalListFragment = GlobalListFragment()
    }
}
