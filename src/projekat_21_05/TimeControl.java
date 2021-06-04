package projekat_21_05;

public class TimeControl extends Control {

	private boolean turnRight;

	public boolean isVolumeChange() {
		return turnRight;
	}

	public void setVolumeChange(boolean volumeChange) {
		this.turnRight = volumeChange;
	}

	public TimeControl(boolean volumeChange) {
		super();
		this.turnRight = volumeChange;
	}

	@Override
	public void executeAction(VideoPlayer player){
		double timer = 15;
		if (turnRight == true) {
			player.setCurrentTime(player.getCurrentTime() + timer);
		} else {
			player.setCurrentTime(player.getCurrentTime() - timer);
		}

		if (player.getCurrentTime() >= player.getVideoLenght()) {
			player.setCurrentTime(player.getVideoLenght());
		} else if (player.getCurrentTime() <= 0) {
			player.setCurrentTime(0);
		}
	}

}