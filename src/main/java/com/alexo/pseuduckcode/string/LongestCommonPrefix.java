package com.alexo.pseuduckcode.string;

public class LongestCommonPrefix {

    public String solution(String[] str) {

        int index = 0;
        StringBuilder longestCommonPrefix = new StringBuilder();

        for(char c : str[0].toCharArray()) {
            for(int i = 1; i < str.length; i++) {

                if(index >= str[i].length() || c != str[i].charAt(index)) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(c);
            index++;
        }

        return longestCommonPrefix.toString();
    }
}
