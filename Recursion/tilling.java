package Recursion;

public class tilling {
    public static void main(String[] args) {
        System.out.println(tillingWays(4));
    }
    static int tillingWays(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical choice
        int fnm1 = tillingWays(n - 1);
        //horizontal choice 
        int fnm2 = tillingWays(n - 2);
        int totalWays = fnm1 + fnm2;
        //or return tillingWays(n-1) + tillingWays(n-2);
        //TC = O(2^n)
        //SC = O(n) (auxiliary space)
        return totalWays;
    }
}
