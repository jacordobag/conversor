package com.conversor.model;

import com.conversor.exception.NoneValueException;
import com.conversor.view.Options;

import javax.swing.*;
import java.util.Map;
import java.util.Optional;


public class Conversor {

    private Double amount;
    private String selection;
    private Double converted;

    private String middle;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public Double getConverted() {
        return converted;
    }

    public void setConverted(Double converted) {
        this.converted = converted;
    }

    public String getMiddle(){
        return this.middle;
    }

    public void setMiddle(String middle){
        this.middle = middle;
    }
    public Double getValue(String optionCase, Map<String, Double> monedas){
        Optional<Double> convert =  monedas.entrySet().stream()
                .filter(m->m.getKey().equals(optionCase))
                .map(Map.Entry::getValue)
                .findFirst();
        if(convert.isEmpty()){
            throw new NoneValueException();
        }
        Double convertDouble = convert.get();
        return convertDouble;
    }

    public Double getAmountOption(String message){
        Double validAmount = 0.0;
        int validated = 0;
        while (validated == 0){
            try {
                validAmount = Double.valueOf(Options.optionsInput(message));
                validated = 1;
            }catch (NumberFormatException e){
                JOptionPane.showConfirmDialog(null, "Debe ingresar un numero",
                        "Error!!!", JOptionPane.CLOSED_OPTION,
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        return validAmount;
    }

    public void showResult(){
        String message =  this.amount + " "  + this.middle + " " + this.converted + " " + this.selection;
        JOptionPane.showMessageDialog(null,message,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }


}


