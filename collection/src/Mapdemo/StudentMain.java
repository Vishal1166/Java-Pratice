package Mapdemo;

import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentInfo info=new StudentInfo();
		Map<String, Student> studmap=info.createMap();
		info.displayMap(studmap);

	}

}
