package com.everis.myapplication.list.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.everis.myapplication.R
import com.everis.myapplication.list.ListModel

class ListAdapter(private val lData: List<ListModel>) :
    RecyclerView.Adapter<ListAdapter.ListViewHoler>() {

    var itemPressed: ((ListModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHoler {
        return ListViewHoler(
            LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_list_row,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = lData.size

    override fun onBindViewHolder(holder: ListViewHoler, position: Int) {
        holder.bind(data = lData[position])
    }

    inner class ListViewHoler(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(data: ListModel) {
            itemView.findViewById<AppCompatTextView>(R.id.tvListRowTitle)?.let {
                it.text = data.title
            }

            itemView.findViewById<AppCompatTextView>(R.id.tvListRowDescription)?.let {
                it.text = data.description
            }

            itemView.setOnClickListener {
                itemPressed?.invoke(data)
            }
        }
    }
}