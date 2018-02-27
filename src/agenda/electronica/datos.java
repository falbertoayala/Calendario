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
public class datos {
    private String UserMails, nameMails;

    public datos() {
    }

    public datos(String UserMails, String nameMails) {
        this.UserMails = UserMails;
        this.nameMails = nameMails;
    }

    public String getUserMails() {
        return UserMails;
    }

    public void setUserMails(String UserMails) {
        this.UserMails = UserMails;
    }

    public String getNameMails() {
        return nameMails;
    }

    public void setNameMails(String nameMails) {
        this.nameMails = nameMails;
    }
    
    
}
