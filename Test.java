import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class Test{
	public static void main(String[] args) {
		GameWindow gw = new GameWindow("テストウィンドウ",400,300);
		gw.add(new DrawCanvas());//描画領域の追加
		gw.setVisible(true);
	}
}
 
//ウィンドウクラス
class GameWindow extends JFrame{
	public GameWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}
 
//描画する紙を表すクラス
class DrawCanvas extends JPanel implements ActionListener{
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100,100,50,50);//矩形
		g.fillRect(200,100,50,50);//矩形の塗りつぶし
        
	}

	public void actionPerformed(ActionEvent e) {
		
		this.repaint();
	}
}