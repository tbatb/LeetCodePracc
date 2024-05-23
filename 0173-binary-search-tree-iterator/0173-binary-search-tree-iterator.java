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
class BSTIterator {
    ArrayList<Integer> nodeSorted; 
    int index; 

    public BSTIterator(TreeNode root) {
        this.nodeSorted = new ArrayList<Integer>();
        this.index = -1; 
        this.inOrder(root);        
    }

    public void inOrder(TreeNode root){
        if (root == null){
            return; 
        }
        this.inOrder(root.left);
        this.nodeSorted.add(root.val);
        this.inOrder(root.right);
    }
    
    public int next() {
        return this.nodeSorted.get(++this.index);
    }
    
    public boolean hasNext() {
        return this.index + 1 < this.nodeSorted.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */