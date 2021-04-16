class Solution {
    /* public int fib(int n) {
        int sum =0;
        if(n == 0){
            return sum;
        }else if(n ==1 || n ==2){
            sum = 1;
            return sum;    
        }else{
            sum = fib(n-1) + fib(n-2);
            return sum;
        }
        
    }*/
    public int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        
        int prev = 0;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + cur;
            prev = cur;
            cur = next;
        }
        
        return cur;
    }
}
