package UdeC.Monografia.SQLite;

public class Contrato_Monografia {

    interface ColumnasUsuario {
        String cedula = "cedula_usu";
        String nombre = "nombre_usu";
        String apellido = "apellido_usu";
        String fecha = "fecha_usu";
        String celular = "celular_usu";
        String foto = "foto_usu";
        String user = "user_usu";
        String correousu = "correo_usu";
        String contraseusu = "contrase_usu";
        String calleusu = "dcalle_usu";
        String barriousu = "dbarrio_usu";
        String ciudadusu = "dciudad_usu";
        String departamentousu = "ddeparta_usu";
        String apartamentousu = "dapartam_usu";
    }

    interface ColumnasTienda{
        String cedulatie = "cedula_usu";
        String codigotie = "codigo_tie";
        String nombretie = "nombre_tie";
        String imagentie = "imagen_tie";
        String descriptie = "descrip_tie";
        String localitie = "locali_tie";
    }

    interface ColumnasProductoMultimedia{
        String codigopropm = "codigo_pro_PM";
        String mulmepm = "multime_PM";
    }

    interface ColumnasProductoFactura{
        String codigopropf = "codigo_pro_PF";
        String codigofacpf ="codigo_fac_PF";
        String cantidadpf ="cantidad_PF";
    }

    interface ColumnasProducto{
        String codigopr ="codigo_pro";
        String nombrepro ="nombre_pro";
        String descrippro ="descrip_pro";
        String cantidadpro ="cantidad_pro";
        String preciopro ="precio_pro";
        String variacipro ="variaci_pro";
        String codigotiepro ="codigo_tie_pro";
        String cedulausupro ="cedula_usu_pro";
    }

    interface ColumnaFactura{
        String codigofac ="codigo_fac";
        String userusufac ="user_usu_fac";
        String metodofac ="metodo_fac";
    }

    interface ColumnasFacturaUsuario{
        String codigofacfu ="codigo_fac_fu";
        String userusufu ="user_usu_fu";
        String fechafu ="fecha_fu";
    }

    interface ColumnasTiendaUsuario{
        String cedulausutuetu =  "cedula_usu_tie_tu";
        String codigotietu = "codigo_tie_tu";
        String userusutu = "user_usu_tu";
    }

    public static class Usuario implements ColumnasUsuario{

    }
    public static class Tienda implements ColumnasTienda{

    }

    public static class ProductoMultimedia implements ColumnasProductoMultimedia{

    }

    public static class ProductoFactura implements ColumnasProductoFactura{

    }

    public static class Producto implements ColumnasProducto{

    }

    public static class Factura implements ColumnaFactura{

    }

    public static class FacturaUsuario implements ColumnasFacturaUsuario{

    }

    public static class TiendaUsuario implements ColumnasTiendaUsuario{

    }

}
