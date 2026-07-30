package test;

import static org.junit.Assert.*;

import org.junit.*;

import hello.*;

public class HelloTest {
    @Test 
    public void test1(){
        Hello hello = new Hello();
        assertEquals("Ahhhh!", hello.talk());
    }
}
