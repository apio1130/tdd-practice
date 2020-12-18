package com.sample.tdd;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("String 테스트")
class StringTest {

    @DisplayName("요구사항 1")
    @Nested
    class Request1 {
        @DisplayName("1,2의 ',' split 테스트")
        @Test
        void splitNormalCase() {
            String text = "1,2";
            String[] splitText = {"1", "2"};
            assertThat(text.split(",")).contains("1");
            assertThat(text.split(",")).contains("2");
            assertThat(text.split(",")).containsExactly(splitText);
        }

        @DisplayName("1의 ',' split 테스트")
        @Test
        void splitIgnoreCase() {
            String text = "1";
            assertThat(text.split(",")).contains(text);
            String[] splitText = {"1"};
            assertThat(text.split(",")).containsExactly(splitText);
        }
    }

    @DisplayName("요구사항 2")
    @Nested
    class Request2 {
        @DisplayName("substring 테스트")
        @Test
        void substringNormalCase() {
            String text = "(1,2)";
            String resultText = "1,2";
            assertThat(text.substring(1, text.length() - 1)).contains(resultText);
            assertThat(text.substring(1, text.length() - 1)).isEqualTo(resultText);
        }
    }

    @DisplayName("요구사항 3")
    @Nested
    class Request3 {
        @DisplayName("chatAt 정상 케이스 테스트")
        @Test
        void charAtNormalCase() {
            String text = "abc";
            assertThat(text.charAt(0)).isEqualTo('a');
        }

        @DisplayName("chatAt Exception 발생 케이스 테스트")
        @Test
        void charAtStringIndexOutOfBoundsException() {
            String text = "abc";
            assertThatThrownBy(() -> text.charAt(100)).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 100");
            assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> text.charAt(10)).withMessageMatching("String index out of range: \\d+");
        }
    }

}
