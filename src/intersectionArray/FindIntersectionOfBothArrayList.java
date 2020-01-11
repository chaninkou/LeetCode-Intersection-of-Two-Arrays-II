package intersectionArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntersectionOfBothArrayList {
	// My version
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arrayList = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // Edge cases
        if(nums1.length == 0 || nums2.length == 0){
            return new int[]{};
        }
        
        // Doesn't really need the if else statement since we will be doing n + n time anyway
        if(nums1.length < nums2.length){
            
            for(int num : nums1){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            for(int num : nums2){
                if(map.containsKey(num) && map.get(num) > 0){
                    map.put(num, map.get(num) - 1);
                    arrayList.add(num);
                }
            }
            
        } else {
            
            for(int num : nums2){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            for(int num : nums1){
                if(map.containsKey(num) && map.get(num) > 0){
                    map.put(num, map.get(num) - 1);
                    arrayList.add(num);
                }
            }
        }
        
        // Change the array list to an array for the solution
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }         
        
        return answer;
    }
	
    // Old version, same time complexity
//	public int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        
//        for(int i = 0; i < nums1.length; i++){
//            // If the map already contain the same number, then just increase the value of that key
//            if(map.containsKey(nums1[i])){
//                map.put(nums1[i], map.get(nums1[i]) + 1);
//            } else {// Else mean the number was never inside the map and just add the value of 1
//                map.put(nums1[i], 1);
//            }
//        }
//        
//        for(int i = 0; i < nums2.length; i++){
//            // We need to check if map.get(nums2[i] > 0) because what if there is 0 value for that certain key
//            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
//                // Add it to the result
//                result.add(nums2[i]);
//                
//                // decrese the value by 1 in order to keep track
//                map.put(nums2[i], map.get(nums2[i]) - 1);
//            }
//        }
//        
//        int[] answer = new int[result.size()];
//        
//        for(int i = 0; i < result.size(); i++){
//            answer[i] = result.get(i);
//        }         
//        
//        return answer;
//    }
}
