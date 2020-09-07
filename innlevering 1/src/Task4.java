

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Task4 {

	public static void main(String[] args) {
		
		int userGrossPay = parseInt(showInputDialog("Write in your income"));
		String taxTxt = ("and you pay this amount in tax ");
		
		if (userGrossPay <= 180800)
			showMessageDialog(null, "You don't have tax");
		
		
			else { if (userGrossPay <= 254500) {
				double taxLvl = (userGrossPay * 1.90) / 100;
				showMessageDialog(null,"You are at tax level 1, "+ taxTxt + taxLvl  );
			}
			else if (userGrossPay <= 639750) {
				double taxLvl = (userGrossPay * 4.2) /100;
				showMessageDialog(null,"You are at tax level 2, "+ taxTxt + taxLvl );		
			}
			else if (userGrossPay <= 999550) {
				double taxLvl = (userGrossPay * 13.2) /100;
				showMessageDialog(null,"You are at tax level 3, "+ taxTxt + taxLvl);		
			}
			else if (userGrossPay >= 999551) {
				double taxLvl = (userGrossPay * 16.2) /100;
				showMessageDialog(null,"You are at tax level 4, "+ taxTxt + taxLvl);		
			}
		}
	}
}