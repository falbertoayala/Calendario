/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.electronica;

/**
 *
 * @author Desarrollo
*/
import java.util.Scanner;
public class AgendaElectronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion =0;
        Scanner leer = new Scanner (System.in);
        Menu menu = new Menu();
        String ckmail = "";
        System.out.println("B I E N V E N I D O   A   T U   A G E N D A   E L E C T R O N I C A");
        System.out.println("********************************************************************");
        System.out.println("Ingrese su correo: ");
        ckmail = leer.next();
        
        do {
            menu.imprimirMenu();
            System.out.print("Ingrese codigo>> ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                                   
                    System.out.println("Ingrese sus datos");
                    System.out.println("Nombre : ");
                    ckmail = leer.nextLine();
                    
                    break;
                    
                   
                case 2:
                    System.out.println(menu.getAllEmails());
                    break;
                case 3:
                    System.out.print("Ingrese Correo ");
                    String email = leer.nextLine();
                    System.out.println(email);
                    //stem.out.println(menu.getUseremails(Useremails);
                    break;
                default:
            }
            
        }while(opcion!=4);
        
        
       
}
}