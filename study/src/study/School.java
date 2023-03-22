package study;

public class School {
	
	// 학교이름
	
	String school;
	// 학생이름
	String name;
	//  성적
	int score;
	//  등수
	int ranking;
	
	// 생성자 선언
	
	public School(String school, String name, int score) {
		this(school, name, score, 0);
		this.ranking = 0;
		/* this.school = school;
		this.name = name;
		this.score = score; */
	// 아직 만들어지기 전이라  ranking 호출 불가 	
	}
	
	public School(String school, String name, int score, int ranking) {
		this.school = school;
		this.name = name;
		this.score = score;
		this.ranking = ranking;
	}
}
