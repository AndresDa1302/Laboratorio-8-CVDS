package edu.eci.cvds.test;


import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class ServiciosAlquilerTest {

    @Inject
    private final ServiciosAlquiler serviciosAlquiler;
	
	public ServiciosAlquilerTest() {
        serviciosAlquiler = ServiciosAlquilerFactory.getInstance().getServiciosAlquilerTesting();
       
    }
	
    @Before
    public void setUp() {
    }
	
/*    @Test
    public void emptyDB(){
        for(int i = 0; i < 100; i += 10) {
            boolean r = false;
            try {
                Cliente cliente = serviciosAlquiler.consultarCliente(i);
            } catch(ExcepcionServiciosAlquiler | IndexOutOfBoundsException e) {
                r = true;
            }
            // Validate no Client was found;
            Assert.assertTrue(r);
        }
    }
	
	
	 /** Cliente ya está registrado **/
/*    @Test
    public void ClienteYaRegistrado(){
        Cliente c2=new Cliente("Carlos Ramirez", 1026585663, "6584562", "KRA 59#27-a22", "carlos@hotmail.com", false,null);
        boolean r = false;
        try{
            serviciosAlquiler.registrarCliente(c2);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	/** Cliente a vetar no existe **/
/*    @Test
    public void vetarCliente(){
        boolean r = false;
        try{
            serviciosAlquiler.vetarCliente(0, true);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;   
        }
        Assert.assertTrue(r);

    }
	
	/** Item no registrado **/
/*    @Test
    public void consultarItem(){
        boolean r = false;
         try{
            serviciosAlquiler.consultarItem(0);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;   
        }
        Assert.assertTrue(r);
    }
	/** Item ya registrado **/
/*    @Test
    public void registrarItem(){
        Item i2=new Item(null, 2, "Halo 3", "Halo 3 es un videojuego de disparos en primera persona desarrollado por Bungie Studios.", java.sql.Date.valueOf("2007-09-08"), 3000, "DVD", "Shooter");
        boolean r = false;
        try{
            serviciosAlquiler.registrarItem(i2);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	/** 
     * Item no existe
     **/
 /*   @Test
    public void actualizarTarifaItem(){
        boolean r = false;
        try{
            serviciosAlquiler.actualizarTarifaItem(0, 0);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	/** Tipo item no existe **/
 /*   @Test
    public void consultarTipoItem(){
        boolean r = false;
        try{
            serviciosAlquiler.consultarTipoItem(0);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	/** Cliente no registrado **/
 /*   @Test
    public void consultarItemsCliente(){
        boolean r = false;
        try{
            serviciosAlquiler.consultarItemsCliente(0);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	 
    /** Item no rentado **/
 /*   @Test
    public void consultarMultaAlquiler(){
        boolean r = false;
        try{
            serviciosAlquiler.consultarMultaAlquiler(4,java.sql.Date.valueOf("2005-06-08"));
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
	/** item no disponible **/
/*    @Test
    public void consultarCostoAlquiler(){
        boolean r = false;
        try{
            serviciosAlquiler.consultarCostoAlquiler(1,5);
        }catch(ExcepcionServiciosAlquiler e){
            r = true;
        }
        Assert.assertTrue(r);
    }
  */ 
}