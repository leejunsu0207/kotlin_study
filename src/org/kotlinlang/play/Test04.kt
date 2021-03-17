package org.kotlinlang.play

import kotlin.math.E

class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer();

    val contact = Contact(1, "https://lejljs.tistory.com")

    println(contact.id)
    contact.email = ""

    println(MutableStack(3).push(4))
    println(MutableStack(1).peek())
    println(MutableStack(2).pop())
    println(MutableStack(2).size())

    val stack = mutableStackOf(0.63,3.14,2.7)
    println(stack)
}

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"

}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
