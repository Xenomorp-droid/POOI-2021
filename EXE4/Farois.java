package exe4teste;

public class Farois {
    private int estado;
    public boolean desligada;
    private String modelo;
    
    public Farois(int estado, boolean desligada, String modelo){
        this.estado = estado;
        this.desligada = desligada;
        this.modelo = modelo;
        
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getEstado(){
        return this.estado;
    }
    
    public void setEstado(int estado){
        if(estado >= 0 && estado <= 5){
            this.estado = estado;
            if(this.estado == 5){
               this.desligada = false;
            }else{
                this.desligada = true;
            }
        }else{
            System.out.println("Farol funciona somente entre 0 e 5");           
        }
    }
    
    public void desligarFarol(){
        if(estado <= 0){
         System.out.println("Farol está apagado");   
        }else{
        this.estado -=1;
        this.desligada = true;
        }       
    }
    
    public void ligarFarol(){
        if(estado >= 5){
            desligada = false;
            System.out.println("Farol está ligado");
        }else{
         estado +=1;
         if(this.estado == 5){
            this.desligada = false;
        }     
    }
  }  
}