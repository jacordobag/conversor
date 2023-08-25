package com.conversor.view;

import javax.swing.JOptionPane;
import java.util.Map;

public  class Options {

    public static String optionsCombo(String message, String title, Map<String, Double> maps){
        Object[] names = namesOptions(maps);
        Object seleccion = JOptionPane.showInputDialog(
        null,
        message,
        title,
        JOptionPane.QUESTION_MESSAGE,
        null,  // null para icono defecto
              names,
        names[0]);
        return seleccion.toString();
    }

    public static String optionsInput(String message){
        return JOptionPane.showInputDialog(
            null,
            message,
            "Ingresa",
            JOptionPane.QUESTION_MESSAGE);
    }

    public static Object[] namesOptions(Map<String, Double> maps){
        Object[] names = new Object[maps.size()];
        int i = 0;
        for (String k: maps.keySet()
             ) {
            names[i] = k;
            i++;
        }
        return names;
    }
    
}
