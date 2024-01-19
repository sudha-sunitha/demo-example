package com.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.practice.Calculation;
@TestInstance(Lifecycle.PER_CLASS)
public class TestCase2 {
	@BeforeAll  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before ALL class");
    }  

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
    }
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        Assertions.assertEquals(4, Calculation.findMax(new int[]{1,3,4,2}));
        Assertions.assertEquals(-2, Calculation.findMax(new int[]{-12,-3,-4,-2}));

    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        Assertions.assertEquals(27, Calculation.cube(3));
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        Assertions.assertEquals("my name is khan", Calculation.reverseWord("ym eman si nahk").trim());
    }  
  /*  @After
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  */

}
