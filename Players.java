
public class Players {
	private String PlayerName;
	private int Points;
	private int Lives;  //xreiazetai gia to SurvivalMode

	public  Players(String aName){
		this.Points = 0;
		this.PlayerName = aName;
		this.Lives = 4;
	}


	public String getPlayerName() {
		return PlayerName;
	}


	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}


	public int getPoints() {
		return Points;
	}
	
	public void addPoints(int points) {
		Points +=points;
	}
	
	public void removePoints(int points) {
		Points -=points;
	}


	public int getLives() {
		return Lives;
	}


	public void RemoveLive() {
		Lives -= 1;
	}

}
