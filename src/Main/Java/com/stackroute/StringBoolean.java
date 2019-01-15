package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a program where an array of strings is input and output is a Map< String ,boolean> where
 * each different string is a key and its value is true if that string appears 2 or more times in the array
 * Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 * Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
public class StringBoolean {

    /*Method to count the number of word in a given string */
    public HashMap<String, Boolean> countStringInput(String[] str){
        HashMap<String, Boolean> countString = new HashMap<String,Boolean>();

        /*Loop to iterate through each word to be counted in the string*/
        for(int i=0; i< str.length;i++) {
            String wordCount = str[i];
            int count = 0;
            /*Loop to iterate through each word in the input string*/
            for (String word : str) {
                if(word.contains(wordCount)) {
                    countString.put(wordCount, false);
                    count++;
                    if (count > 1) {
                        countString.put(wordCount, true); //Update the word count map.
                    }
                }
            }
        }
        return countString;
    }
}
