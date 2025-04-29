
public class Kelvin extends Temperatura {
    
    public Kelvin(double valorGraus) {
        super(valorGraus);
    }
    public double paraCelsios(){
        return getGraus()-273;
        
    }
    public double paraFahrenheit(){
        return (paraCelsios()*9/5)+32;
        
    }
}
