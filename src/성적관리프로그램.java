
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.hakbun = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 100;
		jimin.mat = 100;
		jimin.total = jimin.kor+jimin.eng+jimin.mat;
		jimin.avg = jimin.total/3.0;
		System.out.println(jimin.avg);
		if(90<=jimin.avg && jimin.avg<=100) {
			jimin.grade='A';
		}
		else if( 80<=jimin.avg) {
			jimin.grade='B';
		}
		else if(70<=jimin.avg) {
			jimin.grade='C';
		}
		else if(60<=jimin.avg) {
			jimin.grade='D';
		}
		else {
			jimin.grade='F';
		}
		switch((int)(jimin.avg/10)) {
		case 10:
		case 9:
			System.out.println(jimin.grade);break;
		case 8:
			System.out.println(jimin.grade);break;
		case 7:
			System.out.println(jimin.grade);break;
		case 6:
			System.out.println(jimin.grade);break;
			default:
			System.out.println(jimin.grade);
		}
	}
}
