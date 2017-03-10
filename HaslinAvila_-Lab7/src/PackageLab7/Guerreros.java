package PackageLab7;

public abstract class Guerreros {
    private String nombre;
    private String nick;
    private double atk;
    private double def;
    private double HP;
    private double pts;
    private static final long SerialVersionUID = 666L;
    
    public Guerreros() {
    }

    public Guerreros(String nombre, String nick, double atk, double def, double HP, double pts) {
        this.nombre = nombre;
        this.nick = nick;
        this.atk = atk;
        this.def = def;
        this.HP = HP;
        this.pts = pts;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getPts() {
        return pts;
    }

    public void setPts(double pts) {
        this.pts = pts;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public abstract void Ataque(Guerreros warrior);
}
