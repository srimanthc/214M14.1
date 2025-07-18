package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testInitialSizeIsZero() {
        App stack = new App(5);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushAndSize() {
        App stack = new App(5);
        stack.push(new Dish("Dish 1"));
        stack.push(new Dish("Dish 2"));
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeek() {
        App stack = new App(5);
        Dish topDish = new Dish("Top Dish");
        stack.push(new Dish("Bottom Dish"));
        stack.push(topDish);
        assertEquals("Top Dish", stack.peek().description);
        assertEquals(2, stack.size()); // Make sure peek doesn't remove
    }

    @Test
    public void testPop() {
        App stack = new App(5);
        Dish dish1 = new Dish("First");
        Dish dish2 = new Dish("Second");
        stack.push(dish1);
        stack.push(dish2);
        assertEquals("Second", stack.pop().description);
        assertEquals("First", stack.pop().description);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopOnEmptyStack() {
        App stack = new App(5);
        assertNull(stack.pop());
    }

    @Test
    public void testPeekOnEmptyStack() {
        App stack = new App(5);
        assertNull(stack.peek());
    }

    @Test
    public void testPushOnFullStack() {
        App stack = new App(2);
        stack.push(new Dish("Dish 1"));
        stack.push(new Dish("Dish 2"));
        stack.push(new Dish("Dish 3")); // should be rejected
        assertEquals(2, stack.size());
        assertEquals("Dish 2", stack.peek().description);
    }
}
