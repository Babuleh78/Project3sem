package com.example.fitness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.ui.theme.Gym
import com.example.fitness.ui.theme.GymAdapter

class MainActivity : ComponentActivity() {
    private lateinit var gymRecyclerView: RecyclerView
    private lateinit var gymList: List<Gym>
    private lateinit var adapter: GymAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gym_info) // Замените на правильный layout с RecyclerView

        gymList = listOf(
            Gym("Строгино", true, true, true),
            // Добавьте дополнительные элементы по необходимости
        )

        // Настройка адаптера и RecyclerView
        adapter = GymAdapter(this, gymList)
        gymRecyclerView = findViewById(R.id.GymRecyclerView) // Убедитесь, что id совпадает с xml
        gymRecyclerView.layoutManager = LinearLayoutManager(this)
        gymRecyclerView.adapter = adapter
    }
}
