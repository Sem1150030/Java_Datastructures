class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;

        if(x < 0){
            return false;
        }

        if (x == 0){
            return true;
        }

        int rev = 0;
        while( x != 0){
            int i = x % 10;
            x /= 10;
            rev = rev * 10 + i;
        }

        if(rev == temp){
            return true;
        }
        return false;
    }
}