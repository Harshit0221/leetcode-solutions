class Solution {
    public int maxProduct(int n) {
        // int prod = 1;
        // int num = n;
        // while (num>0){
        //     int lastDig = num % 10;
        //     prod = prod * lastDig;
        //     num = num / 10;
        // }
        // return prod;

        int largest = 0;
        int secondLargest = 0;

        while (n>0){
            int digit = n % 10;

            if (digit>largest){
                secondLargest = largest;
                largest = digit;
            }else if (digit > secondLargest){
                secondLargest = digit;
            }
            n = n / 10;
        }
        return largest * secondLargest;
    }
}