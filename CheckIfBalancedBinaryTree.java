package com.ideserve.questions;
 
public class CheckIfBalancedBinaryTree 
{
    class TreeNode
    {
        TreeNode left;
        TreeNode right;
        int value;
     
        public TreeNode(int value)
        {
            this.value = value;
        }
    }
     
    TreeNode root;
 
    /*
                            0
                      1             2
                  3      4       5  
                    6              7
                      8
    */
 
    private TreeNode createTree()
    {
        this.root = new TreeNode(0);
        TreeNode n1   = new TreeNode(1);
        TreeNode n2   = new TreeNode(2);
        TreeNode n3   = new TreeNode(3);
        TreeNode n4   = new TreeNode(4);
        TreeNode n5   = new TreeNode(5);
        TreeNode n6   = new TreeNode(6);
        TreeNode n7   = new TreeNode(7);
        TreeNode n8   = new TreeNode(8);
         
        root.left  = n1;
        root.right = n2;
         
        n1.left  = n3;
        n1.right = n4;
         
        n2.left  = n5;
         
        n3.right = n6;
         
        n5.right = n7;
         
        n6.right = n8;
         
        return root;
    }
 
 
    // this function returns height of tree rooted at currentNode if the tree is balanced
    // otherwise it returns -1
    private int checkBalance(TreeNode currentNode)
    {
        if (currentNode == null) 
        {
            return 0;
        }
         
        // check if left sub-tree is balanced
        int leftSubtreeHeight = checkBalance(currentNode.left);
        if (leftSubtreeHeight == -1) return -1;
         
        // check if right sub-tree is balanced
        int rightSubtreeHeight = checkBalance(currentNode.right);
        if (rightSubtreeHeight == -1) return -1;
         
        // if both sub-trees are balanced, check the difference of heights
        // should be less than or equal to 1 
        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1)
        {
            return -1;
        }
 
        // if tree rooted at this node is balanced, return height if tree rooted at this this node
        return (Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1);
    }
     
     
    public boolean checkIfBalanced()
    {
        if (checkBalance(root) == -1)
        {
            return false;
        }
        return true;
    }
     
     
    public static void main(String[] args)
    {
        CheckIfBalancedBinaryTree tree = new CheckIfBalancedBinaryTree();
 
        /*
                                0
                          1             2
                      3      4       5  
                        6              7
                          8
        */
 
        tree.createTree();
         
        System.out.println("tree is balanced: "+tree.checkIfBalanced());
    }
}
  