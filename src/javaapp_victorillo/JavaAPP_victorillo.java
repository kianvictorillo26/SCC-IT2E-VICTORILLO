
package javaapp_victorillo;

 import java.util.Scanner;
public class JavaAPP_victorillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grades gr = new Grades();
        Sales sales = new Sales();
        Products pr = new Products();
        
        int choice;
        
        do{
            System.out.println("1.Grades\n2.Product\n3.Sales\n");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            
        switch (choice){
            
            case 1:
                 gr.getGrades();
                 break;
            case 2:
                 pr.getProducts();
                break;
            case 3:
                sales.getSales();
                break;
            case 4:
                break;
          }
        }while( choice > 3 || choice < 0 );
//        Grades gr1 = new Grades();
//        gr1.addGrades(1011,"jhon mark ",3.3,3.2,3.3,3.3);
//        gr1.viewGrades();
        
//        Product pr = new Product();
//        pr.addProducts(1011, "wax", 30, 60, 0);
//        pr.viewProducts();
//        
//        Product pr1 = new Product();
//        pr1.addProducts(1011, "sabon", 30, 0, 0);
//        pr1.viewProducts();

//          Sales sales = new Sales();
//          sales.getSales();
        
    }
    
}
    

