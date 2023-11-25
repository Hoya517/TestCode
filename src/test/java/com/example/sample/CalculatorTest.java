package com.example.sample;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 1;
        String operator = "+";
        long num2 = 2;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(3, result);            // junit assertion
        assertThat(result).isEqualTo(3);    //assertj assertion
    }
    @Test
    public void 뺼셈_연산을_할_수_있다() {
        // given
        long num1 = 1;
        String operator = "-";
        long num2 = 2;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(-1, result);            // junit assertion
        assertThat(result).isEqualTo(-1);    //assertj assertion
    }
    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 1;
        String operator = "*";
        long num2 = 2;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(2, result);            // junit assertion
        assertThat(result).isEqualTo(2);    //assertj assertion
    }
    @Test
    public void 나눗셈_연산을_할_수_있다() {
        // given
        long num1 = 4;
        String operator = "/";
        long num2 = 2;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(2, result);            // junit assertion
        assertThat(result).isEqualTo(2);    //assertj assertion
    }
    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 4;
        String operator = "x";
        long num2 = 2;
        Calculator calculator = new Calculator();

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}