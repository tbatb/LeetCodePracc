/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
class Solution {

    int[] nums; 
    public TreeNode helper(int left, int right){
        if (left > right) return null; 

        int p = (left + right)/2; 
        if ((left+right) % 2 == 1) ++p; 
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p-1);
        root.right = helper(p+1, right);
        return root; 

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        /**
        A height-balanced binary tree is a 
        binary tree in which the depth of the two subtrees of every node never 
        differs by more than one.
        -- height = bal(h2) - bal(h1) <= 1 */

        /**
        nums array is sorted in ascending order -- convert it to height balanced bst */
        this.nums = nums; 
        return helper(0, nums.length-1);


  


        
        
    }
}