/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame frame;
	JPanel panel;
	int randy;
	
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	
	int hiddenbutton;
 
	//2 create an int variable called hiddenButton
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String Input = JOptionPane.showInputDialog("Enter a positive number");
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		int input  = Integer.parseInt(Input);
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		buttons = new JButton[input];
		//9 add the panel to the window
		
		for(int i = 0; i<buttons.length;i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
			
		}
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		frame.add(panel);
		frame.pack();
		//11. set the JFrame to visible.
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//12. Give the user the instructions for the game.
		frame.setVisible(true);
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		JOptionPane.showMessageDialog(null, "there is a hidden button...  tryo to find it my clickin on it");
		//14. Set the text of the JButton located at hiddenButton to  "ME"
randy = new Random().nextInt(input);
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
buttons[randy].setText("ME");
		//16. Set the text of the JButton located at hiddenButton to be blank.
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//16. Set the text of the JButton located at hiddenButton to be blank.
buttons[randy].setText("");
}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked==buttons [randy]) {
			buttons[randy].setText("It was me");           
			JOptionPane.showMessageDialog(null, "You win");
			System.exit(0);
			
		}
		else
			
			 
		{
			JOptionPane.showMessageDialog(null, "try again");
		}
		//18. else tell them to try again
	}
}
