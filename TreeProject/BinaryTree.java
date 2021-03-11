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
}
