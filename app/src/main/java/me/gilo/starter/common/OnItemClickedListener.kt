package me.gilo.starter.common


import androidx.recyclerview.widget.RecyclerView

/**
 * Created by amrro <amr.elghobary></amr.elghobary>@gmail.com> on 9/15/17.
 * General interface callback for handling clicks inside [RecyclerView]
 */

interface OnItemClickedListener<T> {
    fun onClicked(item: T)
}
