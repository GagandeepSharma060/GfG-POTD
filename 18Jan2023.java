 public static int appleSequence(int n, int m, String s){
        //code here
        
        int i=0;
        int j=0;
        
        int x=0;
     int max=0;
      
      for(i=0;i<n;i++)
      {
          if(s.charAt(i)=='O')
          {
              x++;
          }
          while(x>m)
          {
              if(s.charAt(j)=='O')
              {
                  x--;
              }
              j++;
          }
          
          max=Math.max(max,i-j+1);
      }
      
      return  max;
      
    }
