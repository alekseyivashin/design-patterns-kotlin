package factory

class Factory {

    enum class ProductType(val productInstance: Product) {
        COFFEE(Coffee()),
        TEA(Tea())
    }

    fun getProduct(type: ProductType) = ProductType.values().find { it == type }?.productInstance
}