package PackageLab7;

public abstract class Bestias extends Guerreros{

    public Bestias() {
    }

    public Bestias(String nombre, String nick, double atk, double def, double HP, double pts) {
        super(nombre, nick, atk, def, HP, pts);
    }
    
    public abstract void Ataque();

    @Override
    public String toString() {
        return "Bestias{" + '}';
    }
 
    
}
