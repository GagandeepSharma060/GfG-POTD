 static int minRepeats(String A, String B) {
        // code here
        String temp= new String(A);
        int ans=1;
        while(A.length()<B.length())
        {
            ans++;
            A=A+temp;
            
        }
        
        if(A.contains(B)) return ans;
        
        A=A+temp; 
        
        if(A.contains(B)) return ans+1;
        return -1;
        
    }
