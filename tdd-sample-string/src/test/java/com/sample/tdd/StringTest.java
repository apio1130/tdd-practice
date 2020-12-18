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
            String[] splitText = {"1","2"};
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

}
