import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;


public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage backgroundImage;
	public URL resource = getClass().getResource("character/run0.png");


	// circle s positon
	public int x = -10;
	public int y = 470;
	public int height = 0;
	public int width = 0;

	public int state = 0;

	public Random randomizer;

	public int enemyCount;
	Monster[] monsters = new Monster[20];

	public Draw(){
		randomizer = new Random();
		spawnEnemy();

		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("bg1.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		height = image.getHeight();
		width = image.getWidth();

		startGame();
	}

	public void startGame(){
		Thread gameThread = new Thread(new Runnable(){
			public void run(){
				while(true){
					try{
						for(int c = 0; c < monsters.length; c++){
							if(monsters[c]!=null){
								monsters[c].moveTo(x,y);
								repaint();
							}
						}
						Thread.sleep(100);
					} catch (InterruptedException e) {
							e.printStackTrace();
					}
				}
			}
		});
		gameThread.start();
	}

	public void spawnEnemy(){
		if(enemyCount < 10){
			monsters[enemyCount] = new Monster(randomizer.nextInt(500), randomizer.nextInt(500), this);
			enemyCount++;
		}
	}

	public void reloadImage(){
		state++;

        if (state == 0){
            resource = getClass().getResource("character/run0.png");
        }

        else if (state == 1){
            resource = getClass().getResource("character/run1.png");
        }

        else if (state == 2){
            resource = getClass().getResource("character/run2.png");
        }

        else if (state == 3){
            resource = getClass().getResource("character/run3.png");
        }
        
        else if (state == 4){
            resource = getClass().getResource("character/run4.png");
        }

        else if (state == 5){
            resource = getClass().getResource("character/run5.png");
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
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/attack"+ctr+".png");
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
	public void atkAnimation(){
		Thread atk1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 6; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/atk"+ctr+".png");
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
		atk1.start();
	}
	public void swirlAtkAnimation(){
		Thread swirlatk1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 6; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/swirlatk"+ctr+".png");
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
		swirlatk1.start();
	}
	public void jumpAnimation(){
		Thread jump1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 5; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/jump"+ctr+".png");
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
		jump1.start();
	}
	public void slideAnimation(){
		Thread slide1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 6; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/slide"+ctr+".png");
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
		slide1.start();
	}
	public void bowAnimation(){
		Thread bow1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 9; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/bow"+ctr+".png");
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
		bow1.start();
	}
	public void smrsltAnimation(){
		Thread smrslt1 = new Thread(new Runnable(){
			public void run(){
				for(int ctr = 0; ctr < 5; ctr++){
					try {
						if(ctr==4){
							resource = getClass().getResource("character/run0.png");
						}
						else{
							resource = getClass().getResource("character/smrslt"+ctr+".png");
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
		smrslt1.start();
	}
	public void swirlatk(){
		swirlAtkAnimation();
		reloadImage();
		repaint();
	}
	public void smrslt(){
		smrsltAnimation();
		reloadImage();
		repaint();
	}
	public void atk(){
		atkAnimation();
		reloadImage();
		repaint();
	}
	public void bow(){
		bowAnimation();	
		reloadImage();
		repaint();
	}
	public void slide(){
		slideAnimation();
		x = x + 20;
		reloadImage();
		repaint();
	}

	public void jump(){
		y = y - 20;
		jumpAnimation();
		reloadImage();
		repaint();
	}

	public void attack(){
		swordAttackAnimation();
		reloadImage();
		repaint();
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
        g.drawImage(backgroundImage, 0, 0, this);
        g.drawImage(image, x , y, this);

        g.drawImage(image, x, y, this);
        
        for(int c = 0; c < monsters.length; c++){
			if(monsters[c]!=null){
				// character grid for monsters
				// g.setColor(Color.BLUE);
				// g.fillRect(monsters[c].xPos, monsters[c].yPos+5, monsters[c].width, monsters[c].height);
				g.drawImage(monsters[c].image, monsters[c].xPos, monsters[c].yPos, this);
				g.setColor(Color.GREEN);
				g.fillRect(monsters[c].xPos+7, monsters[c].yPos, monsters[c].life, 2);
			}
		}
	}
}