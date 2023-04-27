package com.bridgelabz.workshop2.code;

//Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using
//the Linked List and Print the Anagrams in the Reverse Order. Note no Collection
//Library can be used.
//create linkedlist (add or push) & display method

public class MainMethod {
    static void primeNumber(int arrayData[]){
        int min = 0;
        int max = 1000;

        for(int value=min; value<=max; value++) {
            boolean flag = false;
            if (value == 0) {
                continue;
            }

            if (value == 1 || value == 2) {
                arrayData[value] = value;
                continue;
            }

            if (value >= 3) {
                for (int j = 2; j <= max / 2; j++) {
                    if (value % j == 0 && value != j) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                arrayData[value] = value;
            }
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack();

        int arrayData[] = new int[1000];
        primeNumber(arrayData);


        for(int i=0; i<1000; i++) {
            if(arrayData[i] != 0) {
                //if number is less than 10 then adding directly to stack
                if(arrayData[i] < 10){
                    stack1.push(arrayData[i]);
                }

                //if number is greater than 10
                //checking original & reverse value = if both are same then adding to stack
                if (arrayData[i] > 9) {
                    int originalNumber = arrayData[i];
                    int temp = arrayData[i];

                    int digit = 0;
                    int reverseResult = 0;

                    while(temp > 0) {
                        digit = temp % 10;
                        reverseResult = reverseResult * 10 + digit;
                        temp = temp / 10;
                    }
                    if(originalNumber == reverseResult){
                        stack1.push(originalNumber);
                    }
                }
            }
        }

        System.out.println("Elements of stack are:");
        stack1.display();
    }
}
