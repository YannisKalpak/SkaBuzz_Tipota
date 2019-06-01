import java.util.*;


public class ClassicMode extends Modes{
	
	
	public ClassicMode(DataBase QuestionsData,String CurrentCategory,int CurrentCategoryPos,Players[] AllPlayers) {
		ModeName = "Classic Mode";
		Scanner input = new Scanner(System.in);
		
		ArrayList<Players> PlayersList = new ArrayList<Players>();
		for(int i=0;i<4;i++) {
			PlayersList.add( AllPlayers[i]);
		}
		
		
		QuestionsData.CompleteStack( CurrentCategoryPos );
		
		
		for(int i=0;i<8;i++) {
			for(Players CurrentPlayer : PlayersList) 
			{
				
				System.out.println("Σειρά του χρήστη " + CurrentPlayer.getPlayerName() + " για να παίξει");
				
				int CurrentQuestion = QuestionsData.PickingStack.peek();
			
				System.out.println(QuestionsData.Questions[CurrentQuestion]);            // ta minimata afta tha emfanizontai sto GUI
				System.out.println(QuestionsData.Answers[CurrentQuestion][0] + " " + QuestionsData.Answers[CurrentQuestion][1]);
				System.out.println(QuestionsData.Answers[CurrentQuestion][2] + " " + QuestionsData.Answers[CurrentQuestion][3]);
	
				int PlayersAnswer = input.nextInt() - 1;  //edw tha epistrefete i timi analoga me to ti exei pathsei o xristis 
			
				if(QuestionsData.CheckAnswer(PlayersAnswer,CurrentQuestion) == true) {
					System.out.println("Σωραίος");
					CurrentPlayer.addPoints(100);
				}
				else {
					System.out.println("Είσαι γτπ");
					QuestionsData.ShowCorrectAnswer(CurrentQuestion);
				}	
			} 
			QuestionsData.PickingStack.pop();
		}	
	}
}
