package dip

import dip.abstracts.Service
import dip.abstracts.ServiceFactory

class Application(concreteFactory: ServiceFactory) {

    var service: Service
    var factory: ServiceFactory

    init {
        factory = concreteFactory
        service = factory.makeService("DIP Application")
    }

    fun startDIP() {
        service.run()
    }
}