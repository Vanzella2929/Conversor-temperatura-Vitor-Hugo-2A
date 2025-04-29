//classe filha
public class Celsios extends Temperatura {
    //ronstrutor
    public Celsios(double valorGraus) {
        super(valorGraus);
    }
    //Criando metodos
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
        
    }
    
    //Criando para Celsios para Kenvin
    public double paraKelvin(){
        return getGraus()+273;
    }
    
    
    
}
