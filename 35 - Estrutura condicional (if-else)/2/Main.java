import java.util.Scanner;

public class Main {

public static void main(String [] args) {
Scanner sc = new Scanner(System.in);

int hora;

System.out.println("digite o horario de agora");
hora = sc.nextInt();

if (hora < 12) {

System.out.println("bom dia");
}

else {

System.out.println("bom tarde");

}

sc.close();


}
}
