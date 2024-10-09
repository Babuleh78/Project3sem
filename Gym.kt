package com.example.fitness.ui.theme

import android.os.Message

class Gym {
    var metro: String? = null
    var bath: Boolean = true
    var pool: Boolean = true
    var massage: Boolean = true
    constructor(){}

    constructor(metro: String?, bath: Boolean, pool: Boolean, massage: Boolean){
        this.metro = metro
        this.bath = bath
        this.pool = pool
        this.massage = massage
    }
}
