//Q2. Design a class Room that has properties AC_ON, HOME_THEATRE_ON,
// FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF.
// Design a menu driven program in java that puts ON/OFF
// the corresponding appliances and gives appropriate message. If the total power consumed is more than 2kW,
// show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts,
// Fan consumes 400 watts and light consumes 100 watt.
package i1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ClassRoomProretis {
          boolean AC_ON;
          boolean HOME_THEATER_ON;
          boolean FAN_ON;
          boolean LIGHT_ON;
          int power;
          int watts;

  ClassRoomProretis(){
            AC_ON=false;
            HOME_THEATER_ON =false;
            FAN_ON =false;
            LIGHT_ON=false;
            Scanner sc=new Scanner(System.in);
      System.out.println("entre the power in the KW");
      power= sc.nextInt();
      System.out.println("entr the power in Watts");
      watts=sc.nextInt();
  }
  void dispaly(){
      if (AC_ON==true){
           if(watts>=1200){
               System.out.println("AC is on and watts supply "+watts);
           }
           else {
               System.out.println("the switch is off ");
           }
       if(HOME_THEATER_ON==true && watts>=00){
           System.out.println("savchfih");

          }
      }
  }
}
