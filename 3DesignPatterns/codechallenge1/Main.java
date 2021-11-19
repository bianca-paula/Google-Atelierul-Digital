package codechallenge1;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        ArrayCustomIterator it =new ArrayCustomIterator(array);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
