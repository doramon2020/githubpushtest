package homework;

public class Calculator {

	public void powerXY(int x,int y) throws CalException {
		if(x == y && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else System.out.println((int)Math.pow(x, y));
	}
	
}
