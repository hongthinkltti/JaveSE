package section02;

import java.util.Scanner;

public class ScnnerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scan.next();
		address = scan.next();
		age = scan.nextInt();
		weight = scan.nextDouble();
		
		System.out.printf("당신의 이름은 %s 입니다.\n", name);
		System.out.printf("당신의 주소는 %s 입니다.\n", address);
		System.out.printf("당신의 나이는 %s 입니다.\n", age);
		System.out.printf("당신의 몸무게는 %.1fkg 입니다.\n", weight);
	}

}
