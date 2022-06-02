/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr10matrizclaseedgar;

/**
 *
 * @author Jupiter
 */
class Lista {
    private String[] aperitivos = new String[]{"canapes", "pates", "formatges"};
    private String[] entrantes = new String[]{"amanida", "sopa", "pure"};
    private String[] segundo = new String[]{"canalos", "bistec", "bacalla"};
    private String[] postres = new String[]{"fruita", "gelat", "pastis"};
    private String[] bebidas = new String[]{"aigua", "refresc", "vi"};
    private String[] cafes = new String[]{"cafe", "infusion", "licor"};
    
    public String[] getAperitivos(){
        return aperitivos;
    }
    public String[] getEntrantes(){
        return entrantes;
    }
    public String[] getSegundos(){
        return segundo;
    }
    public String[] getPostres(){
        return postres;
    }
    public String[] getBebidas(){
        return bebidas;
    }
    public String[] getCafes(){
        return cafes;
    }
}
