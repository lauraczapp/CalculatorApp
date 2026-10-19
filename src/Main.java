//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         Calculator c = new Calculator();

         System.out.println("**Calculator**");
         System.out.println("Erste Zahl: ");
         int zahl1 = scanner.nextInt();
         System.out.println("Zweite Zahl: ");
         int zahl2 = scanner.nextInt();

         System.out.println("1: +, 2: -, 3: *, 4:/");
         System.out.println("Auswahl: ");
         int auswahl = scanner.nextInt();

         int ergebnis = 0;

         switch(auswahl){
             case 1:
                 ergebnis=c.add(zahl1,zahl2);
                 System.out.println("Ergebnis: "+ergebnis);
                 break;
             case 1:
                 ergebnis=c.sub(zahl1,zahl2);
                 System.out.println("Ergebnis: "+ergebnis);
                 break;

             case 1:
                 ergebnis=c.mul(zahl1,zahl2);
                 System.out.println("Ergebnis: "+ergebnis);
                 break;

             case 4:
                 ergebnis=c.div(zahl1,zahl2);
                 System.out.println("Ergebnis: "+ergebnis);
                 break;
         }

     }
 }
