class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            //ye traling space ko remove karega
            while( i>=0 && s.charAt(i) == ' '){
                i--;
            }

            if(i<0){
                break;
            }
            //abhi apan ko word ka starting index find karna hai to 
            int j= i;

            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }

            ans.append(s.substring(j+1,i+1));

            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }

            //so abhi word to append karana  hai abut har word ke bat tumko khali space bhi to dalni hai to iske liye apan 
            // jaise hi j<0 ban gaya to apan ko space nahi dalni hai or agar j>=0
            // to space dalna
            if(j>=0){
                ans.append(" ");
            }

            // abhi jo bachi hui string uska index hona to apan 
            i=j;
        
        } 
        return ans.toString();
    }
}