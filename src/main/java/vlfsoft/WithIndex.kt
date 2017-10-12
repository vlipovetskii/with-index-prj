package vlfsoft

import java.util.*

fun <T> withIndex(iterable : Iterable<T>) = iterable.withIndex()

fun probes(nProbes : Int) = generateSequence { Random().nextDouble() }.asIterable().take(nProbes)
