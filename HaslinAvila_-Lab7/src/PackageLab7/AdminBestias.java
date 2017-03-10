package PackageLab7;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.tree.DefaultTreeModel;

public class AdminBestias {
    private ArrayList<Guerreros> listaBestias = new ArrayList();
    private File archivo = null;
    private
    
    public AdminBestias() {
    }

    public AdminBestias(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerreros> getListaBestias() {
        return listaBestias;
    }

    public void setListaPersonas(ArrayList<Guerreros> listaBestiass) {
        this.listaBestias = listaBestiass;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return listaBestias + "";
    }
    
    public void setBestias(Bestias p){
        this.listaBestias.add(p);
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Guerreros t : listaBestias) {
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
        listaBestias = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()){
                String nom, nick;
                double atk, def, hp, pts;
                
                nom = sc.next();
                nick = sc.next();
                atk = sc.nextDouble();
                def = sc.nextDouble();
                hp = sc.nextDouble();
                pts = sc.nextDouble();
                
                listaBestias.add(new Guerreros(nom, nick, atk, def, hp, pts));
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
