package test.ch14.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//인터페이스 queue, 이를 가지고 linkedlist를 만들었따.
		Queue<Message> msgQ = new LinkedList(); 
		
		//메세지 넣기
		msgQ.offer(new Message("sendMain", "홍길동"));
		msgQ.offer(new Message("sendSMS", "김하서"));
		msgQ.offer(new Message("sendkakao1", "김자바"));
		
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
		
		
	}

}
