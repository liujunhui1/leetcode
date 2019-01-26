package 初级算法.数组;

/**
 * 军辉
 * 2018-09-07 16:25
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class 移动0 {
    public static void moveZeroes(int[] nums) {
        if(nums.length == 0 ||nums == null){
               return;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for(int j = k; j < nums.length;j++){
                 nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1};
        moveZeroes(nums);
        for(int n : nums){
            System.out.print(n+" ");

        }
    }
}
