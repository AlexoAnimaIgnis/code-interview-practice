package com.alexo.pseuduckcode.string;


public class VacuumCleanerRoute {

    public boolean returnToOriginalPosition(String moves) {
        int leftRightCtr = 0, upDownCtr = 0;

        for(int i = 0; i <= moves.length() -1; i++){
            char c = moves.charAt(i);

            if(c == 'L') {
                leftRightCtr++;
            } else if(c == 'R') {
                leftRightCtr--;
            } else if( c == 'U') {
                upDownCtr++;
            } else if( c == 'D') {
                upDownCtr--;
            }
        }

        return leftRightCtr == 0 && upDownCtr == 0;
    }
}
