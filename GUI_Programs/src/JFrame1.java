import javax.swing.*;
import java.awt.*;

public class JFrame1
{
	public static void main(String[] args)
	{
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;
		Font headlineFont = new Font("Ariel", Font.BOLD, 36);
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame aFrame = new JFrame("First Name");
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel greeting = new JLabel("Good day");
		greeting.setFont(headlineFont);
		aFrame.add(greeting);
	}
}
