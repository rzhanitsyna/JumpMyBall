package org.ball.app;

import org.ball.app.entity.AgentEntity;
import org.ball.app.ui.AgentTableForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * главный класс
 */
public class App {
    public static void main(String[] args) {
        new AgentTableForm();
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/demotest5","root","1234");
    }
}
