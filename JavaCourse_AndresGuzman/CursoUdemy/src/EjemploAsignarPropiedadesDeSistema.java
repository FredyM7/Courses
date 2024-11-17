import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            //Esto: System.getProperties().list(System.out);
            //Es similar a lo siguiente(listar las propertis del sistema desde un objeto tipo [Properties]):
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("System.getProperty(...) = " + System.getProperty("config.puerto.servidor"));
            System.out.println("System.getProperty(...) = " + System.getProperty("config.autor.nombre"));
            System.out.println("System.getProperty(...) = " + System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch (Exception e){
            System.err.println("No existe el archivo = " + e); //[clase system]En lugar de usar out, podemos utilizar el atributo err para mostrar errores en rojo.
            System.exit(1);

        }
    }
}
