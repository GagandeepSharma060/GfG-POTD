 static long solve(int N, int k, ArrayList<Long> GeekNum) {
        //code he
        long sum=0;
        for(long a:GeekNum)
        {
            sum+=a;
        }
        
        int i=0;
        int j=k;
        while( j<N)
        {
            GeekNum.add(sum);
            sum-=GeekNum.get(i);
            i++;
            sum+=GeekNum.get(j);
            j++;
            
        }
        return GeekNum.get(N-1);
    }
