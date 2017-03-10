package PackageLab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminAlumnos {
    private ArrayList<Guerreros> listaAlumnos = new ArrayList();
    private File archivo = null;

    public AdminAlumnos() {
    }

    public AdminAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerreros> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaPersonas(ArrayList<Guerreros> listaAlumnoss) {
        this.listaAlumnos = listaAlumnoss;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaAlumnos + "";
    }
    
    public void setAlumnos(Alumnos p){
        this.listaAlumnos.add(p);
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Guerreros t : listaAlumnos) {
                bw.write(t.getNombre() + "; ");
                bw.write(t.getNick() + "; ");
                bw.write(t.getAtk() + "; ");
                bw.write(t.getDef() + "; ");
                bw.write(t.getHP() + "; ");
                bw.write(t.getPts() + "; ");
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        listaAlumnos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String nom, nick, carrera;
                double atk, def, hp, pts;
                int ncuenta, edad;
                nom = sc.next();
                nick = sc.next();
                atk = sc.nextDouble();
                def = sc.nextDouble();
                hp = sc.nextDouble();
                pts = sc.nextDouble();
                carrera = sc.next();
                ncuenta = sc.nextInt();
                edad = sc.nextInt();
                
                listaAlumnos.add(new Alumnos(ncuenta, carrera, edad, nom, nick, atk, def, hp, pts));
            }
        } catch (Exception e) {
        } finally {
            try {
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}
