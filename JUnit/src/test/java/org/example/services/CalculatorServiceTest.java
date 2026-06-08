//package org.example.services;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases");
//        System.out.println("Started test"+ new Date());
//    }
//    @Test
//    public void addTwoNumbersTest(){
//        int result= CalculatorService.addTwoNumber(10,12);
//        int expected=22;
//        Assert.assertEquals(expected, result);
//    }
//
// @Test
//    public void sumAnyNumberTest(){
//        int result=CalculatorService.sumAnyNumber(2,7,8,9);
//        int expected_result=26;
//        Assert.assertEquals(expected_result,result);
//    }
//    @AfterClass
//    public static void cleanUp(){
//        System.out.println("After all test cases");
//        System.out.println("End test cases"+ new Date());
//    }
//
//
//}
