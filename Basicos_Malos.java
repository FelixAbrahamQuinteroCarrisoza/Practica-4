public class Basicos_Malos extends Malos{
    String esquivar ;
    int aumento;
	
	public Basicos_Malos(String name, String color, String tamano,int vida, int dano,String debilidad,String esquivar,int aumento){
		super(name, color,tamano,vida,dano,debilidad);
        this.esquivar = esquivar;
        this.aumento = aumento;
	}
    
    //esquivar
	public void setEsquivar(String esquivar){
		this.esquivar = esquivar;
	}
	public String getEsquivar(){
		return "ESQUIVAR";
    }
    
    //aumento
    public void setAumento(int aumento){
		this.aumento = aumento;
	}
	public int getAumento(){
		return aumento;
    }

    
}