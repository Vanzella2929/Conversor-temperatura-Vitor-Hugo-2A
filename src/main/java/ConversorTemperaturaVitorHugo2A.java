
import java.util.Scanner;


public class ConversorTemperaturaVitorHugo2A {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while(continuar){
            System.out.println("===conversor de Temperatura===");
            System.out.println("1. Celsios");
            System.out.println("2. Fahrenheit");
            System.out.println("3. kelvin");
            System.out.println("4, sair");
            System.out.println("Escolha a unidade de Origem(1-4");
            int escolha = scanner.nextInt();
        }
            if(escolha == 4){
                continuar = False;
                continue;
                
            }
         if(escolha<1 || escolha>4){
             System.out.println("opcao invalida");
             continue;
             
        }
        System.out.println("Digite o valor da Temperatura: ");
                
    }
    
    case 1:
    Celsios celsios = new Celsios(graus);
    System.out.println("**********************");
    System.out.println("Resultado:");
    System.out.println("Fahrenheit:" + celsios.paraFahrenheit());
    System.out.println("Kelvin" + celsios.paraKelvin());
    System.out.println("*******************");
    break; 
    
    
    case2:
    
    
    System.out.println("**********************");
    System.out.println("Resultado:");
    System.out.println("Fahrenheit:" + celsios.paraFahrenheit());
    System.out.println("Kelvin" + celsios.paraKelvin());
    System.out.println("*******************");
    break; 
    
    
}
