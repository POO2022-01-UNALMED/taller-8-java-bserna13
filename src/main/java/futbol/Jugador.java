package futbol;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        //super() lo pone el compilador
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public int compareTo(Object objeto){
        Futbolista futbolista = (Futbolista) objeto;
        return Math.abs(this.getEdad() - futbolista.getEdad());
    }

    public boolean jugarConLasManos(){
        return false;
    }

    public String toString(){
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

}

