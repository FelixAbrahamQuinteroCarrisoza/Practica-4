public class Jefes extends Malos{
    int multiplicarse;
    int escudo;
	
	public Jefes(String name, String color, String tamano,int vida, int dano,String debilidad,int multiplicarse,int escudo){
		super(name, color,tamano,vida,dano,debilidad);
        this.multiplicarse = multiplicarse;
        this.escudo = escudo;
	}
    
    //multiplicarse
	public void setMultiplicarse(int multiplicarse){
		this.multiplicarse = multiplicarse;
	}
	public int getMultiplicarse(){
		return multiplicarse;
    }
    
    //escudo
    public void setEscudo(int escudo){
		this.escudo = escudo;
	}
	public int getEscudo(){
		return escudo;
    }

    
}