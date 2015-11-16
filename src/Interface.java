import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by mrchebik on 13.08.15.
 */

public class Interface extends JFrame {
    public static void main(String[] args) throws IOException {
        Asks a = new Asks(new JFrame(), "6 Вопросов на Сообразительность");
        Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
        a.setIconImage(icon);
        a.setSize(288 - a.OS, 170 + a.OS);
        a.validate();
        a.setResizable(false);
        a.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        a.setLocationRelativeTo(null);
        a.setLayout(null);
        a.setVisible(true);
    }
}
