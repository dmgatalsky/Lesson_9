package Lesson_9;

import java.util.ArrayList;
import java.util.*;
//1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)
//2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
// номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class Lesson_9 {

    public static void main(String[] args) {

        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printWords(wordArray);
        wordArray.clear();
        System.out.println(wordArray + "\n");
        ArrayOperation.printWords(wordArray);

        PhoneBook phonebook = new PhoneBook();
        phonebook.add(1111111, "Иванов");
        phonebook.add(2222222, "Петров");
        phonebook.add(3333333, "Петров");
        phonebook.add(4444444, "Сидоров");
        phonebook.add(5555555, "Зайцев");
        phonebook.add(6666666, "Волков");

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
    }
}
