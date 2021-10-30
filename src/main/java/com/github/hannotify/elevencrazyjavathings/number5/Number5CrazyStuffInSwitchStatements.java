package com.github.hannotify.elevencrazyjavathings.number5;

public class Number5CrazyStuffInSwitchStatements {
    public static String getTalkRatingDescription(char rating) {
        var description = "";

        switch (rating) {
            case 'a':
                description = "Great talk!";
                break;
            case 'b':
                description = "Good talk.";
                break;
            case 'c' | 'd':
                description = "Average talk.";
                break;
            default:
                description = "Bad talk.";
        }

        return description;
    }

    /*
    'c' = 99  = 1100011
    'd' = 100 = 1100100
    'c' | 'd' = 1100111  <== 103, same as 'g'.
    */
}
