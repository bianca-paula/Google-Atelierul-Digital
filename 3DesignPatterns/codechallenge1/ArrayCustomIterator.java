package codechallenge1;

public class ArrayCustomIterator implements Iterator{
    int[] arrayList;
    int currentPosition = 0;

    public ArrayCustomIterator(int[] arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition >= arrayList.length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        int element = arrayList[currentPosition];
        currentPosition++;
        return element;
    }
}
