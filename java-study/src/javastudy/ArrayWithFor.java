package javastudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		System.out.println(iarray.length); //배열의 길이를 잴 수 있음.
		
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;			
		}
		
		int sum = 0; //반복문 안에서 변수를 선언하면 계속 새롭게 선언되므로 밖에서 선언한다.
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);
	}

}
