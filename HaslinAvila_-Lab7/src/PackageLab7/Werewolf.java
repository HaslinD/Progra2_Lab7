package PackageLab7;

public class Werewolf extends Bestias{

    public Werewolf() {
        super();
    }

    public Werewolf(String nombre, String nick, double atk, double def, double HP, double pts) {
        super(nombre, nick, atk, def, HP, pts);
    }
    
    public void Ataque(Guerreros war) {
        
        
    }

    @Override
    public String toString() {
        return super.toString()+"Werewolf{" + '}';
    }
    
    
}
