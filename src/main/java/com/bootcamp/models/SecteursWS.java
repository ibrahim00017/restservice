/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.models;

import com.bootcamp.jpa.entities.Secteur;
import java.util.List;

/**
 *
 * @author root
 */
public class SecteursWS {
    private List<Secteur> secteur;
    private String errorMessage;
    
    

    public SecteursWS() {
    }

    public List<Secteur> getSecteur() {
        return secteur;
    }

    public void setSecteur(List<Secteur> secteur) {
        this.secteur = secteur;
    }

   
   
    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    
}
