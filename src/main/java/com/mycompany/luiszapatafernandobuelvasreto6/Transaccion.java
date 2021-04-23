
package com.mycompany.luiszapatafernandobuelvasreto6;

public class Transaccion extends Cuenta{
    
    String typeTrans;
    String fecha;
    float monto;
    float sumRetiro;
    
    public Transaccion(String typeTrans, String fecha, float monto){
    
        super();
        this.typeTrans = typeTrans;
        this.fecha = fecha;
        this.monto = monto;
        this.sumRetiro = sumRetiro;

    }
    
    public Transaccion(){
    
        this.typeTrans = null;
        this.fecha = null;
        this.monto = 0;
        this.sumRetiro = 0;
    
    }

    public float getSumRetiro() {
        return sumRetiro;
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

    public String getTypeTrans() {
        return typeTrans;
    }

    public void setSumRetiro(float sumRetiro) {
        this.sumRetiro = sumRetiro;
    }

    public String getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Tipo de transferencia: ");
        sb.append(typeTrans);
        sb.append("\nFecha: ");
        sb.append(fecha);
        sb.append("\nMonto: $"); 
        sb.append(monto);
        
        return sb.toString();
    }
    
}
