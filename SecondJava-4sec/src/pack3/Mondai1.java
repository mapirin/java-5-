package pack3;

public class Mondai1 {
	public static void main(String[] args) {
		int[][] seiseki= {{65,80,75},{100,90,90},{40,30,0}};
		
		int[] Tensu= {0,0,0};
		for(int i=0;i<seiseki.length;i++) {
			for(int j=0;j<seiseki.length;j++) {
				Tensu[i]+=seiseki[i][j];
			}
		}
		for(int i:Tensu) {
			System.out.println(i);
		}
	}
}
