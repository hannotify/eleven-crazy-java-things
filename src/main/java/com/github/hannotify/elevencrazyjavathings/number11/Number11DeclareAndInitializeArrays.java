package com.github.hannotify.elevencrazyjavathings.number11;

import java.util.List;

public class Number11DeclareAndInitializeArrays {
    static int[] varArray() {
        int[] elements = new int[2];
        return elements;
    }

    static List<int[]> cStyleArray() {
        int array1[], array2;

        array1 = new int[1];
        //array2 = new int[1];

        return List.of(array1);
    }
}
