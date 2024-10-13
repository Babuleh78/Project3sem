package com.example.fitness

import TrainerAdapter
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.ui.theme.Gym
import com.example.fitness.ui.theme.GymAdapter
import com.example.fitness.ui.theme.Tarif
import com.example.fitness.ui.theme.TarifAdapter

class MainActivity : ComponentActivity() {
    private lateinit var gymRecyclerView: RecyclerView
    private lateinit var tarifRecyclerView: RecyclerView
    private lateinit var gymList: List<Gym>
    private lateinit var adapter: GymAdapter
    private lateinit var tarifAdapter: TarifAdapter
    private lateinit var tarifList: List<Tarif>
    private lateinit var butt: Button
    private lateinit var trainerView: ListView
    private lateinit var trainerAdapter: TrainerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gym_info)

        butt = findViewById(R.id.buttonfortest)
        butt.setOnClickListener(){
            setContentView(R.layout.trainer_info)
                trainerView = findViewById(R.id.TrainerListView)

                val videoUrls = listOf("android.resourse://" + packageName + "/" + R.raw.acdcdc)
                trainerAdapter = TrainerAdapter(this, videoUrls)

                trainerView.adapter = trainerAdapter

//            setContentView(R.layout.tarif_info)
//            tarifAdapter = TarifAdapter(this, tarifList)
//            tarifRecyclerView = findViewById(R.id.TarifRecyclerView)
//            tarifRecyclerView.layoutManager = LinearLayoutManager(this)
//            tarifRecyclerView.adapter = tarifAdapter
        }
        gymList = listOf(
            Gym("Строгино", true, true, true),
            // Добавьте дополнительные элементы по необходимости
        )
        tarifList = listOf(
            Tarif("Стандарт", "Пошел нахуй", 78, "стоит 300 рэ", "Акций нихуя нет")
        )

        // Настройка адаптера и RecyclerView
        adapter = GymAdapter(this, gymList)

        gymRecyclerView = findViewById(R.id.GymRecyclerView) // Убедитесь, что id совпадает с xml
        gymRecyclerView.layoutManager = LinearLayoutManager(this)
        gymRecyclerView.adapter = adapter
    }
}
