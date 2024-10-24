//тут
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
