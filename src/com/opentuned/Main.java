package com.opentuned;

import com.opentuned.dataStructures.Stack.FixedSizeStack;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        FixedSizeStack stack = new FixedSizeStack(size);
        for(int i = 0; i < size; i++){
            stack.push(Integer.toString(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }


}
