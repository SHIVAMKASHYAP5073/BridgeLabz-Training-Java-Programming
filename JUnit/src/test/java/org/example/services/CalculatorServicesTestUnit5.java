package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServicesTestUnit5
{
  @Test
    public void addTwoNumbersTest(){
        int actualResult= CalculatorService.addTwoNumber(12,34);
        int expectedResult=46;
        Assertions.assertEquals(expectedResult,actualResult);


    }
    public void addAnyNumbersTest(){

    }

}
