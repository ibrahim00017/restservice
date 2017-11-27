/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.controllers;

import com.bootcamp.jpa.entities.Axe;
import com.bootcamp.jpa.entities.Pilier;
import com.bootcamp.jpa.entities.Secteur;
import com.bootcamp.models.AxeWS;
import com.bootcamp.models.AxesWS;
import com.bootcamp.models.PilierWS;
import com.bootcamp.models.PiliersWS;
import com.bootcamp.models.SecteurWS;
import com.bootcamp.models.SecteursWS;
import com.bootcamp.services.CathegoriesService;
import com.bootcamp.version.ApiVersions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.sql.SQLException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController("CathegoriesController")
@RequestMapping("/cathegories")
@Api(value = "Category API", description = "Cathegories API")
public class CathegoriesController {

    @Autowired
    CathegoriesService cathegoriesService;

   
    @RequestMapping(method = RequestMethod.POST, value = "/pilier")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new pilier", notes = "Create a new pilier")
    public ResponseEntity<PilierWS> createProjet(@RequestBody @Valid Pilier pilier) throws SQLException {
        PilierWS pilierWS = new PilierWS();
        try {
            pilierWS = cathegoriesService.create(pilier);
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<PilierWS>((PilierWS) pilierWS, httpStatus);
        } catch (SQLException e) {
            pilierWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<PilierWS>((PilierWS) pilierWS, httpStatus);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/axe")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new axe", notes = "Create a new axe")
    public ResponseEntity<AxeWS> createProjet(@RequestBody @Valid Axe axe) throws SQLException {
        AxeWS axeWS = new AxeWS();
        try {
            axeWS = cathegoriesService.create(axe);
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<AxeWS>((AxeWS) axeWS, httpStatus);
        } catch (SQLException e) {
            axeWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<AxeWS>((AxeWS) axeWS, httpStatus);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/secteur")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Create a new Secteur", notes = "Create a new Secteur")
    public ResponseEntity<SecteurWS> createProjet(@RequestBody @Valid Secteur secteur) throws SQLException {
        SecteurWS secteurWS = new SecteurWS();
        try {
            secteurWS = cathegoriesService.create(secteur);
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<SecteurWS>((SecteurWS) secteurWS, httpStatus);
        } catch (SQLException e) {
            secteurWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<SecteurWS>((SecteurWS) secteurWS, httpStatus);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/paliers")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Read all project", notes = "Read all project")
    public ResponseEntity<PiliersWS> readAllPilier() throws SQLException {
        PiliersWS piliersWS = new PiliersWS();
        try {
            piliersWS = cathegoriesService.readAllPilier();
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<PiliersWS>((PiliersWS) piliersWS, httpStatus);
        } catch (SQLException e) {
            piliersWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<PiliersWS>((PiliersWS) piliersWS, httpStatus);
        }

    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/axes")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Read all axe", notes = "Read all axe")
    public ResponseEntity<AxesWS> readAllAxe() throws SQLException {
        AxesWS axesWS = new AxesWS();
        try {
            axesWS = cathegoriesService.readAllAxe();
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<AxesWS>((AxesWS) axesWS, httpStatus);
        } catch (SQLException e) {
            axesWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<AxesWS>((AxesWS) axesWS, httpStatus);
        }

    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/secteurs")
    @ApiVersions({"1.0"})
    @ApiOperation(value = "Read all secteur", notes = "Read all secteur")
    public ResponseEntity<SecteursWS> readAllSecteur() throws SQLException {
        SecteursWS secteursWS = new SecteursWS();
        try {
            secteursWS = cathegoriesService.readAllSecteur();
            HttpStatus httpStatus = HttpStatus.OK;
            return new ResponseEntity<SecteursWS>((SecteursWS) secteursWS, httpStatus);
        } catch (SQLException e) {
            secteursWS.setErrorMessage(e.getMessage());
            HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<SecteursWS>((SecteursWS) secteursWS, httpStatus);
        }

    }
}
