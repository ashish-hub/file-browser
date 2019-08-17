package com.example.videoplayer

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    var ara = mutableListOf<Int>()
    for (i in 0 until n) { ara.add(i,ar[i]) }
    println("$ara")

    var start = 0
    var end = n
    var count = 0
    while ( start+1 < end ) {

        println("step 1")
        for (i in start+1 until end)
        {
            println("$ara")
            println("step 2")
            if ( ara[start] == ara[i] ) { ara.removeAt(start); ara.removeAt(i); end-=2; count+=1; println("step 3"); break }

            println("step 5")
        }
        start+=1; println("step 4")

    }

    println("step 6")
    return count

}






fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
