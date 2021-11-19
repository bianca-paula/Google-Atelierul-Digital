package codechallenge1;

public class ArrayCollection implements Collection{
    static final int MAXIMUM_NUMBER_OF_ELEMENTS = 100;
    int numberOfElements = 0;
    int[] arrayList;

    public ArrayCollection(){
        this.arrayList= new int[MAXIMUM_NUMBER_OF_ELEMENTS];
    }

    public void addElement(int element){
        if(numberOfElements >= MAXIMUM_NUMBER_OF_ELEMENTS)
            System.err.println("Array is full!");
        else{
            arrayList[numberOfElements] = element;
            numberOfElements++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArrayCustomIterator(arrayList);
    }
}
