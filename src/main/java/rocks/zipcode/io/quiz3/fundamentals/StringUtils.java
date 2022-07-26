package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        char y = str.charAt((indexToCapitalize));
        Character m = Character.toUpperCase(y);

        return str.replace(y, m);
    }




    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        StringBuilder str = new StringBuilder();
        str.append(baseString);
        char x = str.charAt(indexOfString);

        return x == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        HashSet<String> allSubstrings = new HashSet<String>();
        for(int len=1; len<=string.length(); len++){
            for(int index=0; index<=string.length()-len; index++){
                allSubstrings.add(string.substring(index, index+len));
            }
        }

        return allSubstrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer n = input.length();

        return (n*(n+1)/2)-1;
    }
}
