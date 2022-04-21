package com.test.pracrice;

import java.util.LinkedHashMap;

public class LongestSubString {
    public static void longestSubString(String input)
    {
        char[] array = input.toCharArray();
        String longestsubString = null;
        int longestsubStringLength = 0;
        
        // Creating LinkedHashMap with characters as
        // keys and their position as values
        
        LinkedHashMap<Character,Integer> charPosMap = new LinkedHashMap<>();
        
        // looping through array
        
        for(int i = 0; i <array.length; i++)
        {
            char ch = array[i];
            
            // if ch not exits in charPosMap add it there with index value.
            
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
            
            // If ch is already present in charPosMap,
            // reposioning the cursor i to the position
            // of ch and clearing the charPosMap
            
            else
            {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            
            //Updating longestSubstring and longestSubstringLength
            
            if(charPosMap.size() > longestsubStringLength)
            {
                longestsubStringLength = charPosMap.size();
                longestsubString = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input: "+input);
        System.out.println("Longest Sub: "+longestsubString);
        System.out.println("Longest Sub Len: "+longestsubStringLength);
    }
    
    public static void main(String[] args) 
    {
        longestSubString("addac");        
    }
    
}

