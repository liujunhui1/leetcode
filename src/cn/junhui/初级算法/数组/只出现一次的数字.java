package 初级算法.数组;

/**
 * 军辉
 * 2018-09-02 14:06
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class 只出现一次的数字 {

    public static int singleNumber(int[] nums) {
        if(nums.length == 0)
            return 0;

        int ret = 0;
        for(int i=0 ; i<nums.length ; ++i) {
            /*
            异或，
                0 ^ 0 = 0
                0 ^ 1 = 1
                0 ^ 5 = 5
                相同为0，不同时，若有一方为0，则值为另一数值
             */
            ret ^= nums[i];
            System.out.println(ret);
        }
        return ret;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,3,1};
        System.out.println(singleNumber(nums));

    }
}
