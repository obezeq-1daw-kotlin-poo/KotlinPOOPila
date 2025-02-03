fun main() {

    val pila1 = Pila<Int?>("Números enteros", 1, null, 5, null, 7, 89)

    val pila2 = Pila<Any>("Cajón desastre", listOf("123", null, "holi", 10.0, 'c'), patron = "^[a-z]+$")

    for (i in 1..pila1.size()) {
        println(pila1.pop())
    }

    println(pila1)

    println(pila2)

}