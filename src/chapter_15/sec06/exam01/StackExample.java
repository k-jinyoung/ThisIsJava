package chapter_15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//Stack 컬렉션 생성 : Coin 객체 형태로 저장
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(1000));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		
		Coin coin = coinBox.pop();
		System.out.println(coin.getValue());
		
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(5000));
		
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		
		coinBox.push(new Coin(50000));
		
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		coin = coinBox.pop();
		System.out.println(coin.getValue());
		
		
		
		// push 7번이 나왔으니 pop도 7번 나와야한다.
		
		
		//동전 하나씩 꺼내기
		/*while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	//coinBox가 비워있지 않다면 계속 실행
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}*/
	}

}
