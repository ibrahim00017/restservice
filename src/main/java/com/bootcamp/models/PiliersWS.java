/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.models;
import com.bootcamp.jpa.entities.Pilier;
import java.util.List;

/**
 *
 * @author root
 */
public class PiliersWS {
    private List<Pilier> piliers;
    private String errorMessage;

    public List<Pilier> getPilliers() {
        return piliers;
    }

    public void setPiliers(List<Pilier> pilliers) {
        this.piliers = pilliers;
    }

    

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public PiliersWS() {
    }
    
    
}
