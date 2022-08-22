package Strings;

import java.util.HashMap;

public class LongestCharacterReplacement {



    public int characterReplacement(String s,int k) {

        if (s.length() == 1) {
            return 1;
        }


        int []fmap = new int[26];

        int res = 0, mostFrequent = 0, len = s.length(), start = 0;
        for(int end = 0 ; end < len; end++){
            mostFrequent = Math.max(mostFrequent, ++fmap[s.charAt(end) - 'A']);

            while(end - start + 1 - mostFrequent > k){
                fmap[s.charAt(start) - 'A']--;
                start++;
            }
            res = Math.max(res,end-start + 1);

        }
        return res;
    }
}
