public class Poderosos extends Buenos{
    String fuego;
    String explosion;
    String lava;
	
	public Poderosos(String name, String color, String tamano,int vida, int agilidad, int impacto, String fuego, String explosion, String lava){
		super(name, color,tamano,vida,agilidad,impacto);
        this.fuego = fuego;
        this.explosion = explosion;
        this.lava = lava;
	}
    
    //fuego
	public void setFuego(String fuego){
		this.fuego = fuego;
	}
	public String getFuego(){
		return "FUEGO";
    }
    
    //impacto
    public void setExplosion(String explosion){
		this.explosion = explosion;
	}
	public String getExplosion(){
		return "EXPLOSION";
    }

    //lava
    public void setLava(String lava){
		this.lava = lava;
	}
	public String getLava(){
		return "LAVA";
    }
    
}