package waitnotifyDemo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class wnotify extends JFrame implements Runnable {
	int rx = 10, gx = 10, dx = 10;

	public wnotify() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(800, 600);

		setTitle("LamboteNano");

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(rx, 150, 80, 80);
		g.setColor(Color.green);
		g.fillOval(gx, 250, 80, 80);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(dx, 350, 80, 80);

	}

	public static void main(String[] args) {

		wnotify obj = new wnotify();

		Thread t1 = new Thread(obj, "RED");
		Thread t2 = new Thread(obj, "green");
		Thread t3 = new Thread(obj, "DARK_GRAY");

		t1.start();
		t2.start();
		t3.start();

	}

	int i = 40;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				if (Thread.currentThread().getName().equals("RED")) {
					Thread.sleep(20);
					rx++;
					if (rx == 400) {
						synchronized (this) {
							wait();
						}
					}
				} else if (Thread.currentThread().getName().equals("green")) {
					Thread.sleep(30);
					gx++;
					if (gx == 400) {
						synchronized (this) {
							wait();
						}
					}

				} else {
					Thread.sleep(i);
					dx++;
					if (dx == 400) {
						synchronized (this) {
							notifyAll();
							Thread.sleep(i = 2);
						}
					}
				}
				repaint();

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
