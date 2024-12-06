package com.example;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ObterData {

    public String ObterData(){
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dataAtual);
    }
}
