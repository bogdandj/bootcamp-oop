package projekat_21_05;

public class QualityOptimizerControl extends Control {

	private double internetSpeed;

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public QualityOptimizerControl(double internetSpeed) {
		super();
		this.internetSpeed = internetSpeed;
	}
	

	@Override
	public void executeAction(VideoPlayer player) {
		double quality = this.internetSpeed * 10.1;
		if(quality < 144) {
			quality = 144;
		} else if (quality > 144 && quality <= 240) {
			quality = 240;
		} else if (quality > 240 && quality <= 360) {
			quality = 360;
		} else if (quality > 360 && quality <= 480) {
			quality = 480;
		} else if (quality > 480 && quality <= 720) {
				quality = 720;
		} else if (quality > 720 && quality <= 1080) {
			quality = 1080;
		}
		player.setVideoQuality(quality);

	}

}
