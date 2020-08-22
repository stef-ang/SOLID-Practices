package dip.concretes

import dip.abstracts.Service

class ConcreteService(val code: String) : Service {
    override fun run() {
        println(code)
    }
}