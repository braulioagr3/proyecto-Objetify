import java.util.ArrayList;
public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    /**
     * Perminte agregar una cancion a la lista de reproducción
     * @Param Recibe como parametro el nombre a insertar
     */
    public void agregarCancion(String nombreArchivo)
    {
        this.canciones.add(nombreArchivo);
    }
    /**
     * Permite buscar cancion por numero
     * @Param Recibe como parametro un numero el cual le dice que canción buscar
     */
    public void reproducir(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }
    /**
     * Muestra el total de canciones existentes
     */
    public void totalCanciones()
    {
        System.out.println("El total de canciones es: "+canciones.size());
    }
}
/**
 * 
 */