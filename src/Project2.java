import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("체중을 입력하시오 : ");
		double weight = sn.nextDouble();
		System.out.print("신장을 입력하시오 : ");
		int height = sn.nextInt();
		 
		double BMI = weight/((height*height)*0.0001);
		
		System.out.printf("%2.1f\n",BMI);
		
		if(BMI>=35) {
			System.out.println("고도 비만");
		}else if(30<=BMI&&BMI<=34.9) {
			System.out.println("중도 비만");
		}else if(25<=BMI&&BMI<=29.9) {
			System.out.println("경도 비만");
		}else if(23<=BMI&&BMI<=24.9) {
			System.out.println("과체중");
		}else if(18.5<=BMI&&BMI<=22.9) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
}
