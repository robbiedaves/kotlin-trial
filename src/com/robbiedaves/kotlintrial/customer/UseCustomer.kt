package com.robbiedaves.kotlintrial.customer

class UseCustomer {

    fun testCustomer() {
        val c1 = Customer("John", "john@mail.com")
        val c2 = Customer("Paul", "paul@mail.com")
        val c3 = Customer("Ringo", "ringo@mail.com")

        val c4 = Customer("John", "john@mail.com")

        if (c1 == c4) {
            print("c1 ($c1) and c4 ($c4) are equal")
        }
    }

}