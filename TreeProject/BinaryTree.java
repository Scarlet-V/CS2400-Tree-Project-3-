package TreeProject;

public class BinaryTree<T> implements BinaryTreeInterface<T>  
{
    private BinaryNode<T> root;

    public BinaryTree() 
    {
        root = null;
    } // end default constructor

    public BinaryTree(T rootData) 
    {
        root = new BinaryNode<>(rootData);
    } // end constructor

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) 
    {
        initializeTree(rootData, leftTree, rightTree);
    } // end constructor

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) 
    {
        initializeTree(rootData, (BinaryTree<T>) leftTree,
                (BinaryTree<T>) rightTree);
    } // end setTree

    public void setRootData(T rootData) 
    {
        root.setData(rootData);
    } // end setRootData

    public T getRootData() 
    {
        if (isEmpty())
            throw new EmptyTreeException();
        else
            return root.getData();
    } // end getRootData

    public boolean isEmpty() 
    {
        return root == null;
    } // end isEmpty

    public void clear() 
    {
        root = null;
    } // end clear

    protected void setRootNode(BinaryNode<T> rootNode) 
    {
        root = rootNode;
    } // end setRootNode

    protected BinaryNode<T> getRootNode() 
    {
        return root;
    } // end getRootNode

    private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) 
    {
        root = new BinaryNode<>(rootData);
        
        if ((leftTree != null) && !leftTree.isEmpty())
            root.setLeftChild(leftTree.root);
        
        if ((rightTree != null) && !rightTree.isEmpty()) {
            if (rightTree != leftTree)
                root.setRightChild(rightTree.root);
            else
                root.setRightChild(rightTree.root.copy());
        } // end if
        
        if ((leftTree != null) && (leftTree != this))
            leftTree.clear();
        
        if ((rightTree != null) && (rightTree != this))
            rightTree.clear();
    } // end initializeTree

      /**
     * calls postorderTraverse(BinaryNode<T> node) prints (using post-order
     * traversal) all nodes in the "whole" tree
     */
    public void postorderTraverse() 
    {
    }

    /**
     * A Recursive Method in the BinaryTree Class prints (using post-order
     * traversal) all nodes in the subtree rooted at this node.
     */
    private void postorderTraverse(BinaryNode<T> node) 
    {
    }

     /**
     * The following calls postorderTraverse_binaryNodeMethod(), which is a
     * recursive binaryNode class method prints (using post-order traversal) all
     * nodes in the "whole" tree
     */
    public void postorderTraverse_callBinaryNodeMethod() 
    {
    }

    /**
     * calls getHeight(BinaryNode<T> node)
     *
     * @return The height of the "whole" tree
     */
    public int getHeight() 
    {
        return getHeight(root);
    } // end getHeight

    /**
     * A Recursive Method in the BinaryTree Class Computes the height of the
     * subtree rooted at this node.
     *
     * @return The height of the subtree rooted at this node.
     */
    private int getHeight(BinaryNode<T> node) 
    {
        int height = 0;
        if (node != null)
            height = 1 + Math.max(getHeight(node.getLeftChild()),
                    getHeight(node.getRightChild()));
        return height;
    } // end getHeight

    /**
     * The following calls getHeight_binaryNodeMethod() which is a recursive
     * binaryNode class method Computes the height of the "whole" tree.
     *
     * @return The height of the "whole" tree.
     */
    public int getHeight_callBinaryNodeMethod() 
    {
        return 0;
    } // end getHeight_callBinaryNodeMethod


    /**
     * calls getNumberOfNodes(BinaryNode<T> node)
     *
     * @return The number of nodes in the "whole" tree
     */
    public int getNumberOfNodes() 
    {
        return 0;
    } // end getNumberOfNodes
}
