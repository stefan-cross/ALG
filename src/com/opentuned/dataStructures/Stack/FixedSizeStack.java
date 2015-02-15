package com.opentuned.dataStructures.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 21/01/2015
 * Time: 21:05
 */
public class FixedSizeStack {
    
    private String[] s;
    private int N = 0;
    
    public FixedSizeStack(int capacity){
        s = new String[capacity];
    }
    
    public boolean isEmpty(){
        return N == 0;
    }
    
    public void push(String item){
        s[N++] = item;
    }
    
    public String pop(){
        return s[--N];
    }

    // Implementation and interaction
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
