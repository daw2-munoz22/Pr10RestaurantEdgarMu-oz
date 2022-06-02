/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr10matrizclaseedgar;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Jupiter
 */
public class Restaurante {
    private Vector<String[]> Speiseplan = new Vector<String[]>();
    private List<String> Auseahl = new ArrayList<String>();    
    private String[] Name = new String[]{"APERETIUS", "PRIMERS", "SEGONS", "POSTRES", "BEGUDES", "CAFES"};
    
    public Restaurante(){
        
    }
    
    public void Menu(){
        Lista tapas = new Lista();
        Speiseplan.add(tapas.getAperitivos());
        Speiseplan.add(tapas.getSegundos());
        Speiseplan.add(tapas.getPostres());
        Speiseplan.add(tapas.getBebidas());
        Speiseplan.add(tapas.getPostres());
    }
    
    public void verLista(){
        int i = 0;
        
        for(String[] listaCompleta : Speiseplan){                        
            System.out.println("\n" + Name[i]);
            for(String apat : listaCompleta){
                System.out.println(apat);           
            }
           
            int tama = listaCompleta.length;           
                i++;
     
        }
    }
    
    public void Seleccionar(){
        for(String element : Auseahl){
            
            System.out.println(element);
        }
    }
}
