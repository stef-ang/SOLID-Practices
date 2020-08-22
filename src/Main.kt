import dip.Application
import dip.concretes.ServiceFactoryImpl

fun main() {
    val dipApplication = Application(ServiceFactoryImpl())
    dipApplication.startDIP()
}