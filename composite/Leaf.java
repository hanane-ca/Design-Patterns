package compoosite;
import compoosite.Data;


class File extends Data{
	public File(int i, String n){
			size = i;
			name = n;
		}

		int getSize() {
			return size;
		}
		
		String getName() {
			return name;
		}
		
		void getElement(){
			System.out.println("file name : "+ name +" has a size of : " + size);		
		}
		
	}

