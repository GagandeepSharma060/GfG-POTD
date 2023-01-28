  public static int solve(int a, int b) {
        // code here
        if(a==b) return 0;
        int n1=0;
        int n2=0;
        
        int n=1;
        while(a>0||b>0)
        {
            
            if((a&1)==1 && (b&1)==0)
            {
                n1++;
            }
            
            if((a&1)==0 &&( b&1)==1)
            {
                n2++;
            }
            
            a=a>>1;b=b>>1;
            
            
        }
        
        
        if(n1==0 || n2==0)
        {
            return 1;
        }
        return 2;
        
        
    }
