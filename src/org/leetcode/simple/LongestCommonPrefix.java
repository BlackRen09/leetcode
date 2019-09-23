package org.leetcode.simple;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1: 输入: ["flower","flow","flight"] 输出: "fl"
 * </p>
 * <p>
 * 示例 2: 输入: ["dog","racecar","car"] 输出: "" 解释: 输入不存在公共前缀。
 * </p>
 * 
 * @author ren
 *
 */
public class LongestCommonPrefix {
	private final static String EMPTY = "";

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length < 2)
			return strs[0];
		else {
			
		}

		return EMPTY;
	}

	public static void main(String[] args) {
		String[] strs = {};
		System.out.println(longestCommonPrefix(strs));
	}
}
