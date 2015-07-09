/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class BucketSortPrototypeAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

/**
 * Attributes:
 *      ID - must be a single digit, 0-9. Determines which item is sorted in,
 *          based on the item's hashcode MOD 10.
 *      size - the size of the bucket, i.e. the number of elements within
 *      bucket - the bucket itself, container for elements; operates
 *          similarly to a stack
 * 
 * Functions
 *      Constructors - generates the bucket. Empty constructor never called,
 *          but exists as a failsafe. Second constructor passes in the relevant
 *          ID
 *      Add - drops (adds) an item into the bucket. Increments size.
 *      Remove - removes an item from the bucket if the element exists within.
 *          Decrements size and returns this element.
 *      getID - returns the ID of the bucket.
 */
class Bucket<T>{
    private final int ID;
    private int size;
    private final ArrayList<T> bucket;
    
    Bucket(){
        size = 0;
        ID = 0;
        bucket = new ArrayList<>();
    }
    
    Bucket(int ID){
        this.ID = ID;
        size = 0;
        bucket = new ArrayList<>();
    }
    
    private void add(T item){
        bucket.add(item);
        size++;
    }
    private T remove(){
        T val;
        if(size>0){
            val = (bucket.remove(size-1));
            size--;
        }
        else{
            val = null;
        }
        return val;
    }
    private int getSize(){
        return size;
    }
    private int getID(){
        return ID;
    }
}
