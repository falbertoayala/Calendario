/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.electronica;

import java.util.Scanner;

/**
 *
 * @author Desarrollo
 */
public class Menu {
    Scanner s;
    public Menu() {
    s = new Scanner(System.in);
    }
    
    public void imprimirMenu(){
        System.out.println("A G E N D A   E L E C T R O N I C A");
        System.out.println("-----------------------------");
        System.out.println("1.- Ingresa Correo.");
        System.out.println("2.- Ver Correos.");
        System.out.println("3.- Ver Agenda ");
        System.out.println("4.- Salir.");
        System.out.println("-----------------------------");
        int codigo = s.nextInt();
              
        /*
        1:
        emails e = new emails();
        e.insertagenda(3, "Usermails", "Namemails");

        */
    }
    public void imprimircorreo(){
        System.out.println("-----------------------------");
        System.out.println("1.- Ingresa Correo.");
        System.out.println("2.- Ingresa Nombre.");
        System.out.println("3.- Ingresa Agenda ");
        System.out.println("4.- Salir.");
        System.out.println("-----------------------------");
        int codigo = s.nextInt();
              
        /*
        1:
        emails e = new emails();
        e.insertagenda(3, "Usermails", "Namemails");

        */
    }
    
    
    
    
    public String getAllEmails(){
        emails emp = new emails();
        String resultado = emp.getInformacionTablaEmails();
        return resultado;
    }
    
    public String getUseremails(String Useremails){
        emails emp = new emails();
        String resultado =emp.getInformacionTablaEmails(Useremails);
        return resultado;
    }
    
    
}

