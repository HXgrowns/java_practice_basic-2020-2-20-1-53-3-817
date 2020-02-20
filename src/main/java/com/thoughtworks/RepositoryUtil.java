package com.thoughtworks;

import java.util.List;

public class RepositoryUtil {
    public static void printList(List entities) {
        String result = "";
        for (Object entity : entities) {
            result += entity + ",";
        }
        if (result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }
}
