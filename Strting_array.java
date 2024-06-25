package Anudip;

public class Strting_array {

	public static void main(String[] args) {
		Student[] students = new Student[4];

		 students[0] = new Student("vijji", 1, 95);
	     students[1] = new Student("jay", 2, 96);
	     students[2] = new Student("vinay", 3, 97);
	     students[3] = new Student("vijay", 4, 98);
		

	
	for(Student  str : students) {
		System.out.println(str);
		
	}
	System.out.println("str");
}

}
