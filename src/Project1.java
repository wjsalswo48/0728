
public class Project1 {
	public static void main(String[] args) {
		char ch = 'A';
		int count = 0;
		for(int i = 0; i<26; i++) {
			if(count<5) {
				System.out.printf("%c\t",ch+i);
				count++;
				if(count==5) {
					System.out.println();
				}
			}
			else if(5<=count&&count<10) {
				System.out.printf("%c\t",ch+i+32);
				count++;
				if(count==10) {
					System.out.println();
					count=0;
				}
			}
		}
	}
}
