package com.playground.dojo.debug2

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition: TextView = itemView.findViewById(R.id.itemNumber)
    val listTitle: TextView = itemView.findViewById(R.id.itemString)

    init {
        itemView.setOnClickListener {
            Toast.makeText(it.context, "${listTitle.text}", Toast.LENGTH_SHORT).show()
        }
    }
}