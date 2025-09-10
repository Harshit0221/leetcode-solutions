class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet <>();  
        for (int num:nums1){
            set.add(num);
        }
        HashSet <Integer> result = new HashSet<>(); 
        for (int num:nums2){   
            if(set.contains(num)){
                result.add(num);
            }
        }
        int arr[] = new int[result.size()];
        int i=0;
        for (int num:result){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}


// Put all elements of nums1 into a HashSet.
// Create another HashSet for the result.
// Loop through nums2:
// If an element is already in the first set, add it to the result set.
// Convert the result set to an array and return it. 