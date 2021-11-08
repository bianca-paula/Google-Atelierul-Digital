package codechallenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairOf2 {
    private List<Integer> array;

    public PairOf2(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getArray() {
        return array;
    }

    public Integer findNumberOfPairs(){
        List<Integer> copyArray= new ArrayList<>(this.array);
        Collections.sort(copyArray);

        Integer lowBound = 0;
        Integer upperBound = copyArray.size() - 1;
        Integer countPairs = 0;

        while(lowBound < upperBound){
            if(copyArray.get(lowBound) + copyArray.get(upperBound)== 0){
                countPairs++;
                System.out.println("(" + copyArray.get(lowBound)+", "+copyArray.get(upperBound)+")");
                copyArray.remove(lowBound);
                copyArray.remove(upperBound);
                upperBound-=2;


            }

            if(copyArray.get(lowBound)+copyArray.get(upperBound) > 0){
                upperBound--;
            }
            else{
                lowBound++;
            }

        }
        return countPairs;

    }

    @Override
    public String toString(){
        return this.array.toString();
    }

    public static void main(String[] args)
    {
        System.out.println("First example: ");
        List<Integer> array1 = Arrays.asList(3,2,-3,-2,3,0);
        PairOf2 testArray1 = new PairOf2(array1);
        System.out.println(testArray1.toString());
        System.out.println("Number of Pairs: " + testArray1.findNumberOfPairs() +"\n");

        System.out.println("Second example: ");
        List<Integer> array2 = Arrays.asList(1,1,0,-1,-1);
        PairOf2 testArray2 = new PairOf2(array2);
        System.out.println(testArray2.toString());
        System.out.println("Number of Pairs: " + testArray2.findNumberOfPairs()+"\n");

        System.out.println("Third example: ");
        List<Integer> array3 = Arrays.asList(5,9,-5,7,-5);
        PairOf2 testArray3 = new PairOf2(array3);
        System.out.println(testArray3.toString());
        System.out.println("Number of Pairs: " + testArray3.findNumberOfPairs()+"\n");
    }
}
