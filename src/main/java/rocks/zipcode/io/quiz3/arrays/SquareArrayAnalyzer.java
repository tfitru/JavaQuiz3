package rocks.zipcode.io.quiz3.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        boolean compareTrue = false;
        List<Integer> squareList = new ArrayList<>();
        List<Integer> squareListValues = new ArrayList<>(Arrays.asList(squaredValues));
        squareListValues.sort(Comparator.naturalOrder());

        for(int i =0; i<inputArray.length; i++){
            System.out.println(inputArray[i]);
            Integer square = inputArray[i]*inputArray[i];
            squareList.add(square);
            System.out.println(squareList);
        }

        squareList.sort(Comparator.naturalOrder());


        for(int i = 0; i<squareList.size(); i++){
            if(squareList.get(i)==squareListValues.get(i)){
                compareTrue = true;
            } else
                compareTrue = false;
        }
        
        
        return compareTrue;
    }
}
