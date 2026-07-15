package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] names= new String[5];
        double [][] grades =new double[5][3];
         for (int i=0;i<5;i++){
             System.out.println("enter student "+(i+1));
             names[i]=scanner.nextLine();

             for(int j=0;j<3;j++){
                 boolean enter=false;
                 do {
                     System.out.println("enter subject " + (j + 1));

                     double g = scanner.nextDouble();
                     if (g >= 0 && g <= 100) {
                         grades[i][j] = g;
                         enter=true;
                     } else {
                         System.out.println("invalid grade");
                     }
                 }while (!enter);

             }
             scanner.nextLine();
         }
        int choose;
         do{

             System.out.println("Display the below menu:\n" +
                     "1. Show All Students names.\n" +
                     "2. Show all Students grades in each subject.\n" +
                     "3. Search Student by name.\n" +
                     "4. Count Passed Students\n" +
                     "5. Display average for each subject\n" +
                     "6. highest grade for each subject\n" +
                     "7. Display letter grades (A-F).\n" +
                     "0. Exit");
             choose=scanner.nextInt();
          switch (choose){
              case 1:
                  System.out.println("Show All Students names.");
                  for (int i=0;i< names.length;i++){
                      System.out.println(names[i]);
                  }
                  break;
              case 2:
                  for(int i=0;i< 5;i++){
                      System.out.println("grade of student"+(i+1));
                      for (int j=0;j< 3;j++){
                          System.out.println("grade of student "+(i+1) +" of subject "+(j+1)+": is "+grades[i][j]);
                      }
                  }
                  break;
              case 3:
                  scanner.nextLine();
                  System.out.println("enter student name ");
                 String name =scanner.nextLine();
                 boolean found=false;
                 for (int i=0;i< names.length;i++){
                     if(names[i].equalsIgnoreCase(name)){
                         found=true;
                         System.out.println("student found in index "+ i);
                         break;
                     }

                 }
                 if(!found){
                     System.out.println("user dont exit in system ");
                 }
                 break;
              case 4:
                  System.out.println("count pass students");
                  int count=0;
                  for(int i=0;i<5;i++){
                      boolean passed=true;
                      for(int j=0;j<3;j++){
                          if(grades[i][j]<50){
                              passed=false;
                              break;
                          }
                      }
                      if (passed){
                          count++;
                      }


                  }
                  System.out.println("passed students is "+count);
                  break;
              case 5:
                  System.out.println("Display average for each subject");
                  for(int j=0;j<3;j++){
                      double sum=0;
                      double avg=0;

                      for (int i=0;i<5;i++){
                          sum+=grades[i][j];


                      }
                      avg=sum/5;
                      System.out.println("avg grade of subject"+(j+1)+": "+avg);
                  }
                  break;
              case 6:
                  System.out.println("highest grade  for each subject");
                  for(int j=0;j<3;j++){
                      double max=0;
                      for (int i=0;i<5;i++){
                          if(max<grades[i][j]){
                              max=grades[i][j];
                          }
                      }

                      System.out.println("max grade of subject"+(j+1)+": "+max);
                  }
                  break;
              case 7:
                  for(int i=0;i<5;i++){
                      System.out.println("grades of student :"+(i+1));
                      for(int j=0;j<3;j++){
                          if(grades[i][j]>=85){
                              System.out.println("A "+"Grade is :"+grades[i][j]);
                          }
                          else if(grades[i][j]>=75){
                              System.out.println("B "+"Grade is :"+grades[i][j]);
                          }
                          else if(grades[i][j]>=65){
                              System.out.println("C "+"Grade is :"+grades[i][j]);
                          }
                          else if(grades[i][j]>=50){
                              System.out.println("D "+"Grade is :"+grades[i][j]);
                          }else{
                              System.out.println("F "+"Grade is :"+grades[i][j]);
                          }
                      }
                  }
              break;

              case 0:
                  System.out.println("Exiting program...");
                  break;

              default:
                  System.out.println("Invalid choice.");

          }



        }while(choose!=0);
         scanner.close();
    }


}