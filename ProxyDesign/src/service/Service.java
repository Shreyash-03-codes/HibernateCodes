package service;

import proxy.ProxyProduct;
import real.Product;
import real.ProductComponent;

public class Service {


    public ProductComponent getInstance(String code){
        if(code.isEmpty() || code.trim().isEmpty()){
            return new Product();
        }
        else if(code.equalsIgnoreCase("CouponCode20")){
            return new ProxyProduct(20);
        }
        else if(code.equalsIgnoreCase("CouponCode10")){
            return new ProxyProduct(10);
        }
        else{
            return new Product();
        }
    }

}
