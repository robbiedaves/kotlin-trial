package com.robbiedaves.kotlintrial.farm

class Farm {

    var stock: List<Animal>

    init {
        var cow1 = Cow()
        var cow2 = Cow()
        this.stock = listOf(cow1, cow2)

        cow1.talk()
    }




}