package com;

class one 
{ 
    public void print1() 
    { 
        System.out.println("Go"); 
    } 
} 
  
class two extends one 
{ 
    public void print2() 
    { 
        System.out.println("to School"); 
    } 
} 
// Driver class 
public class Inherit 
{ 
    public static void main(String[] args) 
    { 
        two g = new two(); 
        g.print1(); 
        g.print2(); 
        } 
} 



