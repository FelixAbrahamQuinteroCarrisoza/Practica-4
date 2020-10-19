public class Malos extends Bird{
    int dano;
    String debilidad;
	
	public Malos(String name, String color, String tamano,int vida,int dano,String debilidad){
		super(name, color,tamano,vida);
        this.dano = dano;
        this.debilidad = debilidad;
	}
    
    //agilidad
	public void setDano(int dano){
		this.dano = dano;
	}
	public int getDano(){
		return dano;
    }
    
    //debilidad
    public void setDebilidad(String debilidad){
		this.debilidad = debilidad;
	}
	public String getDebilidad(){
		return debilidad;
    }
    
}