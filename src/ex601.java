import java.util.Scanner;

public class ex601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String[] myArr=new String[3];
		
		System.out.println("3개 문자열을 입력하세요: ");
		
		//사용자 입력 받기
		for(int i=1; i<3; i++) {
			myArr[i]=s.nextLine();
		}
		
		//사용자 입력 받
		for(int i=1; i<3; i++) {				
			System.out.println(myArr[i]+" ");
		}
	}

}
