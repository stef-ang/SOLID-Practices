package dip.concretes

import dip.abstracts.Service
import dip.abstracts.ServiceFactory

class ServiceFactoryImpl : ServiceFactory {
    override fun makeService(code: String): Service {
        println("Service is created")
        return ConcreteService(code)
    }
}