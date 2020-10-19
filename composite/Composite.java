package compoosite;
import java.util.ArrayList;

class Folder extends Data{
	public Folder(String n) {
		name = n;
	}
	
	ArrayList<Data> subFoldersFiles = new ArrayList<>();
	void add(Data f) {
		this.subFoldersFiles.add(f);
	}
	int getSize() {
		int sum = 0;
		for(int i = 0; i < subFoldersFiles.size(); i++)
			sum = sum + subFoldersFiles.get(i).getSize();
				
		return sum;
	}
	
	String getName() {
		return name;
	}

	void getElement() {
		System.out.println("folder name : "+ getName() +" has a size of : " + getSize()  );
		for(int i = 0; i < subFoldersFiles.size(); i++)
			subFoldersFiles.get(i).getElement();
	}
	
}

