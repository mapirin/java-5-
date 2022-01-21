package pack4;

public class Mondai1 {
	public static void main(String[] args) {
		//for(String str:args) {
			//System.out.println(str);
		//}
			
		String[] score=new String[args.length];
		for(int i=args.length-1;i>=0;i--) {
			//逆転させる
			//ex)i=4->score[5-4-1]->score[0]
			score[args.length-i-1]=args[i];
		}
		for(String s:score) {
			System.out.println(s);
		}
	}
}
