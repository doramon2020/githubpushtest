package homework;

import java.util.*;

public class CalTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			LinkedList<Integer> numX = ThirdMethod.check(1,"請輸入x的值",sc);
			LinkedList<Integer> numY = ThirdMethod.check(1,"請輸入y的值",sc);
			Calculator cal = new Calculator();
			
			try {
				cal.powerXY((int)numX.get(0), (int)numY.get(0));
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
				e.getStackTrace(); // 這行沒有作用，為什麼
				e.printStackTrace();
			}
		}
	}
	
}
