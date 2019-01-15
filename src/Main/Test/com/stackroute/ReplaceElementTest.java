package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class ReplaceElementTest {

    ReplaceElement replaceElementTest;
    @Before
    public void setUp() throws Exception {
        replaceElementTest = new ReplaceElement();
    }

    @After
    public void tearDown() throws Exception {
        replaceElementTest =null;
    }

    @Test
    public void deleteElement(){
        //Arrange
        ArrayList<String> expectedValue = new ArrayList<String>();
        // Initialize an ArrayList with add()
        expectedValue.add("Kiwi");
        expectedValue.add("Grape");
        expectedValue.add("Mango");
        expectedValue.add("Berry");

        ArrayList<String> inputValue = new ArrayList<String>();
        // Initialize an ArrayList with add()
        inputValue.add("Apple");
        inputValue.add("Grape");
        inputValue.add("Melon");
        inputValue.add("Berry");

        HashMap<String,String> replaceElement = new HashMap<String,String>();
        replaceElement.put("Apple","Kiwi");
        replaceElement.put("Melon","Mango");

        //Act
        ArrayList<String> actualValue = replaceElementTest.deleteElement(inputValue,replaceElement);


        //Assert
        for(int i=0; i<expectedValue.size(); i++){
            Assert.assertEquals(expectedValue.get(i), actualValue.get(i));
        }
    }
}