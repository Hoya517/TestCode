package com.example.sample;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CalculationRequestReaderTest {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다() {
        // given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        String[] result = calculationRequestReader.read();

        // then
        assertEquals("2", result[0]);
        assertEquals("+", result[1]);
        assertEquals("3", result[2]);
    }
}