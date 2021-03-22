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

    @Test
	void should_ReturnTrue_When_PostorderTraversalIsCorrect() {
		// given
		 BinaryTree<String> aTree = new BinaryTree<>();
		 createTree1(aTree);
		 String expected = "B F D G H E C A ";
		
		//when
		 aTree.postorderTraverse();
		 String actual = aTree.Display();
		//then
		assertEquals(expected,actual);
	}

    @Test
	void should_ReturnCorrectHeight_When_HeightIsCalled() {
		// given
        
		 BinaryTree<String> aTree = new BinaryTree<>();
		 createTree1(aTree);
		 int expected = 4;
		 
		//when
		 int actual = aTree.getHeight();
		//then
		assertEquals(expected,actual);
	}

    @Test
	void should_ReturnZero_When_NodeIsNull() 
    {
		// given
		 BinaryTree<String> aTree = new BinaryTree<>();
		 int expected = 0;
		 
		//when
		 int actual = aTree.getHeight();
		//then
		assertEquals(expected,actual);
	}
}
    
	