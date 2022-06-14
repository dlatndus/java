public class Args{
	public static void main(String args[]){ //배열 ARRAY args에 qewrty써도 ㄱㅊ 근데 밑에도 써야됨
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
	} //명령행 매개변수(argument)
}