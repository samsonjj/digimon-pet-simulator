package scene;

import gamestate.Agumon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




public class DigiPanel extends JPanel implements KeyListener {



    private Agumon dodo;

    public DigiPanel() {
        dodo = new Agumon();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }





    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        dodo.draw(g);

    }





    public void keyPressed(KeyEvent e) {
        // do nothing
    }

    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode()== KeyEvent.VK_1 && dodo instanceof Agumon) {
            dodo.Feed();
        }

        if(e.getKeyCode()== KeyEvent.VK_G && dodo instanceof Agumon) {
            dodo.Game();
        }

        if(e.getKeyCode()== KeyEvent.VK_LEFT && dodo instanceof Agumon) {
            dodo.Game();
        }

        if(e.getKeyCode()== KeyEvent.VK_RIGHT && dodo instanceof Agumon) {
            dodo.Game();
        }

        if(e.getKeyCode()== KeyEvent.VK_UP && dodo instanceof Agumon) {
            dodo.Game();
        }
    }

    public void keyTyped(KeyEvent e) {
        // do nothing
    }

}

