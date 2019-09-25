package org.leetcode.simple;

/**
 * <p>给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。</p>
 * <p>不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。</p>
 * <div>
 * 示例 1:
 * <p>给定数组 nums = [1,1,2],</p>
 * <p>函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。</p>
 * <p>你不需要考虑数组中超出新长度后面的元素。</p>
 * </div>
 * <div>
 * 示例 1:
 * <p>给定 nums = [0,0,1,1,1,2,2,3,3,4],</p>
 * <p>函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。</p>
 * <p>你不需要考虑数组中超出新长度后面的元素。</p>
 * </div>
 * @author ren
 *
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
//		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] nums = { 1, 1, 2 };
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		System.out.println(removeDuplicates.removeDuplicates(nums));
		System.out.println("-----------");
		for (int num : nums) {
			System.out.println(num);
		}
	}

	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		if (length == 0)
			return length;

		int i = 1, j = 0;

		for (; i < length; i++) {
			if (nums[i] != nums[j])
				nums[++j] = nums[i];
		}

		return j + 1;
	}
}
