package com.alexo.pseuduckcode.string;

import java.util.Stack;

public class BackspaceCompare {

    public boolean twoPointers(String s, String t) {
        int p1 = s.length() -1;
        int p2 = t.length() -1;

        int bsCounter1 = 0;
        int bsCounter2 = 0;

        while(p1 >= 0 || p2 >= 0) {

            while(p1>=0) {
                if(s.charAt(p1) == '#') {
                    bsCounter1++;
                    p1--;
                } else if(bsCounter1 > 0) {
                    bsCounter1--;
                    p1--;
                } else {
                    break;
                }
            }

            while(p2>=0) {
                if(t.charAt(p2) == '#') {
                    bsCounter2++;
                    p2--;
                } else if(bsCounter2 > 0) {
                    bsCounter2--;
                    p2--;
                } else {
                    break;
                }
            }

            if(p1>= 0 && p2>=0 && s.charAt(p1) != t.charAt(p2)) {
                return false;
            }

            if((p1 >= 0) != (p2 >= 0)) {
                return false;
            }

        }


        return true;
    }

    public boolean solution(String s, String t) {

        return process(s).equalsIgnoreCase(process(t));
    }

    private String process(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if( c != '#') {
                stack.push(c);
            } else if(!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder processed = new StringBuilder();
        while(!stack.isEmpty()) {
            processed.append(stack.pop());
        }

        return processed.reverse().toString();
    }
}
