package FromFirst.OOPS.two;

public class Manager {
	public static void main(String[] args) {
               String data = "1001-Think Pad-Lenovo-45000,1002-Studio-Dell-55000,1003-Air book-Apple-65000,1004-Next Gen-Dell-50";
               String[] arr = data.split(",");
               
               Product[] products = new Product[arr.length];
               int i=0;
               for(String d:arr)
               {
            	   String[] prod=d.split("-");
            	   int p_id=Integer.parseInt(prod[0]);
            	   String p_name=prod[1];
            	   String p_brand=prod[2];
            	   float p_price=Float.parseFloat(prod[3]);
            	   Product p = new Product(p_id,p_name,p_brand,p_price);
            	   products[i++]=p;
               }
               for(Product p:products)
               {
            	   p.showInfo();
               }
               System.out.println("_____________________________________________________");
               //<5000 => 50000
               for(Product p:products)
               {
            	   if(p.getPrice()<5000)
            	   {
            		   p.setPrice(50000);
            	   }
               }
               for(Product p:products)
               {
            	   p.showInfo();
               }
               System.out.println("*************************************************");
            // Give discount 20 % on all product and find the total discount amount
       		// Product > 50000 20 % otherwise 10%
               float t_price=0;
               float discount_amount=0;
               for(Product p:products)
               {
            	   float price = p.getPrice();
            	   t_price+=price;
            	   if(price>50000)
            	   {
            		   discount_amount+=price*0.2;
            	   }
            	   else
            	   {
            		   discount_amount+=price*0.1;
            	   }
               }
               System.out.println("Total price:" + t_price);
               System.out.println("discount amount is:" + discount_amount);
               System.out.println("Total discount amount is:"+(t_price-discount_amount));
               
	}

}
