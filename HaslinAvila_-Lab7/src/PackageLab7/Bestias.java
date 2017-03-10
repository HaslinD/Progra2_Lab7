package PackageLab7;

public class Bestias extends Guerreros{

    public Bestias() {
    }

    public Bestias(String nombre, String nick, double atk, double def, double HP, double pts) {
        super(nombre, nick, atk, def, HP, pts);
    }
    
    @Override
    public String toString() {
        return "Bestias{" + '}';
    }

    @Override
    public void Ataque(Guerreros warrior) {
    }
 
    
}
