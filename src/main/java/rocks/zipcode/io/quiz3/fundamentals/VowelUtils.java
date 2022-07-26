package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    VowelUtils vowel = new VowelUtils();
    public static Boolean hasVowels(String word) {

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i)=='e'||
            word.charAt(i)=='i' || word.charAt(i)=='o'||word.charAt(i)=='u'){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";

        String loweredWord = word.toLowerCase();
        for(int i = 0; i<loweredWord.length(); i++) {
            if (vowels.contains(String.valueOf(loweredWord.charAt(i)))) {
                return i;
            }
        }
        return -1;

    }


    public static Boolean startsWithVowel(String word) {
        if(word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") ||
        word.startsWith("U") || word.startsWith("a") || word.startsWith("e") || word.startsWith("i") ||
        word.startsWith("o") || word.startsWith("u")) {
            return true;
        } else

        return false;
    }

    public static Boolean isVowel(Character character) {
        return (character == 'A' || character == 'E' || character == 'I'|| character == 'O' || character == 'U' ||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');

    }
}
