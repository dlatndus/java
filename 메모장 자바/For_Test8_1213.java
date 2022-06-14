public class For_Test8_1213{
	public static void main (String args[]){

		int count=0;
		for(int i =1; i<=100; i++){
			if((13*i)>100) break; //사실....break아직 안배웠는데....c에서는 배워서.........이거 써서 넘어가는 방법 밖에는 생각이 안나서.....썼습니다....
			if(((13*i)%i)==0) count++;
			System.out.print(13*i+"\t");
		}
		System.out.println();
		System.out.print("개수 = "+count+"개");
	}
}