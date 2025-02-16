package test;
import real.ProductComponent;
import service.Service;
public class ProductTest {
    public static void main(String[] args){
        Service sc=new Service();
        ProductComponent ob=sc.getInstance("CouponCode20");
        double price=ob.buyProduct(new String[]{"apple","banana","biscuit"},new double[]{80,50,120});
        System.out.println(price);
    }
}
