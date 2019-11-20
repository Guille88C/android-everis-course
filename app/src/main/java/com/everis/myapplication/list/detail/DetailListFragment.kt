package com.everis.myapplication.list.detail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import com.everis.myapplication.list.ListModel
import kotlinx.android.synthetic.main.fragment_detail_list.*

/**
 * A simple [Fragment] subclass.
 */
class DetailListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        arguments?.getParcelable<ListModel>(DATA)?.let { item ->
            tvDetailListTitle?.text = item.title
            tvDetailListDescription?.text = item.description
        }
    }

    companion object {
        const val TAG = "DetailListFragment"

        private const val DATA = "DATA"

        fun newInstance(data: ListModel): DetailListFragment =
            DetailListFragment().also { fragment ->
                fragment.arguments = Bundle().also { bundle ->
                    bundle.putParcelable(DATA, data)
                }
            }
    }
}
