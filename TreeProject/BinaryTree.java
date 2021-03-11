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
}
