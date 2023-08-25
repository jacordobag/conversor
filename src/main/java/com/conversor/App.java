package com.conversor;

import com.conversor.model.itemsModel;
import com.conversor.service.CurrencyService;
import com.conversor.service.TemperatureService;
import com.conversor.view.Options;

import javax.swing.*;

public class App {

    public static void main(String args[]) {
        CurrencyService currencyService = new CurrencyService();
        TemperatureService temperatureService = new TemperatureService();
        int resp =0;
        while(resp == 0){
            String seleccion = Options.optionsCombo("Seleccione opcion de conversion",
             "Conversor", itemsModel.principalOptions());
            switch (seleccion) {
                case "Pesos a otra moneda" -> currencyService.myCountryToOther();
                case "Otra moneda a pesos" -> currencyService.otherToMyCountry();
                case "Celsius a otra temperatura" -> temperatureService.celsiusToOther();
                case "Otra temperatura a celsius" -> temperatureService.otherToCelsius();
                default -> {
                }
            }
            resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Finalizar", JOptionPane.YES_NO_OPTION);
        }
        JOptionPane.showMessageDialog(null,"Programa terminado", "Terminado",JOptionPane.INFORMATION_MESSAGE);
    }
}
