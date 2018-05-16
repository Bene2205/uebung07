package ueb07;

import java.util.Comparator;

public class Sortieren{

    public static <T> void swap(T[] a, int b, int c) {
        T merke = a[b];
        a[b] = a[c];
        a[c] = merke;
    }

    public static <T> void bubbleSort(T[] a, Comparator<T> comp) {
        for (int i = 0; i < a.length; i++) {
            for (int y = i+1; y < a.length; y++) {
                if (comp.compare(a[i], a[y]) > 0) {
                    swap(a, i, y);
                }
            }
        }
    }
}
