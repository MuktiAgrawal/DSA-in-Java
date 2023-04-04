// Problem link: https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;
class TopKFrequentElements{
    public int[] topKFrequent(int[] nums, int k) {
        // Brute Force Approach
        // int res[]=new int[k];
        // ArrayList<Integer> a=new ArrayList<>();
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        //     a.add(e.getValue());
        // }
        // Collections.sort(a);
        // int ind=0;
        // for(int i=a.size()-1;i>=a.size()-k;i--){
        //     for(Map.Entry<Integer,Integer> e:map.entrySet()){
        //         if(a.get(i)==e.getValue()){
        //             res[ind]=e.getKey();
        //             map.remove(e.getKey());
        //             ind++;
        //             break;
        //         }
        //     }
        // }
        // return res;


        // Approach 2
        // PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>(){
        //     @Override
        //     public int compare(Integer o1,Integer o2){
        //         return Integer.compare(o2,o1);
        //     }
        // });
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            maxHeap.add(e);
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry=maxHeap.poll();
            res[i]=entry.getKey();
        }
        return res;
    }
}
