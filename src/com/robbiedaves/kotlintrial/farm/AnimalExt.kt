package com.robbiedaves.kotlintrial.farm

fun Animal.talk() : String =
    when (this) {
    is Cow      ->  "Moo"
    is Dog      ->  "Woof"
    else        ->  "-"
}