package thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame implements Runnable {
	 int y = 200;
	    int height = 200;

	    Thread pourWater;
	    Thread useWater;
	    Thread controller;

	    public WaterTank() {
	        super("Water Tank");
	        setBackground(Color.CYAN);
	        setSize(500, 500);
	        setVisible(true);
	        this.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        });

	        pourWater = new Thread(this);
	        useWater = new Thread(this);
	        controller = new Thread(this);

	        pourWater.setName("PW");
	        useWater.setName("UW");
	        controller.setName("CN");

	        pourWater.start();
	        useWater.start();
	        controller.start();
	    }

	    @Override
	    public void paint(Graphics g) {
	        g.drawRect(150, 100, 200, 300);
	        g.setColor(Color.RED);
	        g.fillRect(150, y, 200, height);
	        g.drawString("70%", 380, 200);
	    }

	    @Override
	    public void run() {

	        Thread currentThread = Thread.currentThread();

	        if (currentThread.getName().equals("PW")) {
	            while (true) {
	                y = y - 3;
	                height = height + 3;
	                repaint();
	                try {
	                    Thread.sleep(200);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        } else if (currentThread.getName().equals("UW")) {
	            while (true) {
	                y = y + 3;
	                height = height - 3;
	                repaint();
	                try {
	                    Thread.sleep(280);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        } else if (currentThread.getName().equals("CN")) {
	            while (true) {
	                if (y < 140) {
	                    synchronized (this) {
	                        pourWater.suspend();
	                    }
	                    System.out.println("suspended" + " " + y + " " + height);
	                } else {
	                    synchronized (this) {
	                        pourWater.resume();
	                    }
	                    System.out.println("resumed");
	                }
	                repaint();
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e) {
	                    // e.printStackTrace();
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Frame mf = new WaterTank();
	        mf.setSize(500, 500);
	        mf.setVisible(true);
	    }
}
