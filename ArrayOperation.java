package Lesson_9;
import java.util.*;
public class ArrayOperation {
        public static List<String> fillTheArray(List<String> array) {
            array.add("Книга");
            array.add("Стол");
            array.add("Стул");
            array.add("Лист");
            array.add("книга");
            array.add("стол");
            array.add("стул");
            array.add("Ручка*");
            array.add("Книга");
            array.add("Стул");
            array.add("Стул+");
            return array;
        }
        public static void printWords(List<String> array) {
            Set<String> tempArray = new LinkedHashSet<>();
            for (String arr : array) {
                String a = arr.toLowerCase();
                tempArray.add(a);
            }
            for (String tempArr : tempArray) {
                int count = 0;
                for (String arr : array) {
                    String a = arr.toLowerCase();
                    if(tempArr.equals(a)) count++;
                }
                System.out.println("\"" + tempArr + "\"" + " повторяется  = " + count +" раз(а) ");
            }
            System.out.println();
        }
    }
