package day1;

import java.util.HashMap;
import java.util.Map;

//
public class test1 {
    /*
    我第一次提交的代码
     */
//    public int[] twoSum(int[] nums, int target) {
//        int[] get = new int[2];
//        int temp;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                temp = nums[i] + nums[j];
//                if (temp == target){
//                    get[0] = i;
//                    get[1] = j;
//                    return get;
//                }
//            }
//        }
//        return get;
//    }

    /*
    哈希表
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

/*    作者：力扣官方题解
    链接：https://leetcode.cn/problems/two-sum/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
}
