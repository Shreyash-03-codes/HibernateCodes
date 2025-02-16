package proxy;
import real.ProductComponent;
public class ProxyProduct implements ProductComponent{
    private double dis;
    public ProxyProduct(double dis){
        this.dis=dis;
    }

    public double buyProduct(String[] products,double[] prices){
        double totalAmount=0;
        for(double price:prices){
            totalAmount+=price;
        }

        double disc=(this.dis*totalAmount)/100;

        return totalAmount-disc;
    }


}
