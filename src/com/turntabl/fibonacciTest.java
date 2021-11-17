package com.turntabl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class fibonacciTest {
@Test
    public void fibonacciNumber(){
   assertEquals(List.of(0), fibonacci.fib(1));
}

@Test
    public void negativeFibNumber(){
    assertEquals(List.of(0), fibonacci.fib(-1));
}


}