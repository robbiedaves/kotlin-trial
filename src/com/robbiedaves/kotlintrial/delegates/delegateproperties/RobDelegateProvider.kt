package com.robbiedaves.kotlintrial.delegates.delegateproperties

import kotlin.reflect.KProperty

class RobDelegateProvider {

    operator fun provideDelegate(
            thisRef: RobClass,
            prop: KProperty<*>
    ) : RobDelegateC {
        val s = checkClass(thisRef)
        if (s.isNotBlank()) {
            println("ROBXX *** NON BLANK FOUND : $s")
        } else {
            println("ROBXX *** NO STRING FOUND ERROR!!!!!!")
        }
        return RobDelegateC()
    }

    private fun checkClass(rbc : RobClass) : String {
        return rbc.getRobClassText()
    }
}