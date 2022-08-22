package Strings;

public class LongestSubstringwithKDistincyCharacters {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Integer r=0,l=0,res=0,curDistinct=0;
        int[] freq = new int[256];
        while(r<s.length()){
            if(++freq[s.charAt(r++)]==1) curDistinct++;
            while(curDistinct>k) if(--freq[s.charAt(l++)]==0) curDistinct--;
            res = Math.max(r-l, res);
        }
        return res;

    }
}
