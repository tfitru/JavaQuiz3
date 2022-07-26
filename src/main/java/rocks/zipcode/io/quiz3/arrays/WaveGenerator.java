package rocks.zipcode.io.quiz3.arrays;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

//    The purpose of this class is to create an array of near-identical String,
//    whose array index corresponds to the index of the only capitalized character in the String
    public static String[] wave(String str) {
        List<String> y;

        String s = str.toLowerCase(Locale.ROOT);
        for(int i = 0; i<str.length(); i++) {
            y = Arrays.asList(s.split(","));
            System.out.println(y);

        }



        return new String[0];

    }


 }

