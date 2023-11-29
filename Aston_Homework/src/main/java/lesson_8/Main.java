package lesson_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words = {"смена", "программа", "взрыв", "поэт", "конфликт", "прокурор"
                , "программа", "взрыв", "артист", "князь", "взрыв", "программа",
                "конфликт", "артист", "нога", "программа", "артист"};

//Выводим все слова
        System.out.println(Arrays.toString(words));

//Выводим уникальные слова
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(Arrays.asList(words));

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

        System.out.println();

//Считаем количество повторений
        Map<String, Integer> wordsDuplicateCount = new HashMap<String, Integer>();
        ArrayList<String> wordsArray = new ArrayList<String>();
        wordsArray.add("смена");
        wordsArray.add("поэт");
        wordsArray.add("конфликт");
        wordsArray.add("прокурор");
        wordsArray.add("программа");
        wordsArray.add("взрыв");
        wordsArray.add("артист");
        wordsArray.add("князь");
        wordsArray.add("взрыв");
        wordsArray.add("программа");
        wordsArray.add("конфликт");
        wordsArray.add("артист");
        wordsArray.add("нога");
        wordsArray.add("программа");
        wordsArray.add("артист");

        for (int i = 0; i < wordsArray.size(); i++) {
            String hashWord = wordsArray.get(i);

            if (!wordsDuplicateCount.containsKey(hashWord)) {
                wordsDuplicateCount.put(hashWord, 1);
            } else {
                wordsDuplicateCount.put(hashWord, wordsDuplicateCount.get(hashWord) + 1);
            }
        }

        System.out.println("Количество повторений:");
        for (Map.Entry<String, Integer> entry : wordsDuplicateCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}