package TextInheritance11;

public class TV implements Sound{
	
	private int SndLevel;
	
	public TV() 
	{
		SndLevel = 0;
	}

	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println(level + "Ƽ?? ???? ????");
	}
	
	public void SoundDown(int level) {
		if(SndLevel < 0) {
			SndLevel -= level;
			System.out.println(level + "Ƽ?? ???? ????");
		}
			
	}
}
