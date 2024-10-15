package com.example.fitness

import ProductAdapter
import TrainerAdapter
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.ui.theme.Gym
import com.example.fitness.ui.theme.GymAdapter
import com.example.fitness.ui.theme.Product
import com.example.fitness.ui.theme.Tarif
import com.example.fitness.ui.theme.TarifAdapter
import org.w3c.dom.Text
interface OnProductClickListener {
    fun onProductClick(product: Product)
}


class MainActivity : ComponentActivity(), OnProductClickListener{
    private lateinit var info_poduct: TextView
    private lateinit var product_image: ImageView
    private lateinit var productRecyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
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
        val productList = listOf(
            Product(R.drawable.kapusta, "Капуста"),
            Product(R.drawable.eggs, "Яйца"),
            Product(R.drawable.meat, "Мясо")
        )
        butt = findViewById(R.id.buttonfortest)
        butt.setOnClickListener(){
            setContentView(R.layout.about_products)
            productRecyclerView = findViewById(R.id.product_recycler_view)
            productAdapter = ProductAdapter(this, productList, this)



            productRecyclerView.adapter = productAdapter
            info_poduct = findViewById(R.id.product_text)

            productRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//            ДЛЯ ВИДЕО
//            setContentView(R.layout.trainer_info)
//
//
//                trainerView = findViewById(R.id.TrainerListView)
//
//                val videoUrls = listOf("android.resourse://" + packageName + "/" + R.raw.acdcdc)
//                trainerAdapter = TrainerAdapter(this, videoUrls)
//
//                trainerView.adapter = trainerAdapter
//            ДЛЯ ТАРИФОВ
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
    override fun onProductClick(product: Product) {
        info_poduct.text = product.productName
        
    }

}
