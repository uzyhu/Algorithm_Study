package Recheck;
import java.lang.*;
import java.util.*;

class 최빈값구하기 {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int max =0;
        int result =0;
        for(int a: array){
            int count = map.getOrDefault(a, 0)+1;

            if(max < count){
                max = count;
                result = a;
            }
            else if(max==count){
                result = -1;
            }
            map.put(a, count);
        }
        return result;
    }
}
