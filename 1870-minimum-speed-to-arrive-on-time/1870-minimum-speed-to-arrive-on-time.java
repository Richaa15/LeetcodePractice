class Solution {
    static double checkValidity(int s, int[] dist)
    {
        double t = 0.0;

        for(int i=0; i<dist.length-1; i++)
        {
            t = t + Math.ceil((double)dist[i]/(double)s);
        }
        t = t + ((double)dist[dist.length-1]/(double)s);
        return t;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length-1 >= hour)
        {
            return -1;
        }

        int minspeed = 0;

        int left = 1;
        int right = 10000000;

        while(left <= right)
        {
            int speed = left + (right - left)/2;
            

            if(checkValidity(speed, dist) <= hour)
            {
                minspeed = speed;
                right = speed-1;
            }
            else
            {
                left = speed+1;
            }
        }
        return minspeed;
    }
}