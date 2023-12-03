package main.java.ru.treger78.Tests.utils;

import java.util.List;

public class Utils {
    public static void assertEquals(List list1, List list2) {
        if (!list1.equals(list2)) {
            throw new RuntimeException("List1: " + list1 + " not equals List2: " + list2);
        }
    }
}
