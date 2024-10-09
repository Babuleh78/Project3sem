package com.example.fitness.ui.theme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.R

class GymAdapter(val context: Context, private val gymList: List<Gym>) : RecyclerView.Adapter<GymAdapter.GymViewHolder>() {
    class GymViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gymMetro: TextView = itemView.findViewById(R.id.metro)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GymViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gym_info, parent, false)
        return GymViewHolder(view)
    }

    override fun onBindViewHolder(holder: GymViewHolder, position: Int) {
        // Проверка на то, что данная позиция доступна
        if (position >= 0 && position < gymList.size) {
            val currentGym = gymList[position]
            holder.gymMetro.text = currentGym.metro
            //holder.gymBath.text = if (currentGym.bath) "Сауна есть" else "Сауны нет"
        }
    }

    override fun getItemCount(): Int {
        return gymList.size
    }
}
