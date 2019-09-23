package org.leetcode.simple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * </p>
 * <p>
 * 有效字符串需满足：
 * <ul>
 * <li>左括号必须用相同类型的右括号闭合.</li>
 * <li>左括号必须以正确的顺序闭合。</li>
 * </ul>
 * </p>
 * 注意空字符串可被认为是有效字符串。
 * 
 * @author ren
 *
 */
public class ValidMark {

    private static Map<Character, Character> map = new HashMap();

    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (s == null)
            return false;
        if ("".equals(s))
            return true;

        LinkedList<Character> charList = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            Character tmp = charList.peek();
            if (tmp == null) {
                charList.push(c);
            } else if (map.get(tmp) == null) {
                return false;
            } else if (c == map.get(tmp)) {
                charList.pop();
            } else {
                charList.push(c);
            }
        }

        return charList.isEmpty();
    }
}
