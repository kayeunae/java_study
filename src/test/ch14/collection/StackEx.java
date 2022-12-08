package test.ch14.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
	
		//동전 꺼내기
		//isEmpty(): 비어있는지? 비어있으면 true, 비어 있지 않으면 false
		while(!coinBox.isEmpty()) {	//비어있지 않다면 반복
			Coin coin = coinBox.pop();	//가져오기
			System.out.println("꺼내온 동전: " + coin.getValue());
		}
	}

}
