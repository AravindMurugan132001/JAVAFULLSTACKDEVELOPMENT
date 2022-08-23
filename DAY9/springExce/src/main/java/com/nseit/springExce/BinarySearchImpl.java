package com.nseit.springExce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numToFind) {
        int [] sortedNumbers = sortAlg.sort(numbers);

        System.out.println(sortAlg);

        return 5;
    }
}
