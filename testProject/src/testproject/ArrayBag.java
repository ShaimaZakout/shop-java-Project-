package testproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public final class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private int numberOfEntries;
    private boolean integrityOK = false;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int desiredCapacity) {
        if (desiredCapacity <= MAX_CAPACITY) {

            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];
            bag = tempBag;
            numberOfEntries = 0;
            integrityOK = true;

        } else {
            throw new IllegalStateException("Attempt to create a bag "
                    + "whose capacity exceeds "
                    + "allowed maximum.");
        }
    }

    @Override
    public boolean add(T newEntry) {
        checkIntegrity();
        boolean result = true;
        if (isArrayFull()) {
            result = false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }

        return result;
    }

    @Override
    public T[] toArray() {
        checkIntegrity();

        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];

        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        checkIntegrity();
        int counter = 0;

        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public boolean contains(T anEntry) {
        checkIntegrity();
        return getIndexOf(anEntry) > -1;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    @Override
    public boolean remove(T anEntry) {
        checkIntegrity();

        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    private boolean isArrayFull() {
        return numberOfEntries >= bag.length;
    }

    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        int index = 0;

        while (!found && (index < numberOfEntries)) {
            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
            index++;
        }

        return where;
    }

    private T removeEntry(int givenIndex) {
        T result = null;

        if (!isEmpty() && (givenIndex >= 0)) {
            result = bag[givenIndex];
            int lastIndex = numberOfEntries - 1;
            bag[givenIndex] = bag[lastIndex];
            bag[lastIndex] = null;
            numberOfEntries--;
        }

        return result;
    }

    private void checkIntegrity() {
        if (!integrityOK) {
            throw new SecurityException("ArrayBag object is corrupt.");
        }
    }

    @Override
    public String toString() {

        String result = "Bag[ ";

        for (int index = 0; index < numberOfEntries; index++) {
            result += bag[index] + " ";
        } // end for

        result += "]";
        return result;
    }

    public boolean equals(ArrayBag<T> aBag) {
        boolean result = false;
        if (this.numberOfEntries == aBag.numberOfEntries) {
            for (int i = 0; i < this.numberOfEntries; i++) {
                if (this.getFrequencyOf(this.bag[i]) == aBag.getFrequencyOf(aBag.bag[i])) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            result = true;
        }

        return result;
    }

    @Override
    public T remove() {
        checkIntegrity();
        T result = null;

        if (numberOfEntries != 0) {
            result = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
         }
        return result;
    }

    public boolean duplicateAll() {
        checkIntegrity();
        boolean success = false; // 
        int num = this.numberOfEntries;
        if (num <= (this.bag.length / 2)) {
            if (isEmpty()) {
                success = true;
            } else {
                for (int i = 0; i < num; i++) {

                    this.add(bag[i]);

                    success = true;
                }
            }

        }
        return success;
    }

    public void removeDuplicates() {
        checkIntegrity();
        if (!isEmpty()) {
            HashSet<T> hash = new HashSet<>();
            T[] result;
            for (int i = 0; i < numberOfEntries; i++) {
                hash.add(this.bag[i]);
            }

            numberOfEntries = hash.size();
            bag = Arrays.copyOf((T[]) hash.toArray(), numberOfEntries);

        }

    }

}
