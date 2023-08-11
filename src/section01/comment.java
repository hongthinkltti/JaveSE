package section01;
/*
 * 
 */
public class comment {
	public static void main(String[] args) {
		System.out.println("Hello, JAVA!");
		
		getArea(10);
	}
	/**
	 * 원의 넓이구하기
	 * 
	 * 반지름을(r) 입력하여 원의 넓이를 출력한다.
	 * @param r - 반지름
	 */
	public static void getArea(int r) {
		
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이: " + area);
	}
}
