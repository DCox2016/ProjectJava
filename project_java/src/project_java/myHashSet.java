package project_java;

import java.util.LinkedList;
import java.util.List;

public class myHashSet {
    //set buckets to like list with index of numbuckets
    public void MyHashSet() {
       buckets = new LinkedList[numBuckets];
    }
    
    public void add(int key) {
      //set i to the hash function
      int i  = hash_function(key);
      //check if bucket is empty and create it
      if(buckets[i] == null) buckets[i] = new LinkedList<>();
      //else add key
      if(buckets[i].indexOf(key) == -1)
          buckets[i].add(key);
    }
    
    public void remove(int key) {
      //set i to the hash function
      int i  = hash_function(key);
      //if bucket is empty return
      if(buckets[i] == null) return;
      //if bucket is not empty and remove bucket using key
      if(buckets[i].indexOf(key) != -1) buckets[i].remove(buckets[i].indexOf(key));
    }
    
    public boolean contains(int key) {
    	 //set i to the hash function
        int i  = hash_function(key);
        //check if null or value does not exist
        if(buckets[i] == null || buckets[i].indexOf(key) == -1) return false;
        return true;
    }
}
