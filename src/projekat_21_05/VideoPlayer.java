package projekat_21_05;

public class VideoPlayer {
	
	private double videoLenght;
	private double currentTime;
	private double volume;
	private double videoQuality;
	
	public double getVideoLenght() {
		return videoLenght;
	}
	public void setVideoLenght(double videoLenght) {
		this.videoLenght = videoLenght;
	}
	public double getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getVideoQuality() {
		return videoQuality;
	}
	public void setVideoQuality(double d) {
		this.videoQuality = d;
	}
	public VideoPlayer(double videoLenght, double currentTime, double volume, int videoQuality) {
		super();
		this.videoLenght = videoLenght;
		this.currentTime = currentTime;
		this.volume = volume;
		this.videoQuality = videoQuality;
	}
	
	public void print() {
		System.out.println(this.currentTime);
		System.out.println(this.volume);
		System.out.println(this.videoQuality);
	}

}
