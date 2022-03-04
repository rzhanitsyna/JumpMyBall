package org.ball.app.ui;

import org.ball.app.entity.AgentEntity;
import org.ball.app.manager.AgentEntityManager;
import org.ball.app.util.BaseForm;
import org.ball.app.util.CustomTableModel;
import org.ball.app.util.DialogUtil;

import javax.swing.*;
import java.sql.SQLException;

public class AgentTableForm extends BaseForm {
    private JTable table;
    private JPanel mainPanel;
    private JLabel title;
    private JButton helpButton;
    private JButton askButton;

    private CustomTableModel<AgentEntity> model;

    public AgentTableForm() {
        super(1200, 800);
        setContentPane(mainPanel);

        initTable();

        setVisible(true);
    }

    public void initTable() {
        table.getTableHeader().setReorderingAllowed(false);
        table.setRowHeight(50);
        try {
            model = new CustomTableModel<>(
                    AgentEntity.class,
                    new String[]{"ID", "Название", "Тип агента", "Адрес", "Телефон", "Email", "Логотип", "Приоритет", "Картинка"},
                    AgentEntityManager.selectAll()
            );
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            DialogUtil.showError(this, "Ошибка получения данных: " + e.getMessage());
        }
        helpButton.addActionListener(e -> {
            DialogUtil.showInfo(this, "В данной таблице вы можете увидеть всю информацию об агентах");
        });
        askButton.addActionListener(e -> {
            DialogUtil.showInfo(this, "Для свящи с разработчиком напишите на почту lalal@mail.ru");
        });
    }
}
