package com.sample.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

@DisplayName("Set Collection에 대한 TDD 테스트")
class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set의 크기 확인")
    void setSize() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("set의 값 존재 확인 - 존재")
    void setContainsNormalCase() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @Test
    @DisplayName("set의 값 존재 확인 - 존재 X")
    void setContainsNotFoundCase() {
        assertThat(numbers.contains(4)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("set의 값 존재 확인 - 중복코드 제거")
    void setContainsParameterizedTest(int numb) {
        assertThat(numbers.contains(numb)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("set의 값 존재 확인 - 다건")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void setContainsParameterizedTestCsvSource(Integer input, boolean expected) {
        boolean actualValue = numbers.contains(input);
        assertThat(actualValue).isEqualTo(expected);
    }

}
