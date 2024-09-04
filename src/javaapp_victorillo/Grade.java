
package javaapp_victorillo;


import java.util.Scanner;

public class Grade {
    
    public void getGrade(){     
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter No. of Student: ");
    int num_s = sc.nextInt();
    
    Grades[] gr = new Grades[num_s];
    
    for(int  i = 0; i < num_s; i++){
        
        System.out.println("Enter details of student "+(i+1));
        System.out.print("ID: ");
        int id = sc.nextInt();
       
        System.out.print("Name: ");
        String name = sc.next();
        
        System.out.print("Prelim: ");
        double p = sc.nextDouble();
        
        System.out.print("Midterm: ");
        double m = sc.nextDouble();
        
        System.out.print("Pre-Final: ");
        double pf = sc.nextDouble();
        
        System.out.print("Final: ");
        double f = sc.nextDouble();
        
        System.out.println("");
        
         gr[i] = new Grades();
         gr[i].addGrades(id, name, p, m, pf, f);
            }
        System.out.println("");
        
    double total_ave = 0; 
    int passed = 0, failed = 0;
    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
            "ID", "Name", "Prelim", "Midterm", "Pre-final", "Final", "average", "remarks");
    for (Grades gr1 : gr) {
            gr1.viewGrades();
            total_ave += gr1.average;
                if(total_ave < 3.0){
                   passed++;
                }else{
                   failed++;
                }
            }
        System.out.println("-------------------------------");
        System.out.println("No. of Student "+num_s);
        System.out.printf(String.format("Total Class Average: %.2f\n", (total_ave / num_s)));
        System.out.println("No. of Passed: "+passed);
        System.out.println("No. of Failed: "+failed);
        
       }
  }
