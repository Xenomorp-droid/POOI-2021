package exe5;

public class EXE5 {
 
    public static void main(String[] args) {
       
        Lutador l [] = new Lutador[6];
        
                l [0]= new Lutador("Pretty Boy", "França", 33, 1.78, 66.9, 12, 1, 1);
                
                l [1] = new Lutador ("Putscript", "Brasil", 45, 1.68, 56.8, 14, 3, 2);
                
                l [2] = new Lutador ("SnapShadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
                
                l [3] = new Lutador ("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
                
                l [4] = new Lutador ("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
                
                l [5] = new Lutador ("NerdDaart", "UK", 30, 1.81, 105.7, 12, 2, 4);
                
               Luta lu = new Luta();
               lu.marcarLuta(l[0], l[1]);
               lu.lutar();
               
    }
    
}