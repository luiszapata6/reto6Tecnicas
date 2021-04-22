
package com.mycompany.luiszapatafernandobuelvasreto6;

import java.util.ArrayList;


public class Transaccion extends Cuenta{
    
    String typeTrans;
    String fecha;
    float monto;
    private ArrayList<Transaccion> listaTrans;
    
    public Transaccion(String typeTrans, String fecha, float monto){
    
        super();
        this.typeTrans = typeTrans;
        this.fecha = fecha;
        this.monto = monto;

    }
    
    public Transaccion(){
    
        this.typeTrans = null;
        this.fecha = null;
        this.monto = 0;
        this.listaTrans = null;
    
    }

    public void setTypeTrans(String typeTrans) {
        this.typeTrans = typeTrans;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setListaTrans(ArrayList<Transaccion> listaTrans) {
        this.listaTrans = listaTrans;
    }
    
    

    public String getTypeTrans() {
        return typeTrans;
    }

    public String getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }

    public ArrayList<Transaccion> getListaTrans() {
        return listaTrans;
    }
    
    
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        
        sb.append("\nTipo de transferencia: ");
        sb.append(typeTrans);
        sb.append("\nFecha: ");
        sb.append(fecha);
        sb.append("\nMonto: "); 
        sb.append(monto);
        
        return sb.toString();
    }
    
}
