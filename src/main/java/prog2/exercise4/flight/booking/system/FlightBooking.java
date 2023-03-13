package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;

public class FlightBooking {
private final String passengerFullName;
private final String FlightCompany="Flights-of-Fancy";
private  LocalDate DepartureDate;
private  LocalDate ReturnDate;
private final int ChildPassengers;
private final int AdultPassengers;
private int TotalPassengers;

private  double TotalTicketPrice;
private  String choice;
private String triptype;
private String sourceairport;
private String destinationairport;
private String source;
private String destination;
    private int p;
    private double DT2;
    private  int i;
    private  int j;
    private int u;
    private int r;
    private String ticketNumber;
    private  String classification;


    FlightBooking(String passengerFullName, LocalDate DepartureDate, LocalDate ReturnDate, int childPassengers ,int adultPassengers ){
        this.passengerFullName = passengerFullName;
        this.DepartureDate=DepartureDate;
        this.ReturnDate=ReturnDate;
        this.ChildPassengers=childPassengers;
        this.AdultPassengers=adultPassengers;
        setTotalPassengers(childPassengers,adultPassengers);
        setTotalTicketPrice();
        setDepartingTicketPrice(childPassengers,adultPassengers);


    }
    void BookingClass(String n,String m,String x,String y,String destination2){
        setTripType(m);
        setBookingClass(n);
        setTripSource(x);
        setTripDestination(y,destination2);
         setTicketNumber();
        setTotalTicketPrice();
    }

public String getPassengerFullName() {
        return passengerFullName;
        }

public String getFlightCompany() {
        return FlightCompany;
        }

public  LocalDate getDepartureDate(){
        return DepartureDate;
        }
public  LocalDate getReturnDate(){
        return ReturnDate;
        }
public int getTotalPassengers() {return TotalPassengers;}

public double getTotalTicketPrice() {return TotalTicketPrice;}




public int getAdultPassengers() {
        return AdultPassengers;
        }

public int getChildPassengers() {
        return ChildPassengers;
        }
        public TripSource getTripSource(){
        return TripSource.valueOf(source);
        }

    public String getTripDestination() {
        return destination;
    }

    public void setDepartureDate(LocalDate departureDate){
            DepartureDate=departureDate;
}

    public void setReturnDate(LocalDate returnDate) {
        ReturnDate = returnDate;
    }
    public void setReturnTicketPrice(){
        double rtp = DT2;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers){
        TotalPassengers=childPassengers+adultPassengers;
        }

public void setTotalTicketPrice() {
        this.TotalTicketPrice=DT2*u;
        }

    enum BookingClass{FIRST,BUSINESS,ECONOMY}
    enum TripType{ONE_WAY,RETURN};
    enum TripSource{ NANJING, BEIJING,SHANGHAI, OULU, HELSINKI, PARIS}
    enum TripDestination{NANJING, BEIJING,SHANGHAI, OULU, HELSINKI, PARIS}
    enum SourseAirpot {Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport,Helsinki_Airport,Paris_Charles_de_Gaulle_Airport}
    enum DestinationAirport{Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport,Helsinki_Airport,Paris_Charles_de_Gaulle_Airport}


    public void setBookingClass(String n) {
        switch (n){
            case "1":
                choice=String.valueOf(BookingClass.FIRST);
                this.p=1;
                break;
            case "2":
                choice=String.valueOf(BookingClass.BUSINESS);
                this.p=2;
                break;
            case "3":
                choice=String.valueOf(BookingClass.ECONOMY);
                this.p=3;
                break;
            default:
                System.out.println("it should be 1,2 or 3!");

        }
    }


    public void setTripType(String m) {
        switch (m){
            case "1":
                triptype=String.valueOf(TripType.ONE_WAY);
                this.u=1;
                break;
            case "2":
                triptype=String.valueOf(TripType.RETURN);
                this.u=2;
                break;
            default:
                System.out.println("it should be 1,2 or 3!");

        }

    }


    public void setTripSource(String x) {
        switch (x){
            case "1": source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.NANJING)));
                      sourceairport=String.valueOf(SourseAirpot.Nanjing_Lukou_International_Airport);
                      this.i=1;
                break;
            case "2": source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.BEIJING)));
                      sourceairport=String.valueOf(SourseAirpot.Beijing_Capital_International_Airport);
                      this.i=2;
                break;
            case "3":source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.SHANGHAI)));
                     sourceairport=String.valueOf(SourseAirpot.Shanghai_Pudong_International_Airport);
                     this.i=3;
                break;
            case "4":source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.OULU)));
                     sourceairport=String.valueOf(SourseAirpot.Oulu_Airport);
                     this.i=4;
                break;
            case "5":source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.HELSINKI)));
                     sourceairport=String.valueOf(SourseAirpot.Helsinki_Airport);
                     this.i=5;
                break;
            case "6":source= String.valueOf(TripSource.valueOf(String.valueOf(TripSource.PARIS)));
                     sourceairport=String.valueOf(SourseAirpot.Paris_Charles_de_Gaulle_Airport);
                     this.i=6;
                break;
            default:
                System.out.println("it should be 1,2,3,4,5 or 6 !");
        }
    }


    public void setTripDestination(String y,String destination2) {
        switch (y) {
            case "1":
                destination = String.valueOf(TripDestination.NANJING);
                destinationairport = String.valueOf(DestinationAirport.Nanjing_Lukou_International_Airport);
                this.j=1;
                break;
            case "2":
                destination = String.valueOf(TripDestination.BEIJING);
                destinationairport = String.valueOf(DestinationAirport.Beijing_Capital_International_Airport);
                this.j=2;
                break;
            case "3":
                destination = String.valueOf(TripDestination.SHANGHAI);
                destinationairport = String.valueOf(DestinationAirport.Shanghai_Pudong_International_Airport);
                this.j=3;
                break;
            case "4":
                destination = String.valueOf(TripDestination.OULU);
                destinationairport = String.valueOf(DestinationAirport.Oulu_Airport);
                this.j=4;
                break;
            case "5":
                destination = String.valueOf(TripDestination.HELSINKI);
                destinationairport = String.valueOf(DestinationAirport.Helsinki_Airport);
                this.j=5;
                break;
            case "6":
                destination = String.valueOf(TripDestination.PARIS);
                destinationairport = String.valueOf(DestinationAirport.Paris_Charles_de_Gaulle_Airport);
                this.j=6;
                break;
            default:
                System.out.println("it should be 1,2,3,4,5 or 6 !");

                   }

         }

    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
        r=childPassengers+adultPassengers;

        double DT1;
        if(i<4 && j<4){
            DT1 =(300+30+15)*r;
        }
        else if(3<i && i<6 && 6>j && j>3){
            DT1 =(300+15+30)*r;
        }
        else{
            DT1 =(300+45+30)*r;
        }


        switch (p){
            case 1:
                this.DT2= DT1 +250*r;
                classification="domestic";
                break;
            case 2:
                this.DT2= DT1 +150*r;
                classification="domestic";
                break;
            case 3:
                this.DT2= DT1 +50*r;
                classification="international";

        }

    }

    public String getTicketNumber()
    {
        return ticketNumber;
    }





    public void setTicketNumber()
    {
        Random rnd = new Random();
        int number = rnd.nextInt(9000)+1000;
        String m = String.valueOf(number);
        switch (p){
            case 1:
                if (u==1)
                {
                    if (classification.equals("domestic"))
                        this.ticketNumber = "11" + "F" + m + "DOM";
                    else
                        this.ticketNumber = "11" + "F" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber = "22" + "F" + m + "DOM";
                    else
                        this.ticketNumber = "22" + "F" + m + "INT";
                }
                break;
            case 2:
                if (u==1)
                {
                    if (classification.equals("international"))
                        this.ticketNumber = "11" + "B" + m + "DOM";
                    else
                        this.ticketNumber = "11" + "B" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber = "22" + "B" + m + "DOM";
                    else
                        this.ticketNumber = "22" + "B" + m + "INT";
                }
                break;
            case 3:
                if (u==1)
                {
                    if (classification.equals("international"))
                        this.ticketNumber = "11" + "E" + m + "DOM";
                    else
                        this.ticketNumber = "11" + "E" + m + "INT";
                }
                else{
                    if (classification.equals("domestic"))
                        this.ticketNumber = "22" + "E" + m + "DOM";
                    else
                        this.ticketNumber = "22" + "E" + m + "INT";
                }
                break;
            default:
                break;
        }
    }



    public String toString(){
        return  " Thank you for booking your flight with " + FlightCompany + "." +
        "Following are the details of your booking and the trip:" + "\n" +
        "Ticket Number: " + ticketNumber + "\n" +
        "Passenger Name:"+passengerFullName+"\n"+
        "From  " + source + " to  " + destination + "\n" +
        "Date of departure: " + DepartureDate + "\n" +
        "Date of return: " + ReturnDate + "\n" +
        "Total passengers: " + TotalPassengers + "\n" +
        "Total ticket price in Euros: " + TotalTicketPrice;
        }
        }