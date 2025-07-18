package org.example;

public class App {
    private Dish[] stackArray;
    private int top;

    // constructor to initialize stack with max capacity
    public App(int capacity) {
        stackArray = new Dish[capacity];
        top = -1;
    }

    // push disk into stack
    public void push(Dish dish) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full. Cannot push: " + dish.description);
            return;
        }
        stackArray[++top] = dish;
    }

    // pop last dish from stack
    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    // peek top dish
    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    // current size
    public int size() {
        return top + 1;
    }
}
