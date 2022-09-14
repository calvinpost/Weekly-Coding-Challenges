using System;

public class NextPrime
{
    public static void Main(string[] args)
    {
        int[] nums = {13, 24, 11};
        foreach (int num in nums) {
            Console.WriteLine(num + " : " + nextPrime(num));
        }
    }
    
    public static int nextPrime(int i) {
        int res = i;
        while(!IsPrime(res)) {
            res++;
        }
        return res;
    }
    
    public static bool IsPrime(int i) {
        for(int j=2; j<i; j++) {
            if(i%j==0) return false;
        }
        return true;
    }
}
