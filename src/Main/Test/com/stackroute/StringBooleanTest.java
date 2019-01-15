package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class StringBooleanTest {

    StringBoolean stringBoolean;
    @Before
    public void setUp() throws Exception {
        stringBoolean = new StringBoolean();
    }

    @After
    public void tearDown() throws Exception {
        stringBoolean = null;
    }

    @Test
    public void countString(){
        //Arrange
        String str[] = {"a","b","c","d","a","c","c"};
        ArrayList<String> countWord = new ArrayList<String>();
        countWord.add("one");
        countWord.add("two");
        countWord.add("three");
        countWord.add("four");

        //Act
        HashMap<String, Boolean> actualValue = stringBoolean.countStringInput(str);

        //Assert
        System.out.println(actualValue);

    }
}