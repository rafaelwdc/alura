
public class ImpostoDeRenda {
	
    public static void main(String[] args) {
    	
    	// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142.00.
    	// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350.00.
    	// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636.00.

        double salario = 4200.0;
        double aliquotaSeteMeio = 142.00;
        double aliquotaQuinze = 350.00;
        double aliquotaVinteDoisMeio = 636.00;
        
        if (salario >= 1900.0 && salario <= 2800.0) {
        	System.out.println("o IR é de 7.5%,");
        	System.out.println("Você pode deduzir na declaração o valor de R$ 142.00, verifique com seu contador.");
        } 
        
        if (salario >= 2800.01 && salario <= 3751.0) {
        	System.out.println("o IR é de 15%");
        	System.out.println("Você pode deduzir o valor de R$ 350.00, verifique com seu contador.");
        } 
        
        if (salario >= 3751.01 && salario <= 4664.00) {
        	System.out.println("o IR é de 22.5%");
        	System.out.println("Você pode deduzir o valor de R$ 636.00, verifique com seu contador.");
        }
    }
}


