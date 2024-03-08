package coracao;

import java.awt.*;
import javax.swing.*;

public class Coracao extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.RED);

        // Desenhar parte esquerda do coração
        g2d.fillArc(110, 30, 50, 50, 0, 180);
        g2d.fillArc(80, 30, 50, 50, 0, 180);

        // Desenhar parte direita do coração
        int[] xPoints = {80, 120, 160};
        int[] yPoints = {50, 120, 50};
        g2d.fillPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);
        frame.add(new Coracao());
        frame.setVisible(true);
    }
}

