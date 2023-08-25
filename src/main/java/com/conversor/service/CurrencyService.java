package com.conversor.service;

import com.conversor.model.Conversor;
import com.conversor.model.itemsModel;
import com.conversor.view.Options;

import java.util.Map;

public class CurrencyService extends Conversor{

    private final Map<String, Double> monedas = itemsModel.currency();

    public void myCountryToOther(){
        begin();
        setMiddle("pesos son ");
        setConverted(getAmount()/getValue(getSelection(), monedas));
        showResult();
    }

    public void otherToMyCountry(){
        begin();
        setMiddle(getSelection() + " son ");
        setConverted(getAmount()*getValue(getSelection(), monedas));
        setSelection(" pesos");
        showResult();
    }

    public void begin(){
        setAmount(getAmountOption("Ingrese monto: "));
        setSelection(Options.optionsCombo("Selecciona la moneda","Monedas", monedas));
    }
}
