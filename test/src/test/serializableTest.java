package test;

import java.io.*;

public class serializableTest {
	public void serializableTest() throws IOException, ClassNotFoundException {
		File f= new File("a.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
		objectOutputStream.writeObject(new Example("hyungil", "hyung1jung@tistory.com"));
	}
	
	class Example implements Serializable {
		private String name;
		private String email;
		public Example(String name, String email) {
			this.name = name;
			this.email = email;
		} // 생성자 및 기타 메서드 생략
	}
	
	public static void main(String[] args) {
		serializableTest serializableTest = new serializableTest();
		try {
			serializableTest.serializableTest();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

