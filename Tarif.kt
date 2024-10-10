package com.example.fitness.ui.theme

class Tarif {
    var name: String? = null
    var info: String? = null
    var cost: Int? = 0
    var cost_txt: String? = null
    var cell: String? = null

    constructor(){}

    constructor(name: String?, info: String?, cost: Int, cost_txt: String?, cell:String?){
        this.name = name
        this.info = info
        this.cost = cost
        this.cost_txt = cost_txt
        this.cell = cell
    }

}
