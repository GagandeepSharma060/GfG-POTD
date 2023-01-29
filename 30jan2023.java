public int countVertex(int N, int[][] edges){
        // code here
        
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for(int i=0;i<=N;i++)
        {
            arr.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<edges.length;i++)
        {
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[N+1];
        ans=0;
        dfs(1,1,arr,visited);
        return ans;
        
    }
    
    static int dfs(int v , int p , ArrayList<ArrayList<Integer>> arr,boolean[] visited)
    {
        
        boolean is =false;
        
        visited[v]=true;
        int im=0;
        int io=0;
        int iz=0;
        
        for(int i=0;i<arr.get(v).size();i++)
        {
            int a= arr.get(v).get(i);
            if(a==p || visited[a]==true) continue;
            
            is=true;
            
            
            if(dfs(a,v,arr,visited)==1)
            {
                io++;
            }else if(dfs(a,v,arr,visited)==-1){
                im++;
            }else{
                iz++;
            }
            
            
           
        }
         if(is==false) return -1;
            
            if(im>0) 
            {
                ans++;
                return 1;
            }
            if(io>0) return 0;
            
            return -1;
        
        
        
        
        
        
    }
