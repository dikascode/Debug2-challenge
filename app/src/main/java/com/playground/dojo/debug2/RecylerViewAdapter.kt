package com.playground.dojo.debug2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter(private var stateAndCapitals: ArrayList<CountryAndCapital>) :
    RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.apply {
            listPosition.text = (position + 1).toString()
            val text =
                "${stateAndCapitals[position].country} => ${stateAndCapitals[position].capital}"
            listTitle.text = text
        }

    }

    override fun getItemCount(): Int {
        return stateAndCapitals.size
    }

    fun setData(newCountryCapitalList: ArrayList<CountryAndCapital>) {
        val diffUtil = MyDiffUtil(stateAndCapitals, newCountryCapitalList)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        stateAndCapitals = newCountryCapitalList
        diffResults.dispatchUpdatesTo(this)
    }

}