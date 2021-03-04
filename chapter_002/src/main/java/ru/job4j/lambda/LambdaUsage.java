package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right + " : " + left);
            return right.length() - left.length();
        };
        List<String> list2 = Arrays.asList("vas", "vasi", "v", "vasia");
        Collections.sort(list2, cmpDescSize);
        System.out.println(list2);
        Collections.sort(list2, cmpText);
        System.out.println(list2);
    }
}
