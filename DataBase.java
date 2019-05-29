import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public  class DataBase {
	
	public Stack<Integer> PickingStack = new Stack<Integer>();
	public String[] Questions = new String[400];
	public String[][] Answers = new String[400][4];
	public int[] CorrectAnswers = new int[400];
	public int CurrentQuestion;
	public String[][] CategoryTable = new String[8][2];
	

	
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
		
		for(int i = CurrentCategoryPosition * 50 - 50 ; i < CurrentCategoryPosition * 50 -48 ; i++) { //kanonika einai xwris to -48 apla to ekana gia testarw tis erwthseis poy evala
			PickingStack.push(i);
		}
			Collections.shuffle(PickingStack);
	}
	
	
	
	
	public boolean CheckAnswer(int PlayerAnswer) {
		if(PlayerAnswer == CorrectAnswers[CurrentQuestion]) {
			return true;
		}
		return false;
	}
	
	public void FillCategoryTable() {
		CategoryTable[0][0] = "Tech Questions";   
		CategoryTable[1][0] = "Category2";
		CategoryTable[2][0] = "Category3";			//edw tha boun onomata katigoriwn
		CategoryTable[3][0] = "Category4";
		CategoryTable[4][0] = "Category5";
		CategoryTable[5][0] = "Category6";
		CategoryTable[6][0] = "Category7";
		CategoryTable[7][0] = "Category8";
		
		for(int i =0;i<8;i++) {
			CategoryTable[i][1] = Integer.toString(i+1);
		}
		
	}
	
}	
	
