import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args) {
		int jumsu = 59;
		if(jumsu>=60) {
			System.out.println("축하합니다. 합격입니다.");
		}else {
			System.out.println("저도 유감입니다. 다음에 다시 응시해 주세요.");
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 어느 계절을 좋아하시나요(spring/summer/fall/winter)?:");
		String season = sc.nextLine();
		
		//Spring -> equals메소드 : 문자를 비교하여 같으면 true 다르면 false 를 뽑아낸다.
		if(season.equals("spring")) {
			System.out.println("진달래, 개나리");
		}else if(season.equals("summer")) {
			System.out.println("장미, 아카시아");
		}else if(season.equals("fall")) {
			System.out.println("코스모스, 백합");
		}else if(season.equals("winter")){
			System.out.println("동백, 매화");
		}else {
			System.out.println("잘못입력하였습니다.");
		}
	}
}