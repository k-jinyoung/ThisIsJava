package chapter_08.sec05;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨: " + volume);
	}
	private int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음처리 합니다.");
			setVolume(this.memoryVolume);
		}
		//RemoteControl.super.setMute(mute);
	}
	
	
}
