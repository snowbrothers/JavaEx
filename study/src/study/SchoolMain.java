package study;

public class SchoolMain {

	public static void main(String[] args) {
		
		School rank = new School("북산고등학교", "강백호", 20, 670);
		
		System.out.printf("학교 : %s " ,rank.school);
		System.out.println(rank.name);
		System.out.println(rank.score + " 점 ");
		System.out.println(rank.ranking + " 등");
	}

}
