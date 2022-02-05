//imports
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//OvalDrawPlus inheriting from JFrame
public class OvalDrawPlus extends JFrame {

//initializing constants
static final int RED = 50;
static final int GREEN = 20;
static final int BLUE = 60;

//OvalDrawPlus Method
	public OvalDrawPlus() {
		super("OvalDrawPlus");
		//setting close option.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting size of JPanel
		setSize(500,400);
		//setting location of JPanel
		setLocation(250,0);
		//making JPanel visible
		setVisible(true);

		//setting up closing statement
		//WindowListener - this interface recieves window events aka
		//if the JPanel is exited, open, closed. it will invoke WindowEvent.
		//WindowEvent - this recieves the message that the window closed
		//here, when the window is closed, "Closing OvalDrawPlus..." is executed.
		addWindowListener (new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.out.println("Closing OvalDrawPlus... ");
			}
		});

	} 
      //setting up graphics/paint
      public void paint(Graphics g) {
      	//paint method is being overridden, therefore call paint method of
      	// superclass. this is done by super.paint(g);
		super.paint(g);
		//setting width and height equal to JPanel screen
		int width = getWidth();
		int height = getHeight();

		//drawing dark blue rectangle, then purple oval
		g.drawRect(0,3,width,height);
		//.darker() makes the blue color darker.
		g.setColor(Color.BLUE.darker());
		//filling dark blue color in rectangle
		g.fillRect(0,3,width,height);
		//drawing oval
		g.drawOval(0,3,width,height);


		//creating purple color with RGB
		Color NewColor = new Color(RED,GREEN,BLUE);
		g.setColor(NewColor);

		//filling oval
		g.fillOval(0,3,width,height);
	}

	//main class

	public static void main(String[] args) {
		System.out.println("Starting OvalDrawPlus..");
		OvalDrawPlus draw = new OvalDrawPlus();
	}
}
