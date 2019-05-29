
public class MainGUI {
	
	private Players[] PlayersBoard = new Players[4];
	
	public MainGUI() {
		
		DataBase questions = new DataBase();
		ClassicMode classicMode = new ClassicMode(questions , questions.CategoryTable[0][1]); //sthn defterh parametro kanonika pername thn kathgoria poy epilegei o xristis
																							  //apla evala thn prwti gia na to testarw 
                                                                                              
		String aName = " ";	                       //apla vazw kena onomata stous xristes
		for(int i=0; i<4 ; i++) {              
			PlayersBoard[i] = new Players(aName);  
		}

	}
}
