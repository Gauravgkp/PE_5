package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountStringTest {

    CountString countString;
    @Before
    public void setUp() throws Exception {
        countString = new CountString();
    }

    @After
    public void tearDown() throws Exception {
        countString=null;
    }

    @Test
    public void countString(){
        //Arrange
        String str = "one one -one___two, ,three,one @three*one?two";
        ArrayList<String> countWord = new ArrayList<String>();
        countWord.add("one");
        countWord.add("two");
        countWord.add("three");
        countWord.add("four");

        //Act
        HashMap<String, Integer> actualValue = countString.countString(str,countWord);

        //Assert
        System.out.println(actualValue);

    }
}