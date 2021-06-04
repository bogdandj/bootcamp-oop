package projekat_21_05;

public class AudioControl extends Control {

	private boolean volumeUp;

	public boolean isVolumeChange() {
		return volumeUp;
	}

	public void setVolumeChange(boolean volumeChange) {
		this.volumeUp = volumeChange;
	}

	public AudioControl(boolean volumeChange) {
		super();
		this.volumeUp = volumeChange;
	}

	@Override
	public void executeAction(VideoPlayer player) {
		double change = 1;
		if (volumeUp == true) {
			player.setVolume(player.getVolume() + change);
		} else {
			player.setVolume(player.getVolume() - change);
		}

		if (player.getVolume() >= 100) {
			player.setVolume(100);
		} else if (player.getVolume() <= 0) {
			player.setCurrentTime(0);
		}

	}

}
