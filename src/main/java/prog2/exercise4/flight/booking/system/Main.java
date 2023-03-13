package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {


        System.out.println("please enter your full name>");
        Scanner scanner = new Scanner(System.in);
        String passengerFullName = scanner.nextLine();

        System.out.println("please enter your DepartureDate");
        Scanner scanner1 = new Scanner(System.in);
        String ddate = scanner1.nextLine();
        LocalDate DepartureDate = LocalDate.parse(ddate);

        System.out.println("please enter your ReturnDate");
        Scanner scanner2 = new Scanner(System.in);
        String rdate = scanner2.nextLine();
        LocalDate ReturnDate = LocalDate.parse(rdate);

        System.out.println("please enter the number of childPassengers");
        Scanner getChildPassengers = new Scanner(System.in);
        int ChildPassengers = getChildPassengers.nextInt();

        System.out.println("please enter the number of adultPassengers");
        Scanner getAdultPassengers = new Scanner(System.in);
        int AdultPassengers = getAdultPassengers.nextInt();

        System.out.println("please enter the number of your choice of class(only number)");
        System.out.println("1.First");
        System.out.println("2.Business");
        System.out.println("3.Economy");
        Scanner scanner3 = new Scanner(System.in);
        String n = scanner3.nextLine();

        System.out.println("please enter the number of your choice of triptype(only number)");
        System.out.println("1.On way");
        System.out.println("2.Return");
        Scanner scanner4 = new Scanner(System.in);
        String m = scanner4.nextLine();

        System.out.println("please enter the number of your choice of source(only number)");
        System.out.println("1.Nanjing");
        System.out.println("2.Beijing");
        System.out.println("3.Shanghai");
        System.out.println("4.Oulu");
        System.out.println("5.Helsinki");
        System.out.println("6.Paris");
        Scanner scanner5 = new Scanner(System.in);
        String x = scanner5.nextLine();
        String y="";
        String destination2="";

        for (int i=1;i>0;i++) {
            System.out.println("please enter the number of your choice of destination(only number)");
            System.out.println("1.Nanjing");
            System.out.println("2.Beijing");
            System.out.println("3.Shanghai");
            System.out.println("4.Oulu");
            System.out.println("5.Helsinki");
            System.out.println("6.Paris");
            Scanner scanner6 = new Scanner(System.in);
            y = scanner6.nextLine();

        if (!x.equals(y)){break;}
        }

        if(ReturnDate.compareTo(DepartureDate)==1){
            ReturnDate=ReturnDate.plusDays(1);
        }
        else if(ReturnDate.compareTo(DepartureDate)==0){
            ReturnDate=ReturnDate.plusDays(2);
        }








        FlightBooking fb = new FlightBooking(passengerFullName, DepartureDate, ReturnDate, ChildPassengers, AdultPassengers);

        fb.setTotalPassengers(ChildPassengers, AdultPassengers);
        fb.setBookingClass(n);
        fb.setDepartureDate(DepartureDate);
        fb.setReturnDate(ReturnDate);
        fb.setTripType(m);
        fb.setTripSource(x);
        fb.setTripDestination(y, destination2);
        fb.setDepartingTicketPrice(ChildPassengers,AdultPassengers);
        fb.setTotalTicketPrice();


        System.out.println(fb);


    }
        
        
    }

