package org.ball.app.util;

import javax.swing.*;
import java.awt.*;

/**
 * класс для вывода уведомлений
 */
public class DialogUtil {
    public static void showError(Component component, String text) {
        JOptionPane.showMessageDialog(component, text, "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
    public static void showInfo(Component component, String text) {
        JOptionPane.showMessageDialog(component, text, "Информация", JOptionPane.INFORMATION_MESSAGE);
    }
}
