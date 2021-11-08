package codechallenge4;

import codechallenge3.PairOf2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairOf3 {

    private List<Integer> array;

    public PairOf3(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getArray() {
        return array;
    }

    public Integer findNumberOfPairs(){
        List<Integer> copyArray= new ArrayList<>(this.array);
        Collections.sort(copyArray);
        Integer countTriplets = 0;
        Integer lowBound = 0;
        Integer upperBound = copyArray.size() - 1;
        copyArray.get(lowBound);

        int i=0;

        while(i<upperBound) {
                // initialize left and right

                int l = i + 1;
                int r = copyArray.size() - 1;
                int x = copyArray.get(i);
                while (l < r) {
                    if (x + copyArray.get(l) + copyArray.get(r) == 0) {
                        // print elements if it's
                        // sum is given sum.
                        System.out.println(x + " " + copyArray.get(l) + " " + copyArray.get(r));
                        countTriplets = countTriplets + 1;
                        System.out.println("before i"+i);
                        System.out.println("l"+l);
                        System.out.println("r"+r);
                        System.out.println("size of array"+copyArray.size());
                        System.out.println(copyArray.toString());
                        System.out.println("R value="+copyArray.get(r));
                        copyArray.remove(r);
                        copyArray.remove(l);
                        copyArray.remove(i);

                        upperBound-=3;
                        r-=3;



                        System.out.println(copyArray.toString());
                        System.out.println("i"+i);
                        System.out.println("l"+l);
                        System.out.println("r"+r);
                        System.out.println("size of array"+copyArray.size());


                    }

                    // If sum of three elements
                    // is less than 'sum' then
                    // increment in left
                    else if (x + copyArray.get(l) + copyArray.get(r) > 0) {
                        r--;

                    }
                    // if sum is greater than
                    // given sum, then decrement
                    // in right side
                    else {
                        l++;
                    }

                }

            i++;

        }
        return countTriplets;
    }

    @Override
    public String toString(){
        return this.array.toString();
    }

    public static void main(String[] args)
    {
        System.out.println("First example: ");
        List<Integer> array1 = Arrays.asList(-1,-1,-1,2);
        PairOf3 testArray1 = new PairOf3(array1);
        System.out.println(testArray1.toString());
        System.out.println("Number of Pairs: " + testArray1.findNumberOfPairs() +"\n");


        System.out.println("Second example: ");
        List<Integer> array2 = Arrays.asList(1,2,3,-1,-1,-2,-1);
        PairOf3 testArray2 = new PairOf3(array2);
        System.out.println(testArray2.toString());
        System.out.println("Number of Pairs: " + testArray2.findNumberOfPairs() +"\n");

    }

}
