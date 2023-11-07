public class P {
    public int climbStairs(int n) {
        int x = 1;
        int y = 2;
        int r = n ;
        for (int i= 2;i<n;i++) {
            r = x + y;
            x = y;
            y = r;
        }
        return r;
    }
}
