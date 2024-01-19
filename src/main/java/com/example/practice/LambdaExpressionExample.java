/**
 * @author Sudha.b@tadigital.com
 */
package com.example.practice;

interface Drawable{  
   // public void draw();  
    public String say(String s);  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
		/*
		 * Drawable d=()->{ System.out.println("welcome"); };
		  
        d.draw();  */
        Drawable d1=(s)->{  
        	 return "Hello, "+s;  
         };
    }  
}  