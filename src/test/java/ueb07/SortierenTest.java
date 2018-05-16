package ueb07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;


class SortierenTest {

    @Test
    void swap() {
        Integer[] a = {1, 2, 3, 4, 5};
        Sortieren.swap(a, 0, 3);


        Assertions.assertTrue(4 == a[0]);

        Integer[] unsorted = {3,2,1,8,7,9,4};
        Integer[] sorted = {1,2,3,4,7,8,9};

        Sortieren.bubbleSort(unsorted, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(Arrays.toString(unsorted));

        assertEquals(Arrays.toString(sorted), Arrays.toString(unsorted));
    }
}