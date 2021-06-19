package g4s22p10viktoralcan.Almacen;

import g4s22p10viktoralcan.Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
    
    public void grabar(Datos datos){
        
        try {
            FileWriter archivo = new FileWriter("datos.txt", true);
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write(datos.getNombre() + "\n");
            bw.write(datos.getEdad() + "\n");
            bw.close();   
        }
        catch(Exception ex){    ex.printStackTrace();    }
    }
    
    public List<Datos> leer(){
        
        List<Datos> Listadatos = new ArrayList<>();
        Datos datos;
        String cadena = "";
        
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);
            while ((cadena = br.readLine())!=null){
                 datos = new Datos();
                 datos.setNombre(cadena);
                 cadena = br.readLine();
                 datos.setEdad(Integer.parseInt(cadena));
                 Listadatos.add(datos);
            }
        }
        
        catch(Exception ex){    ex.printStackTrace();   }
        
        return Listadatos;
    }
    
}