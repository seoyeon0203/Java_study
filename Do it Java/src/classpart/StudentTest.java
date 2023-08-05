package classpart;

public class StudentTest {

	public static void main(String[] args) {
		//studentAhn = 참조변수
		Student studentAhn = new Student();
		studentAhn.studentName="안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
