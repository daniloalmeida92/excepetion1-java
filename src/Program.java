import model.entities.Resevation;
import model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Resevation resevation = new Resevation(number, checkin, checkout);
            System.out.println("Reservation" + resevation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            resevation.updatesDate(checkin, checkout);
            System.out.println("Reservation" + resevation);

        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Erro in reservatio: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }


}