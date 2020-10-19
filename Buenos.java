public class Buenos extends Bird{
    int agilidad;
    int impacto;
	
	public Buenos(String name, String color, String tamano,int vida, int agilidad, int impacto){
		super(name, color,tamano,vida);
        this.agilidad = agilidad;
        this.impacto = impacto;
	}
    
    //agilidad
	public void setAgilidad(int agilidad){
		this.agilidad = agilidad;
	}
	public int getAgilidad(){
		return agilidad;
    }
    
    //impacto
    public void setImpacto(int impacto){
		this.impacto = impacto;
	}
	public int getImpacto(){
		return impacto;
    }
    
}