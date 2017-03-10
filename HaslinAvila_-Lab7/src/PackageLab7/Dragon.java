package PackageLab7;

public class Dragon extends Bestias{

    public Dragon() {
        super();
    }

    public Dragon(String nombre, String nick, double atk, double def, double HP, double pts) {
        super(nombre, nick, atk, def, HP, pts);
    }
    
    public void Ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"Dragon{" + '}';
    }
    
    
}
