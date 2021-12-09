package inteface;
import java.util.ArrayList;

public interface CRUD<T> {
    boolean create();
    ArrayList<T> read(String ruta);
    boolean update();
    boolean delete();

}
