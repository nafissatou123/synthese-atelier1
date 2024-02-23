package org.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name="Compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde ;

    @XmlTransient
    private Date datemontant ;

    public Compte(int code, double solde, Date datemontant) {
        this.code = code;
        this.solde = solde;
        this.datemontant = datemontant;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatemontant() {
        return datemontant;
    }

    public void setDatemontant(Date datemontant) {
        this.datemontant = datemontant;
    }

}



