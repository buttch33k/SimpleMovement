import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

	private BufferedImage image;
	private URL resource = getClass().getResource("run0.png");



	// circle s positon
	public int x = 30;
	public int y = 30;

	public Draw(){
		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();

		}
	}

	public void moveUp(){
		y=y - 5;
		repaint();
	}
	public void moveDown(){
		y=y + 5;
		repaint();
	}
	public void moveLeft(){
		x=x - 5;
		repaint();
	}
	public void moveRight(){
		x=x + 5;
		repaint();
	}
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(x,y,50,50);
        g.drawImage(image, x , y, this);


	}
}