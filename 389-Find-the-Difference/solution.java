// public class Solution {
//     public char findTheDifference(String s, String t) {
//         int[] alpha = new int[26];
        
//         for (char c : s.toCharArray())
//             alpha[ c - 'a' ]++;

//         for (char c : t.toCharArray()) {
//             if (--alpha[c - 'a'] < 0)
//                 return c;
//         }

//         return 0;
//     }
// }

public class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        
        for(char c : s.toCharArray()) {
            res ^= c;
        }
        
        for(char c : t.toCharArray()) {
            res ^= c;
        }
        
        return res;
    }
}