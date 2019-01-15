package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a program to find the number of counts in the following String . Store the output in
 * Map< String ,Integer> as key value pair.
 * Input : String str = “one one -one___two,,three,one @three*one?two”;
 * Output : {"one":5 , "two":2, "three" :2}
 */
public class CountString {

    /*Method to count the number of word in a given string */
    public HashMap<String, Integer> countString(String str, ArrayList<String> countWord){
        HashMap<String, Integer> countString = new HashMap<String,Integer>();
        String[] strWord = str.split("\\s");

        /*Loop to iterate through each word to be counted in the string*/
        for(int i=0; i<countWord.size();i++) {
            String wordCount = countWord.get(i);
            int count = 0;

            /*Loop to iterate through each word in the input string*/
            for (String word : strWord) {
                if(word.contains(wordCount)){
                    count++;
                    countString.put(wordCount,count); //Update the word count map.
                }
            }
        }
        return countString;
    }
}
