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
}