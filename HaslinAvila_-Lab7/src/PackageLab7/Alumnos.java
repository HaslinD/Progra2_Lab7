package PackageLab7;

public class Alumnos extends Guerreros{
    private int ncuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
    }

    public Alumnos(int ncuenta, String carrera, int edad, String nombre, String nick, double atk, double def, double HP, double pts) {
        super(nombre, nick, atk, def, HP, pts);
        this.ncuenta = ncuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"ncuenta=" + ncuenta + ", carrera=" + carrera + ", edad=" + edad;
    }

    @Override
    public void Ataque(Guerreros war) {
        double resta, vidaEnemigo, vidaWere, port;
        resta = this.getAtk()-war.getDef();
        vidaEnemigo = war.getHP() - resta;
        war.setHP(vidaEnemigo);
        port = this.getHP()*0.25;
        
    }

    
    
    
}
