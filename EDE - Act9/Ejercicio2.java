public class Game {
  
  Player jugador;

  // ...

  public void movimiento(String direccion) {

    if (direccion.equalsIgnoreCase("Derecha")){
      jugador.setX(jugador.getX()+1);
    } else if (direccion.equalsIgnoreCase("Izquierda")) {
    	jugador.setX(jugador.getX()-1);
    } else if (direccion.equalsIgnoreCase("Arriba")) {
    	jugador.setY(jugador.getY()-1);
    } else if (direccion.equalsIgnoreCase("Abajo")) {
    	jugador.setY(jugador.getY()+1);
    }
  }
}

public class Player {
	private int x, y; // 'x' representa el eje horizontal
			  // 'y' representa el eje vertical

	public int getX(){
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY(){
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}

// Como no tengo el eclipse instalado en mi ordenador no puedo identificar
// que opciones de refactorización me recomienda pero me imagino que
// será la parte de los else if.