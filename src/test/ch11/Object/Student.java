package test.ch11.Object;

public class Student extends Object{
	//필드
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;	//필드에 초기값 할당
		this.name = name;
	}

	//메소드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
//		System.out.println("no: " + no + ", name: " + name.hashCode() );
		//String은 문자가 같으면 같은 주소가 들어있음.
		int hashCode = no + name.hashCode(); 
		// 번호와 이름이 같을때만 동일한 값이 생성됨
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 Student 객체를 가지고 있는지?
		if(obj instanceof Student) {
			Student target = (Student)obj; //강제 형변환
			//no과 name(String의 equals 사용함)이 같은지 비교.
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

}
