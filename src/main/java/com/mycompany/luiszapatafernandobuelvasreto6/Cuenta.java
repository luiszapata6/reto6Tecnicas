
package com.mycompany.luiszapatafernandobuelvasreto6;


public class Cuenta {
    
    private long idCuenta;
    private String pais;
    private String typeDoc;
    private long numDoc;
    private String nomTitu;
    private float saldoDispo;
    private float maxTrans;
    private int dayTrans;
    private int contTrans;
    
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
    
    }
    
    public Cuenta(){
    
    this.idCuenta = 0;
    this.pais = null;
    this.typeDoc = null;
    this.numDoc = 0;
    this.nomTitu = null;
    this.saldoDispo = 0;
    this.maxTrans = 0;
    this.dayTrans = 6;
               
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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nN??mero de cuenta: ");
        sb.append(idCuenta);
        sb.append("\nPa??s: ");
        sb.append(pais);
        sb.append("\nTipo de documento del titular: "); 
        sb.append(typeDoc);
        sb.append("\nN??mero de documento del titular: ");
        sb.append(numDoc);
        sb.append("\nNombre completo del titular: ");
        sb.append(nomTitu);
        sb.append("\nSaldo disponible: ");
        sb.append(saldoDispo);
        sb.append("\nMonto m??ximo por transacci??n:: ");
        sb.append(maxTrans);
        sb.append("\nOperaciones permitidas por d??a: 6");

        return sb.toString();

    }
}
