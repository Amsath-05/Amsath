package week4.day1;

public class MyMobiles {
public static void main(String[] args) {
	realme real=new realme();
	real.faceAuthentication();
	real.fingerPrint();
	
	samsungDesign sam=new realme();
	sam.fingerPrint();
	
	AndroidDesign rl=new samsung();
	rl.makeCall();
	rl.sendSms();
	rl.startPhone();
	
	AndroidTvDesign tv=new sony();
	tv.changeChannel();
	tv.changeVolume();
	
	
}
}
