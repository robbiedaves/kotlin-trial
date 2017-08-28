package com.robbiedaves.kotlintrial.delegates

import com.sun.org.apache.xpath.internal.operations.Bool

// This is taken from http://codemonkeyism.com/exploring-delegation-in-kotlin/

interface HasName {
    fun getName():String
}

class PersonA(): HasName {
    override fun getName(): String {
        return "Stephan"
    }
}

fun main(args: Array<String>) {
    val p = PersonA()
    // prints Stephan
    println(p.getName())
}

// How would we use the HasName interface

// we could do this
fun goodNameA(p:PersonA) : Boolean {
    return p.getName() == "Stephan"
}

// This function depends on Person. What about other things that have names like Animals!
// Re-write the code like this...
fun goodNameB(n: HasName) : Boolean {
    return n.getName() == "Stephan"
}
// This is much more re-usable :)

// Inside our Person class, we have code for HasName
// It would be nicer to reuse the functionality from somewhere else

// In Kotlin, we can use delegate interfaces
class NameMixin(val n:String) : HasName {
    override fun getName() = n
}

class PersonWithMixinA(n:NameMixin): HasName by n {
}

fun testPersonMixinA() {
    val p = PersonWithMixinA(NameMixin("Stephan"))
    // Prints Stephan
    println(p.getName())
}

// This looks a little bad as th user of PersonWithMixinA
//  needs to know about the NameMixin. We can improve...
class PersonWithMixinB(n:String): HasName by NameMixin(n) {
}

fun testPersonMixinB() {
    val p = PersonWithMixinB("Stephan")
    // Prints Stephan
    println(p.getName())
}

// This looks cleaner as the consumer of Person doesn't know about NameMixin

// Kotlin can also use data classes
interface HasNameB {
    val name: String
}
data class NameMixinB(override val name: String): HasNameB
class PersonWithMixinC(named: HasNameB) : HasNameB by named

//...

