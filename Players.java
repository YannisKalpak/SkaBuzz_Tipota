
public class Players {
	private String PlayerName;
	private int Points;
	

	public  Players(String playerName){
		this.Points = 0;
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


	public void setPoints(int points) {
		Points = points;
	}
	
}
