import com.robbiedaves.kotlintrial.customer.UseCustomer

/*
 * Block Comments
 */

// Comments

// Main function
fun main(args : Array<String>){
    println("Hello World")
    println("Sum of 3 + 4 = ${sum(3, 4 )}")
    printSum(3, 4)
    printSum2(3, 4)
    stringTemplates()
    println("Max of 3 and 4 = ${maxOf(3, 4)}")
    println("Max of 3 and 4 = ${maxOf2(3, 4)}")
    forLoops()
    whileLoops()
    println(describe(1))
    println(describe("Hello"))
    println(describe("String"))
    println(describe(3))
    val a : Long = 222
    println(describe(a))
    usingRanges()
    usingCollections()
    val customerTest = UseCustomer()
    customerTest.testCustomer()
}


// A function taking 2 integers and returning the result
fun sum(a: Int, b: Int) : Int {
    return a + b
}

// If no return value is required then use Unit (it can be omitted
fun printSum(a: Int, b: Int) : Unit {
    println("Sum of $a + $b = ${a + b}")
}
fun printSum2(a: Int, b: Int) {
    println("Sum of $a + $b = ${a + b}")
}


// Local variables
fun localVariables() {
    // Assign once (read only) local variables
    val a:Int = 1   // immediate assignment
    val b = 2       // 'Int' type is inferred
    val c:Int       // Type required when no initializer is provided
    c = 3           // deferred assignment

    // Mutable variables
    var x = 5       // 'Int' type is inferred
    x += 1
}


// String Templates
fun stringTemplates() {
    var a = 1
    // Simple name in template
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s1)
    println(s2)
}

fun maxOf(a: Int, b: Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

// For Loops
fun forLoops() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items){
        println(item)
    }

    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
}

// While loops
fun whileLoops() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item as $index is ${items[index]}")
        index++
    }
}

// When expressions
fun describe(obj: Any) : String =
    when (obj) {
        1           ->  "One"
        "Hello"     ->  "Greeting"
        is Long     ->  "Long"
        !is String  ->  "Not a String"
        else        ->  "Unknown"
    }

// Using ranges
fun usingRanges() {
    // check if a number is within a range using in operator
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("Fits in range")
    }

    // check if number is out of range
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range to")
    }

    // iterate over a range
    for (x in 1..5) {
        print(x)
    }

    // or over a progression
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

// Collections
fun usingCollections() {
    // Iterate over a collection
    val items = listOf("apple", "banana", "orange", "kiwi")
    for (item in items) {
        println(item)
    }

    // checking if a collection contains an object using in operator
    when {
        "orange" in items   ->  println("Juicy")
        "apple" in items    ->  println("apple is fine too")
    }

    // Using lambda expressions to filer and map collections
    items
            .filter {it.startsWith("a")}
            .sortedBy {it}
            .map {it.toUpperCase()}
            .forEach{ println(it)}
}
