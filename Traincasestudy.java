
 
package traincasestudy;
import java.util.Scanner;

   public class Traincasestudy {

      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String[][] departuretimes=new String[3][5];
      int[][] passengers=new int[3][5];
      int n;
      String daytime=" ",timeday1=" ",timeday2=" ";
      int total=0,total1=0,total2=0;
      System.out.println("Enter Departure Day/Time:");
      for(int i=0;i<3;i++){
          for(int j=0;j<5;j++){
              departuretimes[i][j]=sc.nextLine();
          }
      }
      System.out.println("Enter Number of Passengers:");
      for(int i=0;i<3;i++){
          for(int j=0;j<5;j++){
          passengers[i][j]=sc.nextInt();
      }
      }
     System.out.println("Enter n...");
     n=sc.nextInt();
       String trname=" ";
    if(n==1){    
          System.out.println("DAY\tDEPARTURE TIME\tNO. OF PASSENGERS");
                       for(int i=0;i<3;i++){
                               for(int j=0;j<5;j++){
                            System.out.println(departuretimes[i][j]+"\t\t"+passengers[i][j]);
                                }
                       }  
    }
    else if(n==2){
          System.out.println("MOST POPULAR TRAIN");
                     int big=0;
                    for(int i=0;i<3;i++){
                         for(int j=0;j<5;j++){
                             if(passengers[i][j]>big){
                                 big=passengers[i][j];
                                 trname=departuretimes[i][j];
                             }
                         }
                     }           
                     System.out.println("The Most Popular Train is "+trname+" train \n Because the train contains more number of passengers "+big);
    }
    else if(n==3){
       System.out.println("LEAST POPULAR TRAIN");
                    int small=500;
                    for(int i=0;i<3;i++){
                         for(int j=0;j<5;j++){
                             if(passengers[i][j]<small){
                                 small=passengers[i][j];
                                 trname=departuretimes[i][j];
                             }
                         }
                     }
                     System.out.println("The Least Popular Train is "+trname+" train \n Because the train contains more number of passengers "+small);
    }
    else if(n==4){
        System.out.println("WHETHER 6.04 TRAIN MORE POPULAR THAN 9.04 TRAIN");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if("MONDAY 6.04".equals(departuretimes[i][j])||"TUESDAY 6.04".equals(departuretimes[i][j])||"WENDESDAY 6.04".equals(departuretimes[i][j])){
                                total1+=passengers[i][j];
                            }
                            if("MONDAY 9.04".equals(departuretimes[i][j])||"TUESDAY 9.04".equals(departuretimes[i][j])||"WEDNESDAY 9.04".equals(departuretimes[i][j])){
                                total2+=passengers[i][j];
                            }
                                }
                    }
                     if(total1>total2){
                         System.out.println("The Most Popular Train is  6.04 Train Because The Train contains more number of passengers "+total1);
                     }
                     else
                     {
                         System.out.println("The Most Popular Train is  9.04 Train Because The Train contains more number of passengers "+total2);
                     }
    }
    else if(n==5){
       System.out.println("WHETHER 6.04 TRAIN ON MONDAY MORE POPULAR THAN 6.04 TRAIN ON TUESDAY");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if("MONDAY 6.04".equals(departuretimes[i][j])){
                                total1+=passengers[i][j];
                            }
                            if("TUESDAY 6.04".equals(departuretimes[i][j])){
                                total2+=passengers[i][j];
                            }
                        }
                    }
                    if(total1>total2){
                          System.out.println("The Most Popular Train is Monday 6.04 Train Because The Train contains more number of passengers "+total1);
                    }
                    if(total1<total2)
                    {
                          System.out.println("The Most Popular Train is Tuesday 6.04 Train Because The Train contains more number of passengers "+total2);
                    }
                    if(total1==total2){
                          System.out.println("No Train is More Popular Because These Two Trains contains equal no.of Passengers "+total1);
                    }
    }
    else if(n==6){
         System.out.println("FIND MORE POPULAR TRAIN DAY/TIME SPECIFIED BY THE USER");
                    Scanner sp=new Scanner(System.in);
                    System.out.println("Enter day and time1...");
                    timeday1=sp.nextLine();
                    System.out.println("Enter day and time2...");
                    timeday2=sp.nextLine();
                    for(int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if(departuretimes[i][j].equals(timeday1)){
                                total1+=passengers[i][j];
                            }
                            if(departuretimes[i][j].equals(timeday2)){
                                total2+=passengers[i][j];
                            }
                        }
                    }
                    if(total1>total2){
                          System.out.println("The Most Popular Train is "+timeday1+" Train Because The Train contains more number of passengers "+total1);
                    }
                    if(total1<total2)
                    {
                          System.out.println("The Most Popular Train is "+timeday2+" Train Because The Train contains more number of passengers "+total2);
                    }
                    if(total1==total2){
                          System.out.println("No Train is More Popular Because "+timeday1+" and "+timeday2+ " contains equal no.of Passengers "+total1);
                    }
    }
    else if(n==7){
    System.out.println("PASSENGERS BELOW 50");
                     System.out.println("DAY\tDEPARTURE TIME\tNO. OF PASSENGERS");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if(passengers[i][j]<50){
                          System.out.println(departuretimes[i][j]+"\t\t"+passengers[i][j]);
                            }
                        }
                    }
    }
    else if(n==8){
        System.out.println("12.04 TIME TRAIN'S AVERGAE NO.OF PASSENGERS");
                    for(int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if("MONDAY 12.04".equals(departuretimes[i][j])||"TUESDAY 12.04".equals(departuretimes[i][j])||"WEDNESDAY 12.04".equals(departuretimes[i][j])){
                              total+=passengers[i][j];  
                            }
                        }
                    }
                    System.out.println("The Average number of passengers are "+total/3);
    }
    else {
     System.out.println("AVERAGE NO.OF PASSENGERS BY USER SPECIFIED");
                  System.out.println("Enter day and time..");
                  daytime=sc.nextLine();
                  for(int i=0;i<3;i++){
                      for(int j=0;j<5;j++){
                          if(daytime.equals(departuretimes[i][j])){
                              total=+passengers[i][j];
                          }
                      }
                  }
                  System.out.println("The Average number of passengers are "+total);
         
      }
          
    }
 
      
         
      
 
        
    
    
}
