import javax.swing.JOptionPane;

//Ricarda Hill
//September 15, 2017
//U1L02: 

public class MakingChange2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount."
				+ "Use dollars and cents. \nExample: 1.56");
		double num = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "You entered " + num);
		
	}

}
