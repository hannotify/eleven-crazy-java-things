package com.github.hannotify.elevencrazyjavathings;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#11 - A few freaky ways to declare and initialize arrays")
class Number11DeclareAndInitializeArraysTest {

    @Test
    @DisplayName("varArray() should return an int array of length 2")
    void varArray() {
        assertThat(Number11DeclareAndInitializeArrays.varArray()).hasSize(2);
    }

    @Test
    @DisplayName("cStyleArray() should return a List with two int arrays")
    void cStyleArray() {
        final List<int[]> list = Number11DeclareAndInitializeArrays.cStyleArray();

        assertThat(list).hasSize(2);
        assertThat(list).hasOnlyElementsOfType(int[].class);
    }
}