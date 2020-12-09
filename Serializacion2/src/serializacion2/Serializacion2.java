package serializacion2;
import java.io.*;
import java.util.*;
public class Serializacion2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"tornillos", "clavos", "tachas"};
        Double[] prezo = {3.0, 4.0, 5.0};
        
        try {

            FileOutputStream leer = new FileOutputStream("producto.txt");
            ObjectOutputStream escribir = new ObjectOutputStream(leer);

            for (int i = 0; i < 3; i++) {
                Producto obx = new Producto(cod[i], desc[i], prezo[i]);
                escribir.writeObject(obx);
            }
            escribir.writeObject(null);
            escribir.close();
            leer.close();

            FileInputStream leer2 = new FileInputStream("producto.txt");
            ObjectInputStream escribir2 = new ObjectInputStream(leer2);

            Object lectura = 0;

            while (lectura != null) {
                lectura = escribir2.readObject();
                System.out.println(lectura);
            }

            escribir2.close();
            leer2.close();

        } catch (FileNotFoundException ex) {
            System.out.println("System error on file ");
        }
    }
    
}
