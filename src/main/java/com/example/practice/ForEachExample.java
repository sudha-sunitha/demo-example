/**
 * @author Sudha.b@tadigital.com
 */
package com.example.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ForEachExample {
	 public static void main(String[] args) {  
	 List<String> gamesList = new ArrayList<String>();	 
	 gamesList.add("FootBall");
	 gamesList.add("Cricket");  
     gamesList.add("Chess");  
     gamesList.add("Hocky");  
     System.out.println("------------Iterating by passing lambda expression--------------");  
     //gamesList.forEach(g->System.out.println(g));
     gamesList.forEach(System.out::println);
     }
}
