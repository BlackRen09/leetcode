package org.leetcode.simple;

/**
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * </p>
 * <p>
 * 示例：
 * <ul>
 * <li>输入：1->2->4, 1->3->4</li>
 * <li>输出：1->1->2->3->4->4</li>
 * </ul>
 * </p>
 * 
 * @author ren
 *
 */
public class MergeTwoList {

	public static void main(String[] args) {
		MergeTwoList mergeTwoList = new MergeTwoList();
		ListNode l1 = mergeTwoList.new ListNode(1);
		l1.next = mergeTwoList.new ListNode(2);
		l1.next.next = mergeTwoList.new ListNode(4);

		ListNode l2 = mergeTwoList.new ListNode(1);
		l2.next = mergeTwoList.new ListNode(3);
		l2.next.next = mergeTwoList.new ListNode(4);

		ListNode result = mergeTwoList.mergeTwoLists(l1, l2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode next = head;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				next.next = l2;
				l2 = l2.next;
			} else {
				next.next = l1;
				l1 = l1.next;
			}
			next = next.next;
		}

		next.next = l1 == null ? l2 : l1;

		return head.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
