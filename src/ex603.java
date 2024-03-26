
public class ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myGrades=new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0
		};
		double sum=0.0;
		double avg=0.0;
		
		/*for(double g:myGrades) {
			sum+=g;
		}
		
		avg=sum/myGrades.length;
		System.out.println("합계: "+ sum);
		System.out.format("평균: %.2f", avg);
		*/
		
		//2차원 배열
		double[][] myClassGrades=new double[][] {
				{89.1, 88.2, 89.3, 80.5, 90.1}, 
				{95.0, 90.2, 88.5, 89.3, 92.2}, 
				{87.7, 39.9, 52.7, 10.5, 80.4}, 
				{88.3, 88.8, 99.9, 99.0, 50.9}, 
				{17.0, 30.3, 74.2, 57.4, 100.0}
		};
		String[] myClasses=new String[] {
			"국어", "수학", "공학", "사회", "PE"
		};
		
		for(int i=0; i<myClasses.length; i++) {
			System.out.print(myClasses[i]+": ");
			for(int j=0; j<5; j++) {
				System.out.print(myClassGrades[i][j]+", ");
			}
			System.out.println();
		}
	}

}
