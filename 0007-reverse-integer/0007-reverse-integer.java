class Solution {
    public int reverse(int x) {

       int count =0;

       int reverseEle=0;

        while(x!=0){
            int rem = x%10;

            if (reverseEle > Integer.MAX_VALUE / 10 ||(reverseEle == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (reverseEle < Integer.MIN_VALUE / 10 ||
                (reverseEle == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            reverseEle= (reverseEle*10)+rem;

            x=x/10;
            
        }

        return reverseEle;




        
    }
}