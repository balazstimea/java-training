package udemy.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Olympian", 8, 12);
        //theatre.getSeats();

       /* if (theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        } else{
            System.out.println("Sorry, this seat is taken");
        }
        if (theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        } else{
            System.out.println("Sorry, this seat is taken");
        }*/

        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
        printList(seatCopy);

        //The copy of the List works with the same Data as the original,
        //so if there are changes, it will be visible in the copy as well

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat already reserved");
        }

        //reverse order of the List
        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);
        //shuffle of the elements of the List
        Collections.shuffle(seatCopy);
        printList(seatCopy);
        //min and max elements of the Lists
        Theatre.Seat minSeat=Collections.min(seatCopy);
        Theatre.Seat maxSeat=Collections.max(seatCopy);
        System.out.println("Min seat number is "+minSeat.getSeatNumber());
        System.out.println("Max seat number is "+maxSeat.getSeatNumber());

    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================================");
    }
}
