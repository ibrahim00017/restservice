/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.models;

import com.bootcamp.jpa.entities.Axe;
import java.util.List;

/**
 *
 * @author root
 */
public class AxesWS {
    private List<Axe>  axes;
    private String errorMessage;

    public List<Axe> getAxes() {
        return axes;
    }

    public void setAxes(List<Axe> axes) {
        this.axes = axes;
    }

   

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AxesWS() {
    }
    
    
}
