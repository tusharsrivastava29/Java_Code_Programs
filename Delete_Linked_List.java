class Solution {
    // Method to delete a given node in a singly linked list
    public void deleteNode(ListNode node) {
        // Create a pointer to traverse the list, starting from the given node
        ListNode ptr = node;

        // Iterate through the list as long as the pointer is not null
        while(ptr != null) {
            // Check if the next node exists (this is crucial because we want to copy the next node's value)
            if(ptr.next != null) {
                // Copy the value of the next node to the current node
                // This effectively overwrites the current node's value with the value of the next node
                ptr.val = ptr.next.val;
            }

            // Move the pointer to the next node in the list
            // The next node is now "deleted" because we've copied its value into the current node
            ptr = ptr.next;
        }
    }
}
