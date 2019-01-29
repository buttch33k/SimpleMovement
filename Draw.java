import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.Timer;

public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage background;
	private URL backgroundimage = getClass().getResource("bg1.jpg");
	private URL resource = getClass().getResource("run0.png");


	// circle s positon
	public int x = -10;
	public int y = 470;

	public int state = 0;

	public Draw(){
		try{
			background = ImageIO.read(backgroundimage);
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public void reloadImage(){
		state++;

        if (state == 0){
            resource = getClass().getResource("run0.png");
        }

        else if (state == 1){
            resource = getClass().getResource("run1.png");
        }

        else if (state == 2){
            resource = getClass().getResource("run2.png");
        }

        else if (state == 3){
            resource = getClass().getResource("run3.png");
        }
        
        else if (state == 4){
            resource = getClass().getResource("run4.png");
        }

        else if (state == 5){
            resource = getClass().getResource("run5.png");
            state = 0;
        }

        try {
            image = ImageIO.read(resource);
        }
        catch(IOException e){
            e.printStackTrace();
        }
	}
	public void swordAttackAnimation(){
		Thread sword1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 5; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("attack"+ctr+".png");
						}
						
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
				        repaint();
				        Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		sword1.start();
	}

	public void attack(){
		swordAttackAnimation();
	}

	public void moveUp(){
		y=y - 5;
		reloadImage();
		repaint();
	}
	public void moveDown(){
		if(y > 470){
			y = 470;
		}
		y=y + 5;
		reloadImage();
		repaint();
		
	}
	public void moveLeft(){
		if(x < 5){
			x = 5;
		}
		x=x - 5;
		reloadImage();
		repaint();
		
	}
	public void moveRight(){
		x=x + 5;
		reloadImage();
		repaint();
		
	}
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.drawImage(image, x , y, this);
        


	}
}