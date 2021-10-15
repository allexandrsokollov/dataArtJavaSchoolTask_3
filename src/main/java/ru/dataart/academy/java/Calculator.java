package ru.dataart.academy.java;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return getReversedNumberFromList(firstNumber) + getReversedNumberFromList(secondNumber);
    }

    private Integer getReversedNumberFromList(List<Integer> number) {
        int num = 0;

        for(int i = 0; i < number.size(); i++) {
            num += Math.pow(10, i) * number.get(i);
        }

        return num;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {

        List<T> oddList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            if(isIntOdd(i + 1)) {
                oddList.add(list.get(i));
            }
        }

        return oddList;
    }

    private boolean isIntOdd(int num) {
        return num % 2 != 0;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        LinkedList<T> listOfBounds = new LinkedList<>();

        if(list.isEmpty()) {
            return listOfBounds;
        }

        listOfBounds.add(list.get(0));

        if(list.size() > 1) {
            listOfBounds.add(list.get(list.size() - 1));
        }
        return listOfBounds;
    }
}
