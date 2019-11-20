package com.everis.myapplication.global.browser


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import kotlinx.android.synthetic.main.fragment_global_browser.*


/**
 * A simple [Fragment] subclass.
 */
class GlobalBrowserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_browser, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bGlobalBrowser?.setOnClickListener {
            // TODO: Navigate to a external browser.
        }
    }

    companion object {
        fun newInstance(): GlobalBrowserFragment = GlobalBrowserFragment()
    }
}
