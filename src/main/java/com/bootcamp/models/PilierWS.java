/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.models;

import com.bootcamp.jpa.entities.Pilier;

/**
 *
 * @author root
 */
public class PilierWS {
    private Pilier pilier;
    private String errorMessage;

    public Pilier getPilier() {
        return pilier;
    }

    public void setPilier(Pilier pilier) {
        this.pilier = pilier;
    }

 
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public PilierWS() {
    }
    
    
}
