import java.util.Scanner;

public class Angry_birds {
    public static void main(String[] args) {

        Scanner Teclado= new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        int opcion;
        
        do
        {
        System.out.println("\t --------------------------");
        System.out.println("\t|--------ANGRY BIRDS-------|");
        System.out.println("\t --------------------------");
        System.out.println("\n  --------------------------");
        System.out.println("  |1- Imprimir pajaros ya hechos |\n");
        System.out.println("  |2- Imprimir puercos ya hechos |\n");
        System.out.println("  |3- salir |");
        System.out.println("  --------------------------\n");
        
        System.out.println("\n Introduce el numero del menu: ");
        opcion=Teclado.nextInt();

        
         if (opcion==1){
            Poderosos pajaros_poderosos[]=new Poderosos[4];
            pajaros_poderosos[1] = new Poderosos("Bomb","Verde" ,"Grande",1000,50,70,"","","");
            pajaros_poderosos[2] = new Poderosos("destructor","rojo" ,"Mediano",9912,60,99,"","","");
            pajaros_poderosos[3] = new Poderosos("Hal","amarillo" ,"Pequeno",8888,40,80,"","","");
        
            Basicos pajaros_basicos[]=new Basicos[4];
            pajaros_basicos[1] = new Basicos("Chuck","Morado" ,"Grande",7899,60,70,"","","");
            pajaros_basicos[2] = new Basicos("Stela","Rosa" ,"Mediano",9000,55,77,"","","");
            pajaros_basicos[3] = new Basicos("Bubles","Azul" ,"Grande",5000,40,95,"","","");
            
            for (int i=1;i<4;i++){
                System.out.println("\n\t-----PAJARO PODEROSO---["+i+"]: ");   
                System.out.println("\n\t|Nombre del pajaro: "+pajaros_poderosos[i].getName()+
                "\n\t|Color: : "+pajaros_poderosos[i].getColor()+
                "\n\t|Tamano : "+pajaros_poderosos[i].getTamano()+
                "\n\t|----NIVELES----\n\t|Numero de vida: "+pajaros_poderosos[i].getVida()+
                "\n\t|Agilidad: "+pajaros_poderosos[i].getAgilidad()+
                "\n\t|Impacto: "+pajaros_poderosos[i].getImpacto()+
                "\n\t|----PODERES----\n\t|-"+pajaros_poderosos[i].getFuego()+
                "\n\t|-"+pajaros_poderosos[i].getExplosion()+
                "\n\t|-"+pajaros_poderosos[i].getLava());    
                }
        
            for (int i=1;i<4;i++){
                System.out.println("\n\t-----PAJARO BASICOS---["+i+"]: ");   
                System.out.println("\n\t|Nombre del pajaro: "+pajaros_basicos[i].getName()+
                "\n\t|Color: : "+pajaros_basicos[i].getColor()+
                "\n\t|Tamano : "+pajaros_basicos[i].getTamano()+
                "\n\t|----NIVELES----\n\t|Numero de vida: "+pajaros_basicos[i].getVida()+
                "\n\t|Agilidad: "+pajaros_basicos[i].getAgilidad()+
                "\n\t|Impacto: "+pajaros_basicos[i].getImpacto()+
                "\n\t|----PODERES----\n\t|-"+pajaros_basicos[i].getAgua()+
                "\n\t|-"+pajaros_basicos[i].getBumerang()+
                "\n\t|-"+pajaros_basicos[i].getPesado());    
                }

        }
        else if (opcion==2){
            Jefes Puercos_jefe[]=new Jefes[4];
            Puercos_jefe[1] = new Jefes("Pi","Verde" ,"Grande",1000, 450,"Al agua", 3, 500);
            Puercos_jefe[2] = new Jefes("SOS","Verde limon" ,"Gigante",1000,300,"Al fuego", 2,320);
            Puercos_jefe[3] = new Jefes("BUBO","Verde fuerte" ,"Grande",1000,200,"Las explosiones", 4, 400);

            Basicos_Malos Puercos_basicos[]=new Basicos_Malos[4];
            Puercos_basicos[1] = new Basicos_Malos("CRACK","Verde" ,"Grande",1000, 450,"El bumerang","", 200);
            Puercos_basicos[2] = new Basicos_Malos("BOSS","Verde limon" ,"Gigante",1000,300,"A la lava","",100);
            Puercos_basicos[3] = new Basicos_Malos("BESTIA","Verde fuerte" ,"Grande",1000,200,"Las explosiones","", 250);
            
            for (int i=1;i<4;i++){
                System.out.println("\n\t-----PUERCOS JEFES---["+i+"]: ");   
                System.out.println("\n\t|Nombre del puerco: "+Puercos_jefe[i].getName()+
                "\n\t|Color: : "+Puercos_jefe[i].getColor()+
                "\n\t|Tamano : "+Puercos_jefe[i].getTamano()+
                "\n\t|----NIVELES----\n\t|Numero de vida: "+Puercos_jefe[i].getVida()+
                "\n\t|Dano: "+Puercos_jefe[i].getDano()+
                "\n\t|Debilidad: "+Puercos_jefe[i].getDebilidad()+
                "\n\t|----PODERES----\n\t|Se multiplica por:"+Puercos_jefe[i].getMultiplicarse()+
                "\n\t|Escudo:"+Puercos_jefe[i].getEscudo());    
                }

            for (int i=1;i<4;i++){
                System.out.println("\n\t-----PUERCPS BASICOS---["+i+"]: ");   
                System.out.println("\n\t|Nombre del puerco: "+Puercos_basicos[i].getName()+
                "\n\t|Color: : "+Puercos_basicos[i].getColor()+
                "\n\t|Tamano : "+Puercos_basicos[i].getTamano()+
                "\n\t|----NIVELES----\n\t|Numero de vida: "+Puercos_basicos[i].getVida()+
                "\n\t|Dano: "+Puercos_basicos[i].getDano()+
                "\n\t|Debilidad: "+Puercos_basicos[i].getDebilidad()+
                "\n\t|----PODERES----\n\t|-"+Puercos_basicos[i].getEsquivar()+
                "\n\t|-"+Puercos_basicos[i].getAumento());    
                }


        }
        else if(opcion>3){
            System.out.println("\n\t---- ERROR ---- \t\n(introduce un numero del menu)\n ");
            System.out.println("---- ENTER PARA CONTINUAR ---- ");
            sc.nextLine();
        }
        

        }while(opcion!=3);

    }
}
    