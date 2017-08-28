package com.robbiedaves.kotlintrial.delegates.delegateproperties

class RobExample : RobClass() {
    var p: String by RobDelegate()
    var i: Int by RobDelegateB()
    var r: String by RobDelegateC()
    var x: String by RobDelegateProvider()
}