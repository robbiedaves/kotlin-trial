package com.robbiedaves.kotlintrial.delegates.delegateproperties

import kotlin.reflect.KProperty

class RobDelegateC {

    operator fun getValue(thisRef :RobClass?, property: KProperty<*>) :String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
    operator fun setValue(thisRef: RobClass?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}