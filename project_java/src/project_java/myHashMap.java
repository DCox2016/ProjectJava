package project_java;

public class myHashMap {
	class MyHashMap {
	    //Hashmap keys must be numbers our range will be 0 - 1000001
	    private int[] _v = new int[1000001];

	    public MyHashMap() {
	        //Set all buckets keys to -1
	        for(int i = 0; i < 100000; i++){
	            _v[i] = -1;
	        }
	    }
	    
	    public void put(int key, int value) {
	        //Set _v key and value   
	        _v[key] = value;
	    }
	    
	    public int get(int key) {
	        int value = _v[key];
	        //check if key exist and if value equals 0 
	        if(key > 0 & value == 0){
	          return -1;
	        }
	     
	        return value;
	    }
	    
	    public void remove(int key) {
	        //set all buckets values back to -1
	        _v[key] = -1;
	    }
	}
}
