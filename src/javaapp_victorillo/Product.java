
package javaapp_victorillo;


    public class Product {
    int id;
    String name;
    double price, profit, tep;
    int stocks, sold;
    
    public Product(int pid, String pname, double pprice, int pstocks, int psold){
        
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.stocks = pstocks;
        this.sold = psold;
    }
    
    public void viewProducts(){
        this.profit = this.price * this.sold;
        this.tep = (this.stocks + this.sold )* this.price;
        String status = (this.stocks > 0) ? "Available" : "Out-of-stock";
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.price, this.stocks, this.sold, this.profit, this.tep, status);
    }
    
}
    

