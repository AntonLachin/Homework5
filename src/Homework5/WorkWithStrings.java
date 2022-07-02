package Homework5;

public class WorkWithStrings {
    /**
     * 5.1 Поиск самого длинного слова с исключением знаков препинания
     */
    public static String searchForLongest(String string) {
        int i = 0;
        int j = 0;

        string = string.replace(".", " ");
        string = string.replace(",", " ");
        string = string.replace(";", " ");
        string = string.replace(":", " ");
        string = string.replace("!", " ");
        string = string.replace("?", " ");

        String[] words = string.split(" ");

        while (i <= words.length - 1) {
            if (words[i].length() >= words[j].length()) {
                j++;
                if (i == j) j++;
                if (j == words.length) {
                    System.out.println("Самое длинное слово - " + words[i] + ". Его длина - " + words[i].length() +
                            " символов");
                    break;
                }
            } else i++;
        }
        return string;
    }
    /**
     * 5.2 Поиск слов-палиндромов
     */
    public static StringBuilder ifPalindrome(StringBuilder stringBuilder) {

        if (stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString())) {
            System.out.println("Слово " + stringBuilder + " - палиндром!");
        } else System.out.println("Слово " + stringBuilder + " - не палиндром...");

        return stringBuilder;
    }
    /**
     * 5.3 Цензурирование текста
     */
    public static String someСensor(String text, String word) {
        StringBuilder censored = new StringBuilder();
        String replacement = "[censored]";
        for (String s : text.split(" ")) {
            if (s.equalsIgnoreCase(word)) {
                censored.append(replacement);
            } else if (s.toLowerCase().contains(word.toLowerCase())) {
                int beginIndex = s.toLowerCase().indexOf(word.toLowerCase());
                String substring = s.substring(beginIndex, word.length() + beginIndex);
                String s1 = s.replaceAll(substring, replacement);
                censored.append(s1);
            } else {
                censored.append(s);
            }
            censored.append(" ");
        }
        System.out.println(censored);

        return censored.toString();
    }
    /**
     * 5.4 Поиск количества вхождений
     */
    public static String howMuchSubstrings(String text, String substring) {
        int i = 1;
        if (text.endsWith(substring)) i--;
        String[] parts = text.split(substring);
        System.out.println(parts.length - i);
        return text;
    }
    /**
     * 5.5 Инвентирующий слова в строке метод
     */
    public static String invertedStrings(String string) {
        int i = 0;
        String stringReverse = " ";
        System.out.println(string);
        String[] parts = string.split(" ");
        while (i < parts.length) {
            StringBuilder word = new StringBuilder(parts[i]);
            parts[i] = String.valueOf(word.reverse());
            stringReverse = stringReverse.concat(parts[i] + " ");
            i++;
        }

        System.out.println(stringReverse.trim());

        return string;
    }
}
