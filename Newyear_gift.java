
package newyear_gift;

import java.util.Arrays;
import java.util.Scanner;

class sweets{
      private String name;
       private double weight;
       protected  double price;
       protected String type;
        public void settype( ) {
            type="sweet";
      }
      public void setname(String name) {
            this.name=name;
      }
       public void setweight(double weight)  {    this.weight=weight;
       
       }
       public void setprice(double price){
           this.price=price;
      }
      public String getname(){
          return (name);
      }
      public double getweight(){
           return (weight);
      } 
     public double getprice(){
           return price;
      } 
     public String gettype( ) {
            return type;
      }
    
}
class choclates extends sweets implements Comparable<choclates>{
    @Override
    public void settype( ) {
            type="choclate";
      }
    public int compareTo(choclates comparechoclate) {
	
		double compareQuantity = ((choclates) comparechoclate).getprice(); 
		
		return (int)(this.price-compareQuantity);
    }
		
    
}

public class Newyear_gift {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        int totalweight=0,totalprice=0;  
        sweets laddu=new sweets();
           laddu.setname("laddu");
           laddu.setweight(3.0);
           laddu.setprice(100);
           
           laddu.settype();
           sweets kajukathli=new sweets();
           kajukathli.setname("kajusweet");
           kajukathli.setweight(2);
           kajukathli.setprice(300);
          
           kajukathli.settype();
           sweets jangri=new sweets();
           jangri.setname("jangri");
            jangri.setweight(2);
           jangri.setprice(150);
            jangri.settype();
            
            totalweight+=laddu.getweight()+jangri.getweight()+kajukathli.getweight();
            totalprice+=laddu.getprice()+jangri.getprice()+kajukathli.getprice();
            System.out.print("enter noof choclates");
                    int n=sc.nextInt();
            choclates choclate_array[]=new choclates[n];
            int i=0;
            while(i<n){
                 choclate_array[i]=new choclates();
                System.out.print("enter choclate name");
               choclate_array[i].setname(sc.next());
                 System.out.print("enter no of choclates"); 
                choclate_array[i].setweight(sc.nextDouble());
                 System.out.print("enter choclate price"); 
                choclate_array[i].setprice(sc.nextDouble());
                
                i++;
            }
            Arrays.sort(choclate_array);
            for(i=0;i<n;i++) {
                totalweight+=choclate_array[i].getweight();
                    totalprice+=choclate_array[i].getprice();
            }
            System.out.println("total weight of gift:"+totalweight+"\n"+"total price of gift"+totalprice);
            
            System.out.println("enter the price of choclates you want");
            int l=sc.nextInt();
            int r=sc.nextInt();
            for(i=0;i<n;i++){
                if(choclate_array[i].getprice()>=l && choclate_array[i].getprice()<=r )
                    System.out.println(choclate_array[i].getname());
            }
            
            
    }
   
}
