package TreeProject;

public class DriverBT 
{
    public static void main(String[] args) 
    {
        System.out.println("1st Testing Example:");
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);
        
        System.out.println("(binaryTree) post-order: ");
        aTree.postorderTraverse();
        
        System.out.println("(binaryNode) post-order: ");
        aTree.postorderTraverse_callBinaryNodeMethod();
        
        System.out.println();
        
        System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
        
        System.out.println();
        
        System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());
        
        System.out.println("==========================================");
        System.out.println();
        
        System.out.println("2nd Testing Example:");
        BinaryTree<String> aTree2 = new BinaryTree<>();
        createTree2(aTree2);
        
        System.out.println("(binaryTree) post-order: ");
        aTree2.postorderTraverse();
        
        System.out.println("(binaryNode) post-order: ");
        aTree2.postorderTraverse_callBinaryNodeMethod();
        
        System.out.println();
        
        System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());
        
        System.out.println();
        
        System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());
        
        System.out.println("Done.");
    }  // end main
}