package com.everis.myapplication.list.list


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.everis.myapplication.R
import com.everis.myapplication.list.ListModel

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

        val lData: MutableList<ListModel> = getData()

        // TODO: Create ListAdapter and assign it to rvList.

        // TODO: When list row is pressed, navigate to DetailListFragment.
    }

    private fun getData(): MutableList<ListModel> {
        val lData: MutableList<ListModel> = ArrayList()
        lData.add(ListModel(title = "Item title 1", description = "Item description 1"))
        lData.add(ListModel(title = "Item title 2", description = "Item description 2"))
        lData.add(ListModel(title = "Item title 3", description = "Item description 3"))
        lData.add(ListModel(title = "Item title 4", description = "Item description 4"))
        lData.add(ListModel(title = "Item title 5", description = "Item description 5"))
        lData.add(ListModel(title = "Item title 6", description = "Item description 6"))
        lData.add(ListModel(title = "Item title 7", description = "Item description 7"))
        lData.add(ListModel(title = "Item title 8", description = "Item description 8"))
        lData.add(ListModel(title = "Item title 9", description = "Item description 9"))
        lData.add(ListModel(title = "Item title 10", description = "Item description 10"))
        return lData
    }

    companion object {
        fun newInstance() : ListFragment =
            ListFragment()
    }
}
