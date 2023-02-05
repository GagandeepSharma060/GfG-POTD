 public static int size(Node nd)
    {
        if(nd==null) return 0;
        int ans=1;
        
        while(nd.next!=null)
        {
            ans++;
            nd=nd.next;
        }
        return ans;
    }
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int s1 = size(head1);
         int s2= size(head2);
         
         if(s1<s2)
         {
             return intersectPoint(head2,head1);
         }
         
         Node temp1 = head1;
         Node temp2= head2;
         
         int diff = s1-s2;
         for(int i=1;i<=diff;i++)
         {
             temp1=temp1.next;
         }
         
         while(temp1!=temp2)
         {
             temp1=temp1.next;
             temp2=temp2.next;
         }
         
         return temp1.data;
	}
