package com.playground.dojo.debug2

import androidx.recyclerview.widget.DiffUtil

class MyDiffUtil(
    private val oldList: ArrayList<CountryAndCapital>,
    private val newList: ArrayList<CountryAndCapital>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].country == newList[newItemPosition].country
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            oldList[oldItemPosition].country != newList[newItemPosition].country -> {
                false
            }
            oldList[oldItemPosition].capital != newList[newItemPosition].capital -> {
                false
            }
            else -> true
        }
    }
}