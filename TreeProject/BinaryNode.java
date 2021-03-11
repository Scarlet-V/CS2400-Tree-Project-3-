package TreeProject;
class BinaryNode<T> 
{
    private T data;
    private BinaryNode<T> leftChild;  // Reference to left child
    private BinaryNode<T> rightChild; // Reference to right child

    public BinaryNode() 
    {
        this(null); // Call next constructor
    } // end default constructor

    public BinaryNode(T dataPortion) 
    {
        this(dataPortion, null, null); // Call next constructor
    } // end constructor

    public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, BinaryNode<T> newRightChild) 
    {
        data = dataPortion;
        leftChild = newLeftChild;
        rightChild = newRightChild;
    } // end constructor

    /**
     * Retrieves the data portion of this node.
     *
     * @return The object in the data portion of the node.
     */
    public T getData() 
    {
        return data;
    } // end getData

    /**
     * Sets the data portion of this node.
     *
     * @param newData The data object.
     */
    public void setData(T newData) 
    {
        data = newData;
    } // end setData

      /**
     * Retrieves the left child of this node.
     *
     * @return A reference to this node's left child.
     */
    public BinaryNode<T> getLeftChild() 
    {
        return leftChild;
    } // end getLeftChild

    /**
     * Sets this node’s left child to a given node.
     *
     * @param newLeftChild A node that will be the left child.
     */
    public void setLeftChild(BinaryNode<T> newLeftChild) 
    {
        leftChild = newLeftChild;
    } // end setLeftChild
}