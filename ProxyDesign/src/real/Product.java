package real;

public class Product implements ProductComponent{

    public double buyProduct(String[] products,double[] prices){
        double totalAmount=0;
        for(double price:prices){
            totalAmount+=price;
        }

        return totalAmount;
    }
}
