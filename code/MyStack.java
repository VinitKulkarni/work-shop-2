package com.bridgelabz.workshop2.code;

public class MyStack<T> {
    MyLinkedList<T> linkedList;

    public MyStack(){
        this.linkedList = new MyLinkedList<>();
    }

    public void push(T data){
        linkedList.pushElement(data);
    }

    public void display(){
        linkedList.displayElements();
    }

}
