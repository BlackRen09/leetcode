package org.leetcode.simple;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * @author ren
 *
 */
public class NonArrayPlusOne {
	public int[] plusOne(int[] digits) {
		int index = digits.length;

		while (digits[--index] + 1 == 10) {
			if (index == 0) {
				// 数组需要扩容
				int[] res = new int[digits.length + 1];
				res[0] = 1;
				return res;
			}
			digits[index] = 0;

		}
		digits[index] = digits[index] + 1;
		return digits;
	}
}
