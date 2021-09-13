package com.playground.dojo.debug2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter(private val stateAndCapitals: ArrayList<CountryAndCapital>) :
    RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.apply {
            listPosition.text = (position+1).toString()
            val text = "${stateAndCapitals[position].country} => ${stateAndCapitals[position].capital}"
            listTitle.text = text
        }

    }

    override fun getItemCount(): Int {
        return stateAndCapitals.size
    }

}