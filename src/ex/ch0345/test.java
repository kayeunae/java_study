package ex.ch0345;

public class test {

	public static void main(String[] args) {
		
		int c = 0;
		int d = 0;
		
			for (int i = 0; i<300; i++) {
				if(d>=100) {
					break;
				}else if(i%2 == 0) {
					d -= i;
					c++;
				}else if (i%2 == 1) {
					d +=i;
					c++;
				}
			}
			
		System.out.println(c);
	}

}
