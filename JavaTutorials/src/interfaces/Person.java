package interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
//		obj.study();
//		obj.makeVideo();
		
		Youtuber obj2 = obj;
		obj2.editVideo();
		obj2.makeVideo();
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is studying");
	}
	
	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is making a good video");
		
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video is being edited");
		
	}

	

	
}
