package com.nseit.springExce;

import org.springframework.stereotype.Component;

@Component
public class Quick implements SortAlg {

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
