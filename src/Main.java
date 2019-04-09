import java.util.Scanner;
import com.*;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Dealer dealer = new Dealer();
        dealer.showParkingState();
        System.out.print("\nКакую машину вы хотите купить? (Номер парковочного места): ");
        int temp = scanner.nextInt();
        dealer.sellCar(temp-1);

    }
}
