package com.github.hannotify.elevencrazyjavathings.number5;

public class Number5CrazyStuffInSwitchStatements {
    public static String getEnergyLabelDescription(char energyLabel) {
        var description = "";

        switch (energyLabel) {
            case 'a':
                description = "Highly energy efficient.";
                break;
            case 'b':
                description = "Moderately energy efficient.";
                break;
            case 'c' | 'd':
                description = "Energy inefficient.";
                break;
            default:
                description = "Very energy inefficient.";
        }

        return description;
    }



    /*
    'c' = 99  = 1100011
    'd' = 100 = 1100100
    'c' | 'd' = 1100111  <== 103, same as 'g'.
    */
}
