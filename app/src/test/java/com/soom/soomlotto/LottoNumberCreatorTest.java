package com.soom.soomlotto;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by jshwang on 2018-03-29.
 */

public class LottoNumberCreatorTest {
    List<Integer> numbers;
    @Before
    public void before(){
        numbers = Arrays.asList(
                9, 28, 16, 7, 19, 12, 24, 16, 5, 8,
                40, 1, 5, 5, 4, 14, 16, 7, 23, 42, 10, 31, 3,
                2, 8, 16, 5, 19, 45, 8, 27, 12, 5, 10, 3, 15, 15,
                6, 23, 36, 10, 1, 1, 10, 9, 9, 4, 19, 36, 7, 28,
                11, 5, 5, 2, 13, 6, 5, 23, 30, 8, 31, 24, 12, 9, 18,
                3, 19, 27, 6, 27, 7, 28, 1, 13, 3, 4, 23, 24, 8, 1,
                8, 11, 9, 9, 18, 2, 2, 32, 2
        );

    }
    @Test
    public void distinctNumberTest(){
        List<Integer> distinctNumbers = distinctNumbers(numbers);
        System.out.println(distinctNumbers);
        System.out.println(distinctNumbers.size());
    }

    @Test
    public void shuffleNumberTest(){
        List<Integer> distinctNumbers = distinctNumbers(numbers);
        System.out.println(distinctNumbers);
        Collections.shuffle(distinctNumbers, new Random());
        System.out.println(distinctNumbers);
        System.out.println(distinctNumbers.get(0));
    }

    private List<Integer> distinctNumbers(List<Integer> numbers){

        HashSet<Integer> distinctNumbers = new HashSet<>(numbers);

        return new ArrayList<>(distinctNumbers);
    }

    private void shuffleNumbers(List<Integer> numbers){

    }
}
