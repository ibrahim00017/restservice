/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.models;

import com.bootcamp.jpa.entities.Secteur;

/**
 *
 * @author root
 */
public class SecteurWS {
    private Secteur secteur;
    private String errorMessage;
    
    

    public SecteurWS() {
    }

    /**
     * @return the secteur
     */
    public Secteur getSecteur() {
        return secteur;
    }

    /**
     * @param secteur the secteur to set
     */
    public void setSecteur(Secteur secteur) {
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
