package uet.oop.bomberman.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Tiếp nhận và xử lý các sự kiện nhập từ bàn phím
 */
public class Keyboard implements KeyListener {
	
	private boolean[] keys = new boolean[120]; //120 is enough to this game
	public boolean up, down, left, right, space,W,A,S,D,B,N;
	
	public void update() {
		up = keys[KeyEvent.VK_UP] ;
		down = keys[KeyEvent.VK_DOWN] ;
		left = keys[KeyEvent.VK_LEFT] ;
		right = keys[KeyEvent.VK_RIGHT];
		space = keys[KeyEvent.VK_SPACE];
		N = keys[KeyEvent.VK_N];


		W =  keys[KeyEvent.VK_W];
		S =  keys[KeyEvent.VK_S];
		A =  keys[KeyEvent.VK_A];
		D = keys[KeyEvent.VK_D];
		B = keys[KeyEvent.VK_B];

	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

}
