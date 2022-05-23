package week4.day1;

public  class sony implements AndroidTvDesign{

	
	public void changeChannel() {
		System.out.println("changeChannel");
		
	}

	
	public void changeVolume() {
		System.out.println("changeVolume");
		
	}
public static void main(String[] args) {
	AndroidTvDesign sony=new sony();
	sony.changeChannel();
	sony.changeVolume();
}
}