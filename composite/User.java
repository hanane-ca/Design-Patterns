package compoosite;

import compoosite.File;
import compoosite.Folder;

public class User {
	
	Folder folder1, folder2, folder3;
	File f1, f2, f3, f4;
	void createPattern() {
		// Folder 1 -> file1, file2 and folder2:
		folder1 = new Folder("A");
		f1 = new File(15, "a");
		f2 = new File(10, "b");
		folder1.add(f1);
		folder1.add(f2);
		
		folder2 = new Folder("B");
		f3 = new File(5, "c");
		folder2.add(f3);
		
		folder1.add(folder2);
		
		// Folder 3 -> f4:
		folder3 = new Folder("C");
		f4 = new File(10, "d");
		folder3.add(f4);
	}

	public static void main(String[] args) {
		User user = new User();
		user.createPattern();
		
		System.out.println("Folder 1 size: " + user.folder1.getSize());
		System.out.println("Folder 3 size: " + user.folder3.getSize());
		user.folder1.getElement();

	}

}
