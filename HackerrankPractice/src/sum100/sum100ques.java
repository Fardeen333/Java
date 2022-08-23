package sum100;

public class sum100ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=8;i++) {
			int sum =0;
			for(int j =1; j<=10; j++) {
				Integer a = i;
				Integer b = i+1;
				String c1 = a.toString()+b.toString();
				Integer c = Integer.parseInt(c1);
				if(i==j) {
					sum+=c;
					j++;
				}else {
					sum+=j;
				}
			}
			System.out.println(sum);
		}
	}

}
