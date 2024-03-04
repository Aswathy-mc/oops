
class product{
       String pcode,pname;
       float price;
 
       public product(String pcode,String pname,float price)
{
               this.pcode=pcode;
               this.pname=pname;
               this.price=price;
              }
}

class productprice{
      public static void main(String args[])
{
      product p1=new product("01","IceCream",100);
      product p2=new product("02","WaterMelon",200);
      product p3=new product("03","choclate",300);
 

      product lowp=p1;
    
      if(p2. price<lowp.price){
             lowp=p2;
      }
      if(p3. price<lowp.price){
      lowp=p3;
      }
      System.out.println("the product with the lowest price:");
      System.out.println("product code:"+lowp.pcode);
      System.out.println("product name:"+lowp.pcode);
      System.out.println("product price:"+lowp.price);
}
}
