
import static	javax.swing.JOptionPane.*;
import static	java.lang.Integer.*;



public class Task5 {
	
	public static void main(String[] args) {
		
		for (int stud = 1; stud <= 10; stud++) {
		int inputScore = parseInt(showInputDialog("Student test score"));
		String gradeTxt = ("You have gotten the grade ");
		
		
		

		
			//if (inputScore < 0 || inputScore > 100)
				//showMessageDialog(null, "Invalid score!");	
			
		//F=39-0, E=49-40, D=59-50, C=79-60, B=89-80, A=100-90
		
			while (inputScore < 0 || inputScore > 100 ) {
			 showMessageDialog(null, "Invalid score");
			 inputScore = parseInt(showInputDialog("Write a valid score"));
					}
		
				if (inputScore <= 39) {
					showMessageDialog(null, gradeTxt + "F");
					}
				else if (inputScore <= 49)  {
					showMessageDialog(null, gradeTxt + "E");
					}
				else if (inputScore <= 59)  {
					showMessageDialog(null, gradeTxt + "D");
					}
				else if (inputScore <= 79)  {
					showMessageDialog(null, gradeTxt + "C");
					}
				else if (inputScore <= 89)  {
					showMessageDialog(null, gradeTxt + "B");
					}
				else if (inputScore <= 100) {
					showMessageDialog(null, gradeTxt + "A");
					}
			
			
		}
	}
}

