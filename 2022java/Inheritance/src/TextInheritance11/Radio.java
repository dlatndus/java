package TextInheritance11;

public class Radio implements Sound{
	
	private int SndLevel;
	
	public Radio() 
	{
		SndLevel = 0;
	}

	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println(level + "���� ���� ����");
	}
	
	public void SoundDown(int level) {
		if(SndLevel < 0) {
			SndLevel -= level;
			System.out.println(level + "���� ���� ����");
		}
			
	}
}