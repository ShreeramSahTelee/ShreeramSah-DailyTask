import java.util.*;
public class RetailCost implements Retail{

   public float getTotalcost(float tax,Float cost,float number){
    float totalCost=(cost*(1+(tax/100)))*number;
    return totalCost;

   }
   public float getTotalextendedcost(float cosmetics,float perfume,float clothes){
      float totalExtended=cosmetics+perfume+clothes;
      System.out.println("total cost of all item:"+totalExtended);
      return totalExtended;

   }
   public void getTotalDiscount(float totalcost){
      float discountCost=(totalCost*(1-(2/100)));
      System.out.println("Discount Cost:"+discountCost);
   }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("cosmetics quanriry:");
      float cosmetics=sc.nextFloat();
      System.out.println("perfume quanriry:");
      float perfume=sc.nextFloat();
      System.out.println("clothes quanriry:");
      float clothes=sc.nextFloat();
      RetailCost obj=new RetailCost();
      float cosmetics1=obj.getTotalcost(7,10000,cosmetics);
      System.out.println("Total cost of cosmestics:"+cosmetics1);
      float perfume1=obj.getTotalcost(12,5000,perfume);
      System.out.println("total cost of perfume:"+perfume1);
      float clothes1=obj.getTotalcost(4, 7000, clothes);
      System.out.println("total cost of clothes:"+clothes1);
      float totalcost=obj.getTotalextendedcost(cosmetics1,perfume1,clothes1);
      obj.getTotalDiscount(totalcost);

   }

    
}
