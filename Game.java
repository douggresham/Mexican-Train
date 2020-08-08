//IMPORTS
public class Game {
	Bufferedreader bufferedreader = new BufferedReader(
	New InputStreamReader(System.in));

	player0 = new PLAYER("BLUE", 0, false);
	player1 = new PLAYER("GREEN", 0, false);
	player2 = new PLAYER("RED", 0, false);
	player3 = new PLAYER("PINK", 0, false);
	player4 = new PLAYER("PURPLE", 0, false);
	player5 = new PLAYER("BLUE", 0, false);
	player6 = new PLAYER("YELLOW", 0, false);
	player7 = new PLAYER("GREEN", 0, false);
	player8 = new PLAYER("DARK RED", 0, false);
	player9 = new PLAYER("PINK", 0, false);
	player10 = new PLAYER("PURPLE", 0, false);
	player11 = new PLAYER("ORANGE", 0, false);
	player12 = new PLAYER("SPARKLEY", 0, false);

	[] Player players = {
		player0, player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11, player12
	
	}

	System.out.println('How many players do you have?');
	int numPlayers = bufferedreader.readline();

	

	public static boolean checkOtherPlayerColors (int x) {
		for (int i = 0; i < players.length(); i++) {
			if (players[i][2] == true) {
				return true
			}
		}
	}


	public static int printAndChooseColors {
		//print out possible colors
		System.out.println("These are the colors available:")
		for int c = 0; c < colors.length(); c++ {
			System.out.println(colors[c][1] + ": " + colors[c][0])
		}
		
		//have new plaYer choose color
		System.out.println('Choose color');
		System.out.println('The numbers correspond to colors and used for responses');
		printAndChooseColors()
		for (int i = 1; i <= numPlayers; i++) {
			System.out.println("PLAYER " + i + " what color do yu prefer? (Enter  Number)")
			int color = bufferedreader.readline();
			for (int j = 1; j <= numPlayers; j++) { {
				if (color > 12) {
					System.out.println("That is not a valid color")
				
				elif checkOtherPlayerColors() {
					System.out.println("That color has been chosen")
				}
				else {
					System.out.println("Player " + i + "has been created")
					players[color][2] = true
				}
			}
		}
	}
}

