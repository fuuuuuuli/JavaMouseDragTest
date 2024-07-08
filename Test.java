import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class Test {
	public static void main(String[] args) {
		GameWindow gw = new GameWindow("テストウィンドウ", 400, 300);
		gw.add(new DrawCanvas());// 描画領域の追加
		gw.setVisible(true);
	}
}


// ウィンドウクラス
class GameWindow extends JFrame {
	public GameWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}


// 描画する紙を表すクラス
class DrawCanvas extends JPanel implements ActionListener, MouseMotionListener ,MouseListener{

	Point RectPoint = new Point();

	public void paint(Graphics g) {
		addMouseMotionListener(this);
		addMouseListener(this);
		super.paintComponent(g);
		g.fillRect((int) RectPoint.getX() - 25, (int) RectPoint.getY() - 25, 50, 50);// 矩形の塗りつぶし

	}

	public void actionPerformed(ActionEvent e) {

	}

	public void mouseDragged(MouseEvent e) {
		RectPoint = e.getPoint();
		repaint();
	}

	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		RectPoint = e.getPoint();
		repaint();
		// throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		RectPoint = e.getPoint();
		repaint();
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
	}
}
