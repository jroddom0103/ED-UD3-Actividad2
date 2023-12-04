/*
 * Para cambiar este encabezado de licencia, selecciona License Headers in Project Properties.
 * Para cambiar este archivo de plantilla, elige Tools | Templates
 * y abre la plantilla en el editor.
 */
package actividad_02_ud3_ed;

/**
 * Clase que representa una cuenta.
 * @author jroddom0103
 * @version 2.0
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

   /**
    * Constructor de la clase CCuenta
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta
    * @param sal Saldo 
    * @param tipo Tipo de interés
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
  /**
   * Modifica el identificador del nombre de la cuenta
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
   /**
    * Devuelve nombre
    * @return nombre de la cuenta
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * Ingresa dinero a la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Saca dinero de la cuenta
    * @param cantidad
    * @throws Exception 
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Devuelve la cuenta
     * @return cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Modifica el identificador de la cuenta
   * @param cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Modifica el identificador del saldo
   * @param saldo 
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Devuelve el tipo de interés
  * @return Tipo de interés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Modifica el identificador del saldo
   * @param tipoInterés 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
