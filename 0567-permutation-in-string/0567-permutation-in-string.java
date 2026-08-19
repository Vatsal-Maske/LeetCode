class Solution { 
    static boolean compareFreq(int count1[], int count2[]) { 
        for(int i = 0; i < 26; i++) { 
            if(count1[i] != count2[i]) { 
                return false; 
            } 
        } 
        return true; 
    } 

    public boolean checkInclusion(String s1, String s2) { 
        //sabse pahale check karenege ki length of the s1 is should not be grater that s2  
        if(s1.length() > s2.length()) { 
            return false; 
        } 

        //count karo character s1 ke andara means frequenecy 
        int count1[] = new int[26]; 
        for(int i = 0; i < s1.length(); i++) { 
            char ch = s1.charAt(i); 
            int index = ch - 'a'; 
            count1[index]++; 
        } 

        //count karo character of s2 ko  
        int i = 0; 
        int windowsLength = s1.length(); 
        int count2[] = new int[26]; 

        for(i = 0; i < windowsLength; i++) { 
            char ch = s2.charAt(i); 
            int index = ch - 'a'; 
            count2[index]++; 
        } 

        if(compareFreq(count1, count2) == true) { 
            return true; 
        } 

        //yaha se sliding window start hoga
        while(i < s2.length()) { 

            char newChar = s2.charAt(i); 
            int newCharIndex = newChar - 'a'; 
            count2[newCharIndex]++; 

            //old character ki entry ko tablee se remove karo 
            int oldCharIndex = i - windowsLength; 
            char oldChar = s2.charAt(oldCharIndex); 
            int freqTableIndexOfOldChar = oldChar - 'a'; 
            count2[freqTableIndexOfOldChar]--; 

            //aapke paas updatyed table aagya h new window k liy 
            //isko compare karo s1 k reference table se 
            if(compareFreq(count1, count2) == true) { 
                return true; 
            } 

            //yaha pr main hmesha glti karta hu 
            i++; 
        } 

        return false; 
    } 
}