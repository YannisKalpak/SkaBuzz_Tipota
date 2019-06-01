import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public  class DataBase {
	
	public Stack<Integer> PickingStack = new Stack<Integer>();
	public String[] Questions = new String[400];
	public String[][] Answers = new String[400][4];
	public int[] CorrectAnswers = new int[400];
	public int CurrentQuestion;
	public String[] CategoryNames = new String[8];
	public int[] CategoryPos = new int[8];
	

	
	public DataBase() {
		FillCategoryTable();
		
		
		Questions[0] = "Πόσα bits μας κάνουν 1 byte?";
		Answers[0][0] = "4";
		Answers[0][1] = "8";
		Answers[0][2] = "16";
		Answers[0][3] = "32";
		
		CorrectAnswers[0] = 1;
		
		Questions[1] = "Πόσα bits μας κάνουν 2 bytes?";
		Answers[1][0] = "4";
		Answers[1][1] = "8";
		Answers[1][2] = "16";
		Answers[1][3] = "32";
		
		CorrectAnswers[1] = 2;
		
	}
	

	public void CompleteStack(int CurrentCategoryPosition) {
		
		if(!PickingStack.empty()) {	
			PickingStack.clear();
		}
		
		for(int i = CurrentCategoryPosition * 50 - 50 ; i < CurrentCategoryPosition * 50 -48 ; i++) {
			PickingStack.push(i);
		}
		
			Collections.shuffle(PickingStack);
	}
	
	
	
	
	public boolean CheckAnswer(int PlayerAnswer,int CurrentQuestionPos) {
		if(PlayerAnswer == CorrectAnswers[CurrentQuestionPos]) {
			return true;
		}
		return false;
	}
	
	public void FillCategoryTable() {
		CategoryNames[0] = "Tech Questions";   
		CategoryNames[1] = "Category2";
		CategoryNames[2] = "Category3";
		CategoryNames[3] = "Category4";
		CategoryNames[4] = "Category5";
		CategoryNames[5] = "Category6";
		CategoryNames[6] = "Category7";
		CategoryNames[7] = "Category8";
		
		for(int i =0;i<8;i++) {
			CategoryPos[i] = i+1;
		}
		
	}
	
	public void ShowCorrectAnswer(int CurrentQuestion) {
		System.out.println("Η σωστή απάντηση είναι : " + Answers[CurrentQuestion][CorrectAnswers[CurrentQuestion]] );
	}
}	
