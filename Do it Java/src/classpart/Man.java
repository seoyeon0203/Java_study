package classpart;

public class Man {

	int age = 40;
	String name ="james";
	boolean isMarried =true;
	int baby=3;
	
	public  void ManInfo() {
		System.out.println("이 사람의 나이 "+age);
		System.out.println("이 사람의 이름 "+name);
		System.out.println("이 사람의 결혼 여부 "+isMarried);
		System.out.println("이 사람의 자녀 수"+baby);
	}
	public static void main(String[] args) {
		Man man = new Man();
		man.ManInfo();

	}

}
