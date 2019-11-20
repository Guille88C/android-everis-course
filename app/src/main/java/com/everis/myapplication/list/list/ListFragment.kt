package com.everis.myapplication.list.list


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import com.everis.myapplication.list.ListModel
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val lData: MutableList<ListModel> = ArrayList()
        lData.add(ListModel(title = "Item title 1", description = "Item description 1"))
        lData.add(ListModel(title = "Item title 2", description = "Item description 2"))
        lData.add(ListModel(title = "Item title 3", description = "Item description 3"))
        lData.add(ListModel(title = "Item title 4", description = "Item description 4"))

        rvList?.adapter = ListAdapter(lData = lData)
    }

    companion object {
        fun newInstance() : ListFragment =
            ListFragment()
    }
}
