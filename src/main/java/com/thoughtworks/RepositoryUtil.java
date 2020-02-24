package com.thoughtworks;

import java.util.List;

public class RepositoryUtil {
    public static <E> void printList(List<E> entities) {
        String result = "";
        for (E entity : entities) {
            result += entity + ",";
        }
        if (result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }
}
