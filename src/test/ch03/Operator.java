package test.ch03;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부호 연산자
		/*
		int x = -100;
		x = -x;
		System.out.println(x);
		*/
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("-----------------구분선");
		y--;
		--y;
		System.out.println("y= " + y);
		System.out.println("-----------------구분선");
		z = x++; //후위 연산자는 대입을 먼저하고 증가함.
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("-----------------구분선");
		z = ++x; //전위 연산자는 증가를 먼저하고 대입함.
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("-----------------구분선");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);		
		System.out.println("-----------------구분선");
	
		
	}

}


