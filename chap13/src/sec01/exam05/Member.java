 package sec01.exam05;
//혼공자69강
 
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}
