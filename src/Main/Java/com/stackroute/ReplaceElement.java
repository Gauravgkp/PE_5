package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a Java program to update specific array element by given element and empty the array list .
 */
public class ReplaceElement {
/* This method takes String array and a Mp of value to be replaced with.*/
    public ArrayList<String> deleteElement(ArrayList<String> inputValue, HashMap<String,String> replaceElement) {

        /*For loop to iterate over each key and replace with value */
        for (String key : replaceElement.keySet()) {
            String value = replaceElement.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
            /*For loop to find key and replace with value */
            for(int j=0; j<inputValue.size(); j++){
                if(inputValue.get(j).equals(key)){
                    inputValue.set(j,value); //Setting new value
                }
            }
        }
        return inputValue;
    }
}
