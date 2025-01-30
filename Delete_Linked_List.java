class Solution{
    public void deleteNode(ListNode node){
        ListNode ptr = node;
        while(ptr!=null){
            if(ptr.next!=null){
                ptr.val = ptr.next.val;
            }
            ptr = ptr.nex:t;
        }        
    }
}