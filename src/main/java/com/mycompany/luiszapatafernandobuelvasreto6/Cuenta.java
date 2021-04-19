
package com.mycompany.luiszapatafernandobuelvasreto6;

import java.util.ArrayList;


public class Cuenta {
    
    private long idCuenta;
    private String pais;
    private String typeDoc;
    private long numDoc;
    private String nomTitu;
    private float saldoDispo;
    private float maxTrans;
    private int dayTrans;
    private ArrayList <Cuenta> cuentas;
    
    public Cuenta(long idCuenta, String pais, String typeDoc, long numDoc, 
            String nomTitu, float saldoDispo, float maxTrans, int dayTrans){
    
    this.idCuenta = idCuenta;
    this.pais = pais;
    this.typeDoc = typeDoc;
    this.numDoc = numDoc;
    this.nomTitu = nomTitu;
    this.saldoDispo = saldoDispo;
    this.maxTrans = maxTrans;
    this.dayTrans = dayTrans;
    this.cuentas = cuentas;
               
    }
    
    
    public Cuenta(){
    
    this.idCuenta = 0;
    this.pais = null;
    this.typeDoc = null;
    this.numDoc = 0;
    this.nomTitu = null;
    this.saldoDispo = 0;
    this.maxTrans = 0;
    this.dayTrans = 0;
    this.cuentas = null;
               
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public void setNumDoc(long numDoc) {
        this.numDoc = numDoc;
    }

    public void setNomTitu(String nomTitu) {
        this.nomTitu = nomTitu;
    }

    public void setSaldoDispo(float saldoDispo) {
        this.saldoDispo = saldoDispo;
    }

    public void setMaxTrans(float maxTrans) {
        this.maxTrans = maxTrans;
    }

    public void setDayTrans(int dayTrans) {
        this.dayTrans = dayTrans;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public String getPais() {
        return pais;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public long getNumDoc() {
        return numDoc;
    }

    public String getNomTitu() {
        return nomTitu;
    }

    public float getSaldoDispo() {
        return saldoDispo;
    }

    public float getMaxTrans() {
        return maxTrans;
    }

    public int getDayTrans() {
        return dayTrans;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    

}
