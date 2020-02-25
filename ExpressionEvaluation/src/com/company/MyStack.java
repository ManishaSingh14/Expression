package com.company;


import java.util.EmptyStackException;

public class MyStack<T> {
    private int top;
    private T[] stackArray;
    public MyStack(int capacity) {
        if (capacity <=0 ) {
            throw new IllegalArgumentException("Your Capacity is Wrong! ");
        }
        else {
            stackArray = (T[])new Object[capacity];
            top = -1;
        }
    }
    public void push(T value) {
        if (top != stackArray.length - 1 ) {
            top++;
            stackArray[top] = value;
        }
        else
            System.out.println("Stack is Full");
    }
    public T peek() {
        return stackArray[top];
    }

    public void pop() {
        if(top == -1) {
            throw new EmptyStackException();
        }
        else {
            top--;
        }
    }
    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull() {
        if(top == stackArray.length - 1) {
            return true;
        }
        else {
            return false;
        }
    }
}


