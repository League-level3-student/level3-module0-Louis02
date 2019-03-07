import javax.swing.JOptionPane;

public class Mod0CheckPoint {
public static void main(String[] args) { 
	int[] intArray = new int[5];
	for(int i = 0; i<intArray.length;i++) {
		String InputDialogue = JOptionPane.showInputDialog("Enter any natural number");
		int input = Integer.parseInt(InputDialogue);
		intArray[i] = input;
	}
int total = 0;
	for(int i = 0; i<intArray.length;i++) {
		total+=intArray[i];
	}
	
JOptionPane.showMessageDialog(null, total);
}
}
