package elevenTwenty;

import java.util.Arrays;

class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "dracecar", "dcar"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String prefixToCompare = "";
        Arrays.sort(strs);
        String smallest = strs[0];
        String biggest = strs[strs.length - 1];

        for (int i = 0; i < smallest.length(); i++) {
            prefixToCompare = prefixToCompare + smallest.charAt(i);
            if (smallest.startsWith(prefixToCompare) && biggest.startsWith(prefixToCompare)) {
                prefix = prefixToCompare;
            }

        }
        return prefix;
    }
}