package intersectionArray;

import java.util.ArrayList;
import java.util.HashMap;

public class FindIntersectionOfBothArrayList {
	public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            // If the map already contain the same number, then just increase the value of that key
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {// Else mean the number was never inside the map and just add the value of 1
                map.put(nums1[i], 1);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            // We need to check if map.get(nums2[i] > 0) because what if there is 0 value for that certain key
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                // Add it to the result
                result.add(nums2[i]);
                
                // decrese the value by 1 in order to keep track
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }         
        
        return answer;
    }
}
