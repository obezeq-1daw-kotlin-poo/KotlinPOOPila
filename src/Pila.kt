class Pila<T> (val desc: String) {

    private val elementos = mutableListOf<T>()

    constructor(desc: String, vararg elementos: T) : this(desc) {
        for (elemento in elementos) {
            this.elementos.add(elemento)
        }
    }

    private fun size() = elementos.size
    private fun isEmpty() = size() == 0

    fun pop() : T? {
        if(!isEmpty()) {
            val ultimoElemento = elementos[size() - 1]
            elementos.removeAt(size() - 1)
            return ultimoElemento
        } else {
            return null
        }
    }

    fun push(elemento: T?): Boolean {
        if (elemento != null) {
            elementos.add(elemento)
            return true
        } else {

        }
    }
}