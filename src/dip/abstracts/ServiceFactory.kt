package dip.abstracts

interface ServiceFactory {

    fun makeService(code: String): Service
}