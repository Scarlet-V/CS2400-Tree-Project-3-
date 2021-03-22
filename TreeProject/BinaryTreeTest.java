package TreeProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class BinaryTreeTest {
//	BinaryTreeTest BT;
//	@BeforeAll
//	public void beforeAll() {
//		BT = new BinaryTreeTest();
//	}
	 public static void createTree1(BinaryTree<String> tree) {
    	 // Leaves
        BinaryTree<String> bTree = new BinaryTree<>("B");
        BinaryTree<String> fTree = new BinaryTree<>("F");
        BinaryTree<String> gTree = new BinaryTree<>("G");
        BinaryTree<String> hTree = new BinaryTree<>("H");
        
        // Subtrees
        BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
        BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
        BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);
        
        tree.setTree("A", bTree, cTree);
        
        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println("        / \\ ");
        System.out.println("       D    E");
        System.out.println("      /    /  \\");
        System.out.println("     F    G     H");
        System.out.println();
    } // end createTree2
}
    
	