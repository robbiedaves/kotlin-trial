package com.robbiedaves.kotlintrial.delegates.delegateproperties


fun main(args: Array<String>) {
    val e = RobExample()
    println("Getting...")
    println(e.p)
    println(e.i)
    println(e.r)
    println(e.x)
    println("Setting...")
    e.p = "Robxx"
    e.i = 10
    e.r = "RobDelegateStuff"
    e.x = "robxx xxx set"
    println(e.p)
    println(e.i)
    println(e.r)
    println(e.x)
}