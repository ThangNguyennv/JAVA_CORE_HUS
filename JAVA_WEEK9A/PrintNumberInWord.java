/**
 * Program to print number in word
 */
 import java.util.*;
 public class PrintNumberInWord {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    switch (number){
        case 1:
            System.out.println("MOT");
            break;
        case 2:
            System.out.println("HAI");
            break;
        case 3:
            System.out.println("BA");
            break;
        case 4:
            System.out.println("BON");
            break;
        case 5:
            System.out.println("NAM");
            break;
        case 6:
            System.out.println("SAU");
            break;
        case 7:
            System.out.println("BAY");
            break;
        case 8:
            System.out.println("TAM");
            break;
        case 9:
            System.out.println("CHIN");
            break;
        default:
        System.out.println("OTHER");
    }
    
    }
 }