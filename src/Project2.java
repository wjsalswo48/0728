import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Client jimin = new Client();
		System.out.print("Name:");
		jimin.name = sn.nextLine();
		
		
		System.out.print("Age:");
		jimin.age = sn.nextInt();
		sn.nextLine();
		
		System.out.print("Gender(남성:m/ 여성:f):");
		String gender = sn.nextLine();
		while(gender.charAt(0)!='m' && gender.charAt(0)!='f'){
			System.out.println("다시 입력하시오!:");
			gender = sn.nextLine();
		}
		jimin.gender=gender.charAt(0);
		
		System.out.print("Weight:");
		jimin.weight=sn.nextDouble();
		
		System.out.print("Height:");
		jimin.height=sn.nextDouble();
		
		jimin.bmi=jimin.weight/(jimin.height*jimin.height*0.0001); 
		double BMI = jimin.bmi;
		
//		System.out.print("체중을 입력하시오 : ");
//		double weight = sn.nextDouble();
//		System.out.print("신장을 입력하시오 : ");
//		int height = sn.nextInt();
//		 
//		double BMI = weight/((height*height)*0.0001);
//		
		System.out.printf("당신의 BMI수치는 : %2.1f 입니다.\n",BMI);
		
		if(BMI>=35) jimin.result ="고도 비만";
		else if(30<=BMI&&BMI<=34.9) {
			jimin.result = ("중도 비만");
		}else if(25<=BMI&&BMI<=29.9) {
			jimin.result = ("경도 비만");
		}else if(23<=BMI&&BMI<=24.9) {
			jimin.result = ("과체중");
		}else if(18.5<=BMI&&BMI<=22.9) {
			jimin.result = ("정상");
		}else {
			jimin.result = ("저체중");
		}
		System.out.println("당신은 "+jimin.result+"입니다.");
	}
}
