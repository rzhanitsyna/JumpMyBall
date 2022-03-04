package org.ball.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * класс сущности
 */

@Data
public class AgentEntity {
    private int ID;
    private String Title;
    private String AgentType;
    private String Address;
    private String Phone;
    private String Email;
    private String Logo;
    private double Priority;
    private ImageIcon Image;

    public AgentEntity(int ID, String title, String agentType, String address, String phone, String email, String logo, double priority) {
        this.ID = ID;
        this.Title = title;
        this.AgentType = agentType;
        this.Address = address;
        this.Phone = phone;
        this.Email = email;
        this.Logo = logo;
        this.Priority = priority;

        try {
            this.Image = new ImageIcon(ImageIO.read(AgentEntity.class.getClassLoader().getResource(logo)).getScaledInstance(50,50, java.awt.Image.SCALE_DEFAULT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

