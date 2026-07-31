package test;

import static org.junit.Assert.*;

import org.junit.*;

import hello.*;

public class HelloTest {
    @Test 
    public void test1(){
        Hello hello = new Hello();
        assertTrue(hello.talk().contains("Ahhhh"));
    }

    @Test 
    public void test2(){
        Hello hello = new Hello();
        assertTrue(hello.talk().equals("Ahhhh!"));
    }
    
}