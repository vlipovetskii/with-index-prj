package vlfsoft;

import org.junit.jupiter.api.Test;

import java.util.stream.StreamSupport;

class WithIndexJ {
    @Test
    void okTest() {
        // https://dzone.com/articles/streams-vs-decorators
        // Let's say we have a collection of measurements coming in from some data source, they are all numbers between zero and one:
        // Now, we need to show only the first 10 of them, ignoring zeros and ones, and re-scaling them to (0..100).
        StreamSupport.stream(WithIndexKt.withIndex(WithIndexKt.probes(20)).spliterator(), false ).limit(10).forEach(it -> System.out.printf("Probe #%d: %f\n", it.getIndex(), it.getValue() * 100.0));
    }

}
