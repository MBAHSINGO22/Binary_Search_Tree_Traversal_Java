package PERTEMUAN4;

public class MainTree {
	public static void main(String[] args) {
		Tree theTree = new Tree();

		theTree.add(42);
		theTree.add(21);
		theTree.add(38);
		theTree.add(27);
		theTree.add(71);
		theTree.add(82);
		theTree.add(55);
		theTree.add(63);
		theTree.add(6);
		theTree.add(2);
		theTree.add(40);
		theTree.add(12);

		System.out.println("Elemen-elemen yang ditambahkan ke Tree:");
		System.out.println("42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12");


		System.out.print("Pre Order: ");
		theTree.preorderTraversal(); 

		System.out.println(); 

		System.out.print("In Order: ");
		theTree.inorderTraversal(); 

		System.out.println(); 

		System.out.print("Post Order: ");
		theTree.postorderTraversal(); 
	}
}
