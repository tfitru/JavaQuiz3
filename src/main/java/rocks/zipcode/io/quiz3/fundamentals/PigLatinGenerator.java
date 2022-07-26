package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

//    If the word starts with a vowel, then return the original string with "way" appended.
//    If the word starts with a consonant, then shift consonants from the beginning of the word to the end of the word until the first vowel.
//    Then, return the newly shifted string with "ay" appended.
//    If the word has no vowels, then return the original string plus "ay".
//    Vowels are any of the following letters: a, e, i, o, u.
//    Consonants are any letter, which aren't a vowel.

    public boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public String translate(String str) {
        String latinSentence = "";

        String[] splitSentence = str.split("");

        for(int i = 0; i < splitSentence.length; i++){
            if(splitSentence[i].charAt(0) == 'A' || splitSentence[i].charAt(0) == 'a' ||
                    splitSentence[i].charAt(0) == 'E' || splitSentence[i].charAt(0) == 'e' ||
                    splitSentence[i].charAt(0) == 'I' || splitSentence[i].charAt(0) == 'i' ||
                    splitSentence[i].charAt(0) == 'O' || splitSentence[i].charAt(0) == 'o' ||
                    splitSentence[i].charAt(0) == 'U' || splitSentence[i].charAt(0) == 'u') {

                latinSentence = latinSentence + splitSentence[i] + "way";

            } else {
                String tempWord = "";
                for(int j = 0; j < splitSentence[i].length(); j++){
                    if(splitSentence[i].charAt(j) != 'A' && splitSentence[i].charAt(j) != 'a' &&
                            splitSentence[i].charAt(j) != 'E' && splitSentence[i].charAt(j) != 'e' &&
                            splitSentence[i].charAt(j) != 'I' && splitSentence[i].charAt(j) != 'i' &&
                            splitSentence[i].charAt(j) != 'O' && splitSentence[i].charAt(j) != 'o' &&
                            splitSentence[i].charAt(j) != 'U' && splitSentence[i].charAt(j) != 'u'){

                        tempWord = tempWord + splitSentence[i].charAt(j);

                    }
                    else {
                        latinSentence = latinSentence + splitSentence[i].substring(j);
                        j = splitSentence[i].length();
                    }
                }
            }
        }





        return latinSentence;
    }



}
