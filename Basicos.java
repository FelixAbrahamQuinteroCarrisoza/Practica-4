public class Basicos extends Buenos{
    String agua;
    String bumerang;
    String pesado;
	
	public Basicos(String name, String color, String tamano,int vida, int agilidad, int impacto,String agua,String bumerang, String pesado){
		super(name, color,tamano,vida,agilidad,impacto);
        this.agua = agua;
        this.bumerang = bumerang;
        this.pesado = pesado;
	}
    
    //agua
	public void setAgua(String agua){
		this.agua = agua;
	}
	public String getAgua(){
		return "AGUA";
    }
    
    //bumerang
    public void setBumerang(String bumerang){
		this.bumerang = bumerang;
	}
	public String getBumerang(){
		return "BUMERANG";
    }

    //pesado
    public void setPesado(String pesado){
		this.pesado = pesado;
	}
	public String getPesado(){
		return "PESADO";
    }
    
}