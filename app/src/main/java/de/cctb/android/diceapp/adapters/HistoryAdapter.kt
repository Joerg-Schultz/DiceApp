package de.cctb.android.diceapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.cctb.android.diceapp.databinding.HistoryItemBinding

// https://developer.android.com/guide/topics/ui/layout/recyclerview
class HistoryAdapter(private val dataSet: List<Int>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: HistoryItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryAdapter.ViewHolder {
        val binding = HistoryItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryAdapter.ViewHolder, position: Int) {
        holder.binding.tvNumberitem.text = dataSet[position].toString()
    }

    override fun getItemCount(): Int = dataSet.size
}