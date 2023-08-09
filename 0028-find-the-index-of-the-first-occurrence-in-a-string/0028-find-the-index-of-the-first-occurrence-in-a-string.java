class Solution {
    public int strStr(String haystack, String needle) {
        int h = 0;
        int n = 0;
        int match = 0;
        while(h < haystack.length())
        {
            if(haystack.charAt(h) != needle.charAt(n))
            {
                if(n != 0)
                {
                    h = match;
                }
                h++;
                n = 0;
            }
            else
            {
                if(n == 0)
                {
                    match = h;
                }
                h++;
                n++;
                if(n >= needle.length())
                {
                    return match;
                }
            }
        }
        return -1;
   }
}