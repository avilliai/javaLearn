package learninging0910.javaCodeRain;

import javax.swing.*;
import java.util.Scanner;

public class Rain extends JFrame {
    private RainCanvas canvas = new RainCanvas(1920, 1080);

    public Rain(){
        super("Test");
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        canvas = new RainCanvas(this.getWidth(), this.getHeight());
//        canvas = new RainCanvas(800, 600);
        getContentPane().add(canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Rain rain = new Rain();
        rain.canvas.strartRain();
    }
}
