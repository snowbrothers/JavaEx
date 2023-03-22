package study;

public class SchoolMain {

	public static void main(String[] args) {
		
		School rank = new School("북산고등학교", "강백호", 20, 670);
		
		System.out.println(rank.school);
		System.out.println(rank.name);
		System.out.println(rank.score);
		System.out.println(rank.ranking);
		
		System.out.println("==== 배열을 통한출력 =====");
		
		School[] rankArr = new School[4];
		rankArr[0] = new School("북산고등학교", "강백호", 20, 670 ); 
		rankArr[1] = new School("북산고등학교", "서태웅", 25, 660 ); 
		rankArr[2] = new School("산왕 공고", "정우성", 60, 570 ); 
		rankArr[3] = new School("산왕 공고", "이명헌", 90, 32 );
		
		for(School school : rankArr) {
			
			System.out.println(" =================== ");
			System.out.println(school.school);
			System.out.println(school.name);
			System.out.println(school.score);
			System.out.println(school.ranking);
			System.out.println(" =================== ");
		
		}
		
	}

}
