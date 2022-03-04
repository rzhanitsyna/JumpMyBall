package org.ball.app.util;

import org.ball.app.entity.AgentEntity;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BaseForm extends JFrame {
    private static String APP_TITLE = "Прыгай мой мячик";
    private static Image APP_ICON = null;

    static {
        try {
            APP_ICON = ImageIO.read(BaseForm.class.getClassLoader().getResource("icon.png"));
        } catch (Exception e) {
            e.printStackTrace();
            DialogUtil.showError(null, "Не удалось найти картинку");
        }
    }

    public BaseForm(int width, int height) {
        setTitle(APP_TITLE);
        setMinimumSize(new Dimension(width, height));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(
                Toolkit.getDefaultToolkit().getScreenSize().width/2-width/2,
                Toolkit.getDefaultToolkit().getScreenSize().height/2-height/2
        );
        if (APP_ICON != null){
            setIconImage(APP_ICON);
        }
    }
}
