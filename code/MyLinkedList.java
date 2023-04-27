package com.bridgelabz.workshop2.code;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void pushElement(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayElements(){
        //System.out.println("SIZE OF STACK IS: "+calculateSize());
        Node<T> temp = head;
        if(calculateSize() > 0) {
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
        }else{
            System.out.println("Empty");
        }
    }

    public int calculateSize(){
        Node<T> temp = head;
        Integer count = 0;
        if(head == tail && head != null){
            count = 1;
        }
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }

}
