package revisao_Java;
import java.util.Scanner;

public class DataValida {
	 private int dia;
	    private int mes;
	    private int ano;

	    
	    public int getDia() {
	        return dia;
	    }

	    public void setDia(int dia) {
	        this.dia = dia;
	    }

	    public int getMes() {
	        return mes;
	    }

	    public void setMes(int mes) {
	        this.mes = mes;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }

	    
	    public boolean isDataValida() {
	        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
	            return false;
	        }

	        int diasNoMes;
	        switch (mes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                diasNoMes = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                diasNoMes = 30;
	                break;
	            case 2:
	                
	                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	                    diasNoMes = 29;
	                } else {
	                    diasNoMes = 28;
	                }
	                break;
	            default:
	                return false; 
	        }

	        return dia <= diasNoMes;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DataValida data = new DataValida();

	        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
	        String input = scanner.nextLine();

	        
	        String[] partes = input.split("/");
	        if (partes.length == 3) {
	            try {
	                data.setDia(Integer.parseInt(partes[0]));
	                data.setMes(Integer.parseInt(partes[1]));
	                data.setAno(Integer.parseInt(partes[2]));

	                if (data.isDataValida()) {
	                    System.out.println("A data " + input + " é válida.");
	                } else {
	                    System.out.println("A data " + input + " é inválida.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Formato de data inválido. Por favor, insira números.");
	            }
	        } else {
	            System.out.println("Formato de data inválido. Utilize dd/mm/aaaa.");
	        }

	        scanner.close();
	    }
}
