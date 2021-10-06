/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author User
 */
public class Stack<R>{
    public R[] data;
    public int top = 0;
    
    public Stack(int a){
        data = (R[]) new Object [a];
    }
    
    public boolean isEmpty(){
        return top == 0;
    }
    
   
    public boolean isFull (){
        return top == data.length;
    }
   
    public void push(T value){
        if ( !isFull()){
            data [ top ] = value;
            top = top + 1;
        }else{
            System.out.println("Stack Sudah Penuh !");
        }
    }
    
    public R pop (){
    if ( !isEmpty ()){
        top = top - 1;
        R vl = data[top];
        return vl;
    }else{
        return null;
    }
    }
    
    public R peek (){
        if ( !isEmpty ()){
            return data[top - 1];
        }else{
            return null;
        }
        }
    }

