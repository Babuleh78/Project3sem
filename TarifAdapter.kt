package com.example.fitness.ui.theme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.R
import com.example.fitness.ui.theme.GymAdapter.GymViewHolder
class TarifAdapter(val context: Context, private val TarifList: List<Tarif>) : RecyclerView.Adapter<TarifAdapter.TarifViewHolder>(){
    class TarifViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tarifName)
        val cost: TextView = itemView.findViewById(R.id.tarifCost)
        val info: TextView = itemView.findViewById(R.id.tarifInfo)
        val cell: TextView = itemView.findViewById(R.id.tarifCell)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarifAdapter.TarifViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tarif, parent, false)
        return TarifViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarifAdapter.TarifViewHolder, position: Int) {
        if (position >= 0 && position < TarifList.size) {
            val currentTarif = TarifList[position]
            holder.cell.text = currentTarif.cell
            holder.info.text = currentTarif.info
            holder.name.text = currentTarif.name
            holder.cost.text = currentTarif.cost_txt
        }
    }

    override fun getItemCount(): Int {
        return TarifList.size
    }

}
