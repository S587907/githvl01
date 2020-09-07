import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Task6 {

	public static void main(String[]args) {
		
		
		int n = parseInt(showInputDialog("Write in your value"));
		int answer = 1;
		
			if (n >= 0) {
				for (int i = 1; i <= n; i++) {
					answer = answer * i;
			}
				showMessageDialog(null, answer);
				}
					else {
						showMessageDialog(null, "Your input can not be a negative number");
					}
	}
}