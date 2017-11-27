/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.services;

import com.bootcamp.crud.CategorieCRUD;
import com.bootcamp.jpa.entities.Axe;
import com.bootcamp.jpa.entities.Pilier;
import com.bootcamp.jpa.entities.Secteur;
import com.bootcamp.models.AxeWS;
import com.bootcamp.models.AxesWS;
import com.bootcamp.models.PilierWS;
import com.bootcamp.models.PiliersWS;
import com.bootcamp.models.SecteurWS;
import com.bootcamp.models.SecteursWS;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component
public class CathegoriesService {
    //Creating  services for Axe
    public AxeWS create(Axe axe) throws SQLException {
        AxeWS axeWS = new AxeWS();
        CategorieCRUD.createAxe(axe);
        axeWS.setAxe(axe);
        return axeWS;
    }

    public AxesWS readAllAxe() throws SQLException {
        AxesWS axesWS = new AxesWS();
        List<Axe> axes = CategorieCRUD.findAllAxe();
        axesWS.setAxes(axes);
        return axesWS;
    }

    public AxeWS readAxeById(int id) throws SQLException {
        AxeWS axeWS = new AxeWS();
        Axe axe = CategorieCRUD.findByIdAxe(id);
        axeWS.setAxe(axe);
        return axeWS;
    }

    public AxesWS readAAxesByProperty(String attribut, String value) throws SQLException {
        AxesWS axesWS = new AxesWS();
        List<Axe> axes = CategorieCRUD.findByPropertyAxe(attribut, value);
        return axesWS;
    }

    public AxesWS readAxesByCriteria() throws SQLException {

        AxesWS axesWS = new AxesWS();

        //List<Pilier> projets = CategorieCRUD.findByCriterias(, sens, 0, 0);
        //piliersWS.setProjet(projets);
        return axesWS;

    }

    public AxeWS updateAAxeById(Axe axe) throws SQLException {

        AxeWS axeWS = new AxeWS();

        Axe axeWSFind = CategorieCRUD.findByIdAxe(axe.getId());

        if (axeWSFind != null) {

            CategorieCRUD.updateAxe(axe);

            axeWS.setAxe(axe);

        }

        return axeWS;

    }

    public AxeWS deleteAAxeById(int id) throws SQLException {

        AxeWS axeWS = new AxeWS();

        Axe axeFind = CategorieCRUD.findByIdAxe(id);

        if (axeFind != null) {

            CategorieCRUD.deleteAxe(axeFind);
            axeWS.setAxe(axeFind);
        }

        return axeWS;

    }

    //Creating  services for Pilier
    public PilierWS create(Pilier pilier) throws SQLException {
        PilierWS pilierWS = new PilierWS();
        CategorieCRUD.create(pilier);
        pilierWS.setPilier(pilier);
        return pilierWS;
    }

    public PiliersWS readAllPilier() throws SQLException {
        PiliersWS piliersWS = new PiliersWS();
        List<Pilier> piliers = CategorieCRUD.findAll();
        piliersWS.setPiliers(piliers);
        return piliersWS;
    }

    public PilierWS readPilierById(int id) throws SQLException {
        PilierWS pilierWS = new PilierWS();
        Pilier pilier = CategorieCRUD.findById(id);
        pilierWS.setPilier(pilier);
        return pilierWS;
    }

    public PiliersWS readAPilierByProperty(String attribut, String value) throws SQLException {
        PiliersWS piliersWS = new PiliersWS();
        List<Pilier> piliers = CategorieCRUD.findByProperty(attribut, value);
        return piliersWS;
    }

    public PiliersWS readPilierByCriteria() throws SQLException {

        PiliersWS piliersWS = new PiliersWS();

        //List<Pilier> projets = CategorieCRUD.findByCriterias(, sens, 0, 0);
        //piliersWS.setProjet(projets);
        return piliersWS;

    }

    public PilierWS updateAPilierById(Pilier pilier) throws SQLException {

        PilierWS pilierWS = new PilierWS();

        Pilier pilierWSFind = CategorieCRUD.findById(pilier.getId());

        if (pilierWSFind != null) {

            CategorieCRUD.update(pilier);

            pilierWS.setPilier(pilier);

        }

        return pilierWS;

    }

    public PilierWS deleteAPilierById(int id) throws SQLException {

        PilierWS pilierWS = new PilierWS();

        Pilier pilierFind = CategorieCRUD.findById(id);

        if (pilierFind != null) {

            CategorieCRUD.delete(pilierFind);
            pilierWS.setPilier(pilierFind);
        }

        return pilierWS;

    }

    //Creating  services for Secteur
    public SecteurWS create(Secteur secteur) throws SQLException {
        SecteurWS secteurWS = new SecteurWS();
        CategorieCRUD.createSecteur(secteur);
        return secteurWS;
    }

    public SecteursWS readAllSecteur() throws SQLException {
        SecteursWS secteursWS = new SecteursWS();
        List<Secteur> secteurs = CategorieCRUD.findAllSecteur();
        secteursWS.setSecteur(secteurs);
        return secteursWS;
    }

    public SecteurWS readSecteurById(int id) throws SQLException {
        SecteurWS secteurWSpilierWS = new SecteurWS();
        Secteur secteur = CategorieCRUD.findByIdSecteur(id);
        secteurWSpilierWS.setSecteur(secteur);
        return secteurWSpilierWS;
    }

    public SecteursWS readASecteursByProperty(String attribut, String value) throws SQLException {
        SecteursWS secteursWS = new SecteursWS();
        List<Secteur> secteurs = CategorieCRUD.findByPropertySecteur(attribut, value);
        return secteursWS;
    }

    public SecteursWS readSecteursByCriteria() throws SQLException {

        SecteursWS secteursWS = new SecteursWS();

        //List<Secteurs> projets = CategorieCRUD.findByCriterias(, sens, 0, 0);
        //secteursWS.setSecteur(secteur);
        return secteursWS;

    }

    public SecteurWS updateASecteurById(Secteur secteur) throws SQLException {

        SecteurWS secteurWS = new SecteurWS();

        Secteur pilierWSFind = CategorieCRUD.findByIdSecteur(secteur.getId());

        if (pilierWSFind != null) {

            CategorieCRUD.updateSecteur(secteur);

            secteurWS.setSecteur(secteur);

        }

        return secteurWS;

    }

    public SecteurWS deleteASecteurById(int id) throws SQLException {

        SecteurWS secteurWS = new SecteurWS();

        Secteur secteurFind = CategorieCRUD.findByIdSecteur(id);

        if (secteurFind != null) {

            CategorieCRUD.deleteSecteur(secteurFind);
            secteurWS.setSecteur(secteurFind);
        }

        return secteurWS;

    }
}
