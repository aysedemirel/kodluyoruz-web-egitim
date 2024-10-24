package com.ayse.others;

/**
 * Determine whether the word entered by the user is "Palindromic".
 * <p>
 * If the reverse reading of a word gives the same word, that word is a "Palindromic Word".
 * <p>
 * Example: abba, asa, kavak, kayak
 *
 * @author aysedemirel
 */
public class PalindromicWord {

    public static void main(String[] args) {
        System.out.println("abba: " + isPalindrome("abba"));
        System.out.println("java: " + isPalindrome2("java"));
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalindrome2(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.contentEquals(reverse);
    }
}
