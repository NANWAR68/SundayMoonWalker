package upskill.test;

import java.util.HashMap;

public class HashMapExercise {
	
	public static void main(String[] args){
		
		HashMap <Integer, String> StudentName = new HashMap <Integer, String>();
		
		StudentName.put(1,"Fayyaz");
		StudentName.put(32,"Anwar");
		StudentName.put(31,"Lipu");
		StudentName.put(28,"Rafsan");
		
		System.out.println(StudentName.get(1));
		System.out.println(StudentName.get(32));
		System.out.println(StudentName.get(31));
		System.out.println(StudentName.get(28));
//devLipu
	}
}


