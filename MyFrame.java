import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements KeyListener{

	Draw drawing;

	public MyFrame(){
		this.drawing = new Draw();
	}

	public void keyPressed(KeyEvent e){
		
		if(e.getKeyCode() == KeyEvent.VK_W){
			drawing.moveUp();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			drawing.moveDown();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D){
			drawing.moveRight();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A){
			drawing.moveLeft();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP){
			drawing.attack();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			drawing.atk();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			drawing.swirlatk();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			drawing.jump();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT){
			drawing.slide();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			drawing.bow();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_Q){
			drawing.smrslt();
			System.out.println("pos: " + drawing.x + "," + drawing.y);
		}
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){

	}


    public static void main(String args []){
    MyFrame gameFrame = new MyFrame();
    
    gameFrame.setSize(900,550);
    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameFrame.setVisible(true);
    gameFrame.setResizable(false);
    gameFrame.getContentPane().add(gameFrame.drawing);
    gameFrame.addKeyListener(gameFrame);
    System.out.println("pratical prog");

    
        
    }
}