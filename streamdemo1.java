import java.util.*;
import java.util.stream.*;
class homeproduct{
    String name;
    int quantity;
    long cost;
    //method
    homeproduct(String name, int quantity, long cost)
    {
        //to assign current values
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
}
class streamdemo1 {
    public static void main(String args[]){
        ArrayList<homeproduct> al = new ArrayList<>();
        al.add(new homeproduct("Washingmashine", 1, 10000));
        al.add(new homeproduct("Heater", 1, 1100));
        al.add(new homeproduct("Television", 1, 1100));
        al.add(new homeproduct("Referigrator", 1, 1100));
        al.add(new homeproduct("AC", 1, 1100));
        
        Stream<homeproduct>str= al.stream();
        float budget = str.map(product -> product.cost)   
        .reduce(0l, (sum, cost) -> sum + cost);
        
        System.out.println("Total cost of all products: " + budget); 
    }
}
