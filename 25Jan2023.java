class Solution {
    int minOperation(String s) {
        // code here
        int maxlen=0;
        int f=s.length();
        f/=2;
        
        for(int i=f;i>=1;i--)
        {
            int l = f+1;
            if((s.substring(0,i)).equals(s.substring(i,2*i)))
            {
                maxlen =i;
                break;
            }
        }
        
        if(maxlen>0)
        return s.length()-(maxlen)+1;
        
        return s.length();
    }
}
