
public class Fahrenheit extends Temperatura{
    
    public Fahrenheit(double valorGraus) {
        super(valorGraus);
    }
    public double paraCelsios(){
        return (getGraus()-32)*5/9;
        
    }
    public double paraKenvin(){
        return paraCelsios()+273;
    } 
    
    
    
}
