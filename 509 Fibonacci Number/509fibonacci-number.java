class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int a=fib(n-1)+fib(n-2);
        return a;
    }
    public void main(String args[]){
        System.out.println(fib(2));
    }
}