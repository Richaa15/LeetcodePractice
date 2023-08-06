class Solution {
    public String getHint(String secret, String guess) {
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        char[] arr = new char[10];
        int cows = 0, bulls = 0;
        
        for(int i=0; i<s.length; i++)
        {
            if(s[i] == g[i])
            {
                bulls++;
                g[i] = 'x';
            }
            else
            {
                arr[s[i]%10]++;
            }
        }
        for(char ch : g)
        {
            if(ch != 'x')
            {
                if(arr[ch%10] != 0)
                {
                    cows++;
                    arr[ch%10]--;
                }
            }
        }
        String res = bulls + "A" + cows + "B";
        return res;
    }
}