package com.github.hannotify.elevencrazyjavathings.number3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static com.github.hannotify.elevencrazyjavathings.number3.Number3WrapperObjects.integerEquals;

@DisplayName("#3 - Wrapper objects: some are more equal than others")
class Number3WrapperObjectsTest {

    @Test
    @DisplayName("integerEquals() should return false when different arguments are passed")
    void integerEqualsShouldReturnFalseWithDifferentArguments() {
        assertThat(integerEquals(200, 300)).isFalse();
    }

    /*
    All wrapper objects are immutable.
    When you do `i++`, what actually happens is something like this:

        `i = Integer.valueOf( i.intValue()  + 1);`

    As you can see, a different Integer object is assigned back to i.
     */

    @Test
    @DisplayName("integerEquals() should return false when the same arguments (200) are passed")
    void integerEqualsShouldReturnFalseWith200() {
        assertThat(integerEquals(200, 200)).isFalse();
    }

    @Test
    @DisplayName("integerEquals() should return false when the same arguments (10) are passed")
    void integerEqualsShouldReturnFalseWith10() {
        assertThat(integerEquals(10, 10)).isFalse();
    }

    /*
    However, to save on memory, Java 'reuses' all the wrapper objects whose values fall in the following ranges:

    * All Boolean values (true and false)
    * All Byte values
    * All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal)
    * All Short and Integer values from -128 to 127

    So ==  will always return true when their primitive values are the same and belong to the above list of values.
     */
}