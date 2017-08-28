package com.robbiedaves.kotlintrial.delegates.delegateproperties

import kotlin.reflect.KProperty

class RobDelegateB {
    operator fun getValue(thisRef :Any?, property: KProperty<*>) :Int {
        return 5
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}