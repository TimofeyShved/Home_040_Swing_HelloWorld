package com.Swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //наш класс, для запуска программы
        JFrame jFrame = new JFrame(){};

        // делаем видимость
        jFrame.setVisible(true);

        // добавляем операцию для выхода
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // набор инструментов, с нашими JFrame
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        //возвращяет значения нашего экрана
        Dimension dimension = toolkit.getScreenSize();

        // размеры окна
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 -150, 500, 300);
        //jFrame.setSize(500, 300);

        // надпись Title
        jFrame.setTitle("Hello");
        //jFrame.setIconImage(путь);
    }
}
