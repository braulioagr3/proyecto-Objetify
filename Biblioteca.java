import java.util.ArrayList;
import java.util.Random;

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
     * Busca por medio del indice
     * @param numCancion Numero de la cancion que se desea encontrar
     */
    public void busqueda(int numCancion)
    {
        for(int i = 0; i<canciones.size();i++)
        {
            if(i == numCancion)
            {

                System.out.println("Cancion encontrada");
                this.reproducir(i);
            }
            else
            {
                System.out.println("Cancion no encontrada");
            }
        }
    }
    /**
     * Busca por medio del nombre
     * @param nomCancion Nombre de la cancion que se desea encontrar
     */
    public void busqueda(String nomCancion)
    {
        for(int i = 0; i<canciones.size();i++)
        {
            if(canciones.get(i) == nomCancion)
            {

                System.out.println("Cancion encontrada");
                this.reproducir(i);
            }
            else
            {
                System.out.println("Cancion no encontrada");
            }
        }
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
    
    /**
     * Permite borrar un elemento especifico de la biblioteca
     * @param numero Recibe el numero de la cancion que se quiere borrar
     */
    public void borraCancion(int numero)
    {
        canciones.remove(numero);
        System.out.println("El archivo fue elminado");
    }
    
    /**
     * Permite elimnar todos los Archivos de la coleccion
     */
    public void eliminaTodo()
    {
        canciones.clear();
        System.out.println("LA biblioteca fue vaciada");
    }
    
    /**
     * Genera un numero aleatorio para reproducir una cancion
     */
    public void reproduccionAleatoria()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        int Aletorio = aleatorio.nextInt(canciones.size());
        reproducir(Aletorio);
    }
}