package com.objectEx;

public class Member {
	public static void main(String[] args) {
		Member member = new Member("id");
		Member member2 = new Member("id");
		
		// 두 객체를 비교하는 equal;
		member.equals(member2);
		System.out.println("member.equlas(mem2) : ");
		System.out.println(member.equals(member2));
	
	}
	
	// 필드
	private String id;
	
	public Member(String id) {
		this.id = id;
	}

	/**
	 * Member객체가 가지고 있는 id 값과
	 * 매개변수로 받은 Object의 id 값이 일치하는지 비교
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			System.out.println("objuect.equals() 결과 : " + super.equals(obj));
			System.out.println("Member.equals() 결과 : " 
									+ getId().equals(member.id) );
			
			if(getId().equals(member.id)) {
				return true;
			} else {
				return false;
			}
			
		}
		// if(this.id == ())
		
		// 객체가 가지고 있는 id 값이 같다면 true ; 아니면 false;
		
		return false; 
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
