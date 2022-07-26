package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {


        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType x : this.array){
            if(getNumberOfOccurrences(x)%2!=0){
                return x;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType x : this.array){
            if(getNumberOfOccurrences(x)%2==0){
                return x;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;

        for(int i =0; i< this.array.length; i++){
            if(this.array[i].equals(valueToEvaluate)){
                count++;
            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
