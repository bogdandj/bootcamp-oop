package projekat_21_05;

public class z3 {

	public static void main(String[] args) {
		
		VideoPlayer player = new VideoPlayer(340, 210, 55, 144);
		Control player1 = new TimeControl(false);
		Control player2 = new AudioControl(true);
		Control player3 = new QualityOptimizerControl(20);
		
		
		player1.executeAction(player);
		
		player.print();
		player2.executeAction(player);
		player.print();
		player3.executeAction(player);
		player.print();
	}

}
