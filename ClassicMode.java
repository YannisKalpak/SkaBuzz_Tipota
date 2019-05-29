import java.util.Scanner;

public class ClassicMode extends Modes{
	private int CurrentQuestion;
	
	public ClassicMode(DataBase QuestionsData,String CurrentCategory) {
		ModeName = "Classic Mode";
		Scanner input = new Scanner(System.in);
		
		QuestionsData.CompleteStack( Integer.parseInt(CurrentCategory) );
		
		int CurrentQuestion = QuestionsData.PickingStack.peek();
		
		System.out.println(QuestionsData.Questions[CurrentQuestion]);
		System.out.println(QuestionsData.Answers[CurrentQuestion][0] + " " + QuestionsData.Answers[CurrentQuestion][1]);
		System.out.println(QuestionsData.Answers[CurrentQuestion][2] + " " + QuestionsData.Answers[CurrentQuestion][3]);

		int PlayersAnswer = input.nextInt() - 1;
		
		if(QuestionsData.CheckAnswer(PlayersAnswer) == true) {
			System.out.println("Well done");
		}
		else {
			System.out.println("You suck noob");
			System.out.println("The correct answer was : " + QuestionsData.Answers[CurrentQuestion][QuestionsData.CorrectAnswers[CurrentQuestion]]);
			//mporoume na kanoyme kai mia sinartisi ReturnCorrectAnswer gia na min grafoume olo afto to palamari 
		}
		
	}
}
