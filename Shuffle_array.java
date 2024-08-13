package assignment_5;

public class Shuffle_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,5,1,3,4,7};
		int n=3;
		Shuffle(arr,n);
		
	}
	public static void Shuffle(int []arr,int n) {
		int i=0;
		int j=n;
		int[]block=new int [arr.length];
		for (int k = 0; k < block.length; ) {
			block[k]=arr[i];
			block[k+1]=arr[j];
     		i++;
			j++;
			k=k+2;
			
		}
		for (int k = 0; k < block.length; k++) {
			System.out.print(block[k]+" ");
		}
	}

}
