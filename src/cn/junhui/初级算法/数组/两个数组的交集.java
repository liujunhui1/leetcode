package cn.junhui.初级算法.数组;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 军辉
 * 2018-09-02 14:57
 * <p>
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */
public class 两个数组的交集 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList arr = new ArrayList();

        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                int num = hm.get(nums1[i]);
                hm.put(nums1[i], ++num);
            } else {
                hm.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i])) {
                arr.add((Integer) nums2[i]);
                int num = hm.get(nums2[i]);
                hm.put(nums2[i], --num);
                if(num == 0){
                    hm.remove(nums2[i]);
                }
            } else {
                hm.remove(nums2[i]);
            }
        }

        Integer nums[] = new Integer[arr.size()];
        //ArrayList的类型是Integer无法对int数组直接赋值
        arr.toArray(nums);

        int n[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[i];
        }

        return n;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,7,9,7,6,7}, nums2 = {5,0,0,6,1,6,2,2,4};
        int[] num = intersect(nums1, nums2);
        for(int i : num){
            System.out.print(i +" ");
        }
    }
}
