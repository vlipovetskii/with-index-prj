package vlfsoft

import org.junit.jupiter.api.Test
import java.util.*

class WithIndexTest {

    /**
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-indexed-value/index.html
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/with-index.html
     */
    @Test
    fun okTest() {
        // https://dzone.com/articles/streams-vs-decorators
        // Let's say we have a collection of measurements coming in from some data source, they are all numbers between zero and one:
        // Now, we need to show only the first 10 of them, ignoring zeros and ones, and re-scaling them to (0..100).
        probes(20).take(10).filter{it -> it != 0.0 && it != 1.0}.withIndex().forEach { it -> println("Probe #${it.index}: ${it.value * 100.0}") }
    }

}