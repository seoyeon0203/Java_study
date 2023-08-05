package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		//객체 생성?
		//student1 = 참조 변수인가 객체인가 인스턴스?
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 =  new Student();
		student2.studentName = "안승연";
		
		//참조 변수 값 출력 
		System.out.println(student1);
		System.out.println(student2);

	}

}
