package singletone;

public class Main {

	public static void main(String[] args) {
		User[] user = new User[10];	//user 객체를 담을 배열 정의

		//배열에 객체를 넣어줌
		for(int i = 0; i < user.length; i++) {
			//user 객체를 생성해서 배열에 넣어준다.
			user[i] = new User("user" + i);	//user0, user1, ...
			user[i].print();
		}
	}

}
