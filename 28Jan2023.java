class Solution{
       static HashMap<String,Boolean> hm;
    static boolean isScramble(String S1,String S2)
    {
        //code here
        hm=new HashMap<>();
        return fun(S1,S2);
    }
    static boolean fun(String S1,String S2)
    {
        if(S1.equals(S2)){
            hm.put(S1+" "+S2,true);
            return true;
        }
        if(hm.containsKey(S1+" "+S2)){
            return hm.get(S1+" "+S2);
        }
        if(S1.length()==S2.length()){
            int n=S1.length();
            for(int i=1;i<n;i++){
                if(fun(S1.substring(0,i),S2.substring(0,i)) && fun(S1.substring(i,n),S2.substring(i,n))){
                    hm.put(S1+" "+S2,true);
                    return true;
                }
                if(fun(S1.substring(0,i),S2.substring(n-i,n)) && fun(S1.substring(i,n),S2.substring(0,n-i))){
                    hm.put(S1+" "+S2,true);
                    return true;
                }
            }
        }
        hm.put(S1+" "+S2,false);
        return false;
    }
}
