package practice.lab2final;
import java.util.*;
import java.lang.*;
public class Lab2final {
void IDN(String inpt2){
    String s11=new String("Nafees Monsoor");
    String s12=new String("Farhana Sarker");
    String s13=new String("Farjahan Akter");
    String s14=new String("Nahian Raisa");
    String s15=new String("Fuad Akash");
    String s16=new String("Bushra Ahmed");
    String s17=new String("Iqbal Hossain");
    String s18=new String("Apon Ghosh");

   if((inpt2.substring(3,6)).equals("014")) {
     System.out.println("<========Welcome To the CSE Department=======>\n");
     System.out.println("Department Location: C Building, 3rd Floor");
     String s6=new String("Automata");
     String s7=new String("Algorithm");
     String s8=new String("Java");
     System.out.println("<----------Course List------------> \n1. "+s6+"\n2. "+s7+"\n3. "+s8);
     System.out.println("<------Choose your course------>");
     Scanner sc1 = new Scanner(System.in);
     String inpt1 = sc1.nextLine();
     if(inpt1.equals(s6)){
         System.out.println("Available Faculties are:\n"+s11+"\n"+s12+"\n<---Choose the faculty--->");
         Scanner sc2 = new Scanner(System.in);
         String inpt3 = sc2.nextLine();
         System.out.println("======================================");
         if(inpt3.equals(s11)){
             System.out.println("Room: PD-312\nConsultation hours: 02:40-4:50");
         }
         else
             System.out.println("Room: PD-311\nConsultation hours: 01:40-2:50");
     }
     else if(inpt1.equals(s7)){
         System.out.println("Available Faculties are:\n"+s16+"\n"+s18+"\n<---Choose the faculty--->");
         Scanner sc2 = new Scanner(System.in);
         String inpt3 = sc2.nextLine();
         System.out.println("======================================");
         if(inpt3.equals(s16)){
             System.out.println("Room: PD-310\nConsultation hours: 02:40-4:50");
         }
         else
             System.out.println("Room: PD-311\nConsultation hours: 01:40-2:50");
     }
     else if(inpt1.equals(s8)){
         System.out.println("Available Faculties are:\n"+s14+"\n"+s15+"\n"+s17+"\n<---Choose the faculty--->");
         Scanner sc2 = new Scanner(System.in);
         String inpt3 = sc2.nextLine();
         System.out.println("======================================");
         if(inpt3.equals(s14)){
             System.out.println("Room: PD-312\nConsultation hours: 02:40-4:50");
         }
         else if(inpt3.equals(s15)){
             System.out.println("Room: PD-310\nConsultation hours: 02:40-4:50");
         }
         else
             System.out.println("Room: PD-312\nConsultation hours: 01:40-2:50");
     }
   }
   
   //-----------------------------For other Department----------------------------------------// 
   else if((inpt2.substring(3,6)).equals("015")){
        System.out.println("<=====Welcome To the EEE Department====>\n");
        System.out.println("Department Location: C Building, 3rd Floor");
        String s19=new String("Digital Electronics");
        String s20=new String("Electronics device");
        System.out.println("<----------Course List------------> \n1. "+s19+"\n2. "+s20);
        System.out.println("Choose your course\n");
        Scanner sc1 = new Scanner(System.in);
        String inpt1 = sc1.nextLine();
        if(inpt1.equals(s19)){
         System.out.println("<----Available Faculties are:---->\n"+s17);
         System.out.println("\nRoom: PD-312\nConsultation hours: 02:40-4:50");
        }
        else if(inpt1.equals(s20)){
          System.out.println("Available Faculties are:\n"+s14+"\n"+s15+"\n"+s17+"\n ---Choose the faculty---");
          //Scanner sc2 = new Scanner(System.in);
         String inpt3 = sc1.nextLine();
         System.out.println("======================================");
         if(inpt3.equals(s14)){
             System.out.println("Room: PD-312\nConsultation hours: 02:40-4:50");
         }
         else if(inpt3.equals(s15)){
             System.out.println("Room: PD-310\nConsultation hours: 02:40-4:50");
         }
         else
             System.out.println("Room: PD-312\nConsultation hours: 01:40-2:50");
         }
   }
   else{
       System.out.println("Please Provide the correct ID");
   }
}

        //----------------- Main Function Starts Here------------------------//
    public static void main(String[] args) {
     System.out.println("Can you please help me to find the department location and faculty room?");
     System.out.println("Your ID please?");
     Scanner sc2 = new Scanner(System.in);
     String inpt2 = sc2.nextLine();
     Lab2final z = new Lab2final();
     z.IDN(inpt2);
     System.out.println("======================================");
    }
}