package test.ch12;

import test.ch12.InterfaceGeneric.Car;

public class GenericEx2 {

	public static void main(String[] args) {
		//generic을 통해 다양한 제품을 생산할 수 있다.
		Product<TV, String> product1 = new Product<>();
		//원래 타입은 TV 인데 객체를 넣어줌
		//TV kind = new TV()가 됨
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV t = product1.getKind();
		String tModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("전기자동차");
		
		Car c = product2.getKind();
		String cModel = product2.getModel();
	}

}
