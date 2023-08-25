package com.conversor.service;

import com.conversor.model.Conversor;
import com.conversor.model.itemsModel;
import com.conversor.view.Options;

import java.util.Map;

public class TemperatureService extends Conversor {
    private final Map<String, Double> temperatures = itemsModel.temperature();

    public void celsiusToOther(){
        begin();
        setMiddle("grados celsius son ");
        if(getSelection()=="Fahrenheit"){
            setConverted((getAmount()*1.8)+getValue(getSelection(), temperatures));
        }else {
            setConverted(getAmount()+getValue(getSelection(), temperatures));
        }
        showResult();
    }

    public void otherToCelsius(){
        begin();
        setMiddle(getSelection() + " son ");
        if(getSelection()=="Fahrenheit"){
            setConverted((getAmount()-getValue(getSelection(), temperatures))*0.55555);
        }else {
            setConverted(getAmount()-getValue(getSelection(), temperatures));
        }
        setSelection(" grados celsius");
        showResult();
    }

    public void begin(){
        setAmount(getAmountOption("Ingrese la temperatura: "));
        setSelection(Options.optionsCombo("Selecciona la temperatura","Temperaturas", temperatures));
    }
}
