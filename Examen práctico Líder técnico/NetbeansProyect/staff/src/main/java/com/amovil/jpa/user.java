
package com.amovil.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author herso
 */
@Entity
@Table(name="t_usuario")
public class user {
    
    @Id
    @Column(name="id_user")
    private int idUser;
    
    @Column(name="email_user")
    private String emailUser;
    
    @Column(name="pass_user")
    private String passUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }
    
    public user(){}

}
