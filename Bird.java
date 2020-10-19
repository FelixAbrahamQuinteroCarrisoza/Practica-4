public class Bird {

    String name;
    String color;
    String tamano;
    int vida;

    //nombre
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    //color
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    //tamano
    public void setTamano(String tamano){
        this.tamano = tamano;
    }
    public String getTamano(){
        return tamano;
    }

    //vida
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }


    public Bird(){
        this.name = "";
        this.color = "";
        this.tamano = "";
        this.vida = 0;
    }
    public Bird(String name, String color, String tamano, int vida ){
        this.name = name;
        this.color = color;
        this.tamano = tamano;
        this.vida = vida;
        
    }
}