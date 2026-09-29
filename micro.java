import java.util.*;

class info
{
    Scanner sc1 = new Scanner(System.in);
    

   String name;
   String address;

  

  public void getinfo()
   {
     
     System.out.println("\n\n\t\t-------------------------------- Costmer Details-------------------------------- ");

     System.out.println("Enter Name");

     name =sc1.nextLine();

     System.out.println("Enter Address");

     address= sc1.nextLine();
    
  

   }

}

class Order extends info
{
    
 


double r1price;
int r2price;
int qut;
int choice2;
int r3price;
char ch;
String r1; 
double t1price,t2price,t3price; 
double b1price,b2price,b3price;
double total ;


 

Vector v1 = new Vector();

void display()
{
 
 System.out.println("------------------------------------------------------------------------------------------------------");
 System.out.println("Item\t\t\tquantity\t\t\tRate\t\t\tTotal");
 System.out.println("------------------------------------------------------------------------------------------------------");
 total = r1price+r2price+r3price+t1price+t2price+t3price+b1price+b2price+b3price;
 


}


 void roll()
 {

   do{  
  System.out.println(" 1. Veg Rolls Rs.40");
  System.out.println(" 2. Egg Rolls Rs.50");
  System.out.println(" 3. Alu Rolls Rs.60");
  System.out.println(" 4. Back");
  System.out.println(" 5. Exit");
   choice2 = sc1.nextInt();

   
   if (choice2==1)
   {
    System.out.println("Veg Roll ");
    System.out.println("Enter Quantity");
     qut= sc1.nextInt();

    r1price=qut*40;
    
    System.out.println("Total ="+r1price);
    System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
    display();
    
    v1.add("Veg Roll \t\t\t"+qut+"\t\t\t"+"40\t\t\t"+r1price);
    
    Iterator value = v1.iterator();
 
    while (value.hasNext()) {

       
        System.out.println(value.next());
        
    }

    
    
    System.out.println("\nWant to add more items? (y-n)");
    ch=sc1.next().charAt(0);
     sc1.nextLine();

      if(ch=='N' || ch=='n')
       {


        System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
        System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
        System.exit(0);

                
       }


    

   }
   
   

   else if (choice2==2)
     {
      

      System.out.println("Egg Roll ");
    System.out.println("Enter Quantity");
     qut= sc1.nextInt();

    r2price=qut*50;

    System.out.println("Total ="+r2price);
    System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
    display();
    v1.add("Egg Roll \t\t\t"+qut+"\t\t\t"+"50\t\t\t"+r2price);
    
    Iterator value = v1.iterator();
 
    while (value.hasNext()) {

    
        System.out.println(value.next());
    }

  
    System.out.println("\nWant to add more items? (y-n)");
    ch=sc1.next().charAt(0);
     sc1.nextLine();

      if(ch=='N' || ch=='n')
       {
        System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
        System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
        System.exit(0);

                
       }
   


      
    }

    else if (choice2==3)
     {

      System.out.println("Alu Roll ");
    System.out.println("Enter Quantity");
     qut= sc1.nextInt();

    r3price=qut*60;

    System.out.println("Total ="+r3price);
    System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
    display();

    v1.add("Alu Roll \t\t\t"+qut+"\t\t\t"+"60\t\t\t"+r3price);
  

    Iterator value = v1.iterator();
 
    while (value.hasNext()) {

    
        System.out.println(value.next());
    }


    System.out.println("\nWant to add more items? (y-n)");

    ch=sc1.next().charAt(0);
     sc1.nextLine();

      if(ch=='N' || ch=='n')
       {
        System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
        System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
        System.exit(0);

                
       }
    
      
    }

    else if(choice2==4)
        {
          food1();
        }

   

  else  if (choice2==5)
     {

      System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
      System.exit(0);
      
    }

    
    
  }while(choice2!=5);

}
  void thali()
  {

    do{  
            System.out.println(" 1. Veg Thali     Rs.140");
            System.out.println(" 2. Chicken Thali Rs.170");
            System.out.println(" 3. Mutton Thali  Rs.200");
            System.out.println(" 4. Back");
            System.out.println(" 5. Exit");
            choice2 = sc1.nextInt();
    
       
       if (choice2==1)
       {
        System.out.println("Veg Thali ");
        System.out.println("Enter Quantity");
         qut= sc1.nextInt();
    
        t1price=qut*140;
    
        System.out.println("Total ="+t1price);
        System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
        display();
        v1.add("Veg Thali \t\t\t"+qut+"\t\t\t"+"140\t\t\t"+t1price);
        
        Iterator value = v1.iterator();
     
        while (value.hasNext()) {
    
           
            System.out.println(value.next());
        }
    
    
        System.out.println("\nWant to add more items? (y-n)");
        ch=sc1.next().charAt(0);
         sc1.nextLine();
    
          if(ch=='N' || ch=='n')
           {
            System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
            System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
            
            System.exit(0);
    
                    
           }
    
  
       }
       
    
       else if (choice2==2)
         {
          
    
          System.out.println("Chicken Thali ");
        System.out.println("Enter Quantity");
         qut= sc1.nextInt();
    
        t2price=qut*150;
    
        System.out.println("Total ="+t2price);
        System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
        display();
        v1.add("Chicken Thali \t\t\t"+qut+"\t\t\t"+"150\t\t\t"+t2price);
       
        Iterator value = v1.iterator();
     
        while (value.hasNext()) {
    
        
            System.out.println(value.next());
        }
    
      
        System.out.println("\nWant to add more items? (y-n)");
        ch=sc1.next().charAt(0);
         sc1.nextLine();
    
          if(ch=='N' || ch=='n')
           {
            System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
            System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
            System.exit(0);
    
                    
           }
  
          
        }
    
        else if (choice2==3)
         {
    
          System.out.println("Mutton Thali ");
        System.out.println("Enter Quantity");
         qut= sc1.nextInt();
    
        t3price=qut*160;
    
        System.out.println("Total ="+t1price);
        System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
        display();
    
        v1.add("Mutton Thali \t\t\t"+qut+"\t\t\t"+"160\t\t\t"+t3price);
        
    
        Iterator value = v1.iterator();
     
        while (value.hasNext()) {
    
        
            System.out.println(value.next());
        }
    
    
        System.out.println("\nWant to add more items? (y-n)");
    
        ch=sc1.next().charAt(0);
         sc1.nextLine();
    
          if(ch=='N' || ch=='n')
           {
            
            System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
            System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
            System.exit(0);
    
                    
           }
         
          
        }

        else if(choice2==4)
        {
          food1();
        }
    
       
    
      else  if (choice2==5)
         {
    
         
          System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
          System.exit(0);
          
        }
      }while(choice2!=5);


  }
  

  void briyani()
  { 

    do{  
            System.out.println(" 1. Veg Briyani     Rs.180");
            System.out.println(" 2. Chicken Briyani Rs.290");
            System.out.println(" 3. Mutton  Briyani Rs.360");
            System.out.println(" 4. Back");
            System.out.println(" 5. Exit");
            choice2 = sc1.nextInt();

 
 if (choice2==1)
 {
  System.out.println("Veg Briyani  ");
  System.out.println("Enter Quantity");
   qut= sc1.nextInt();

  b1price=qut*180;

  System.out.println("Total ="+b1price);
  System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
  display();
  v1.add("Veg Briyani  \t\t\t"+qut+"\t\t\t"+"180\t\t\t"+b1price);
  
  Iterator value = v1.iterator();

  while (value.hasNext()) {

     
      System.out.println(value.next());
  }


  System.out.println("\nWant to add more items? (y-n)");
  ch=sc1.next().charAt(0);
   sc1.nextLine();

    if(ch=='N' || ch=='n')
     {
      
      System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
      System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
      System.exit(0);

              
     }

 }
 

 else if (choice2==2)
   {
    

    System.out.println("Chicken Briyani ");
  System.out.println("Enter Quantity");
   qut= sc1.nextInt();

  b2price=qut*290;

  System.out.println("Total ="+b2price);
  System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
  display();
  v1.add("Chicken Briyani\t\t\t"+qut+"\t\t\t"+"290\t\t\t"+b2price);
  
  Iterator value = v1.iterator();

  while (value.hasNext()) {

  
      System.out.println(value.next());
  }


  System.out.println("\nWant to add more items? (y-n)");
  ch=sc1.next().charAt(0);
   sc1.nextLine();

    if(ch=='N' || ch=='n')
     {
      
      System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
      System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
      System.exit(0);

              
     }
 
    
  }

  else if (choice2==3)
   {

    System.out.println("Mutton Briyani ");
  System.out.println("Enter Quantity");
   qut= sc1.nextInt();

  b3price=qut*360;

  System.out.println("Total ="+b1price);
  System.out.println("Your Order will be deliver at "+ name +" "+ address+" in 40 minutes");
  display();
  v1.add("Mutton Briyani \t\t\t"+qut+"\t\t\t"+"360\t\t\t"+b3price);

  

  Iterator value = v1.iterator();

  while (value.hasNext()) {

  
      System.out.println(value.next());
  }


  System.out.println("\nWant to add more items? (y-n)");

  ch=sc1.next().charAt(0);
   sc1.nextLine();

    if(ch=='N' || ch=='n')
     {
      
      System.out.println("\n\t\t\t\t---------------Inoice Total = "+ total+"---------------");
      System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
      System.exit(0);

              
     }
  
    
  }

  else if(choice2==4)
  {
    food1();
  }

 

else  if (choice2==5)
   {

    System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
    System.exit(0);
    
  }
}while(choice2!=5);

  }


   public void food1()
    {
       System.out.flush(); 

        System.out.println("-----------------------------------Food Menu-----------------------------------");
     
       do{ 


        System.out.println(" 1. Rolls");
        System.out.println(" 2. Thali");
        System.out.println(" 3. Briyani");
        System.out.println(" 4. Exit");
        int choice = sc1.nextInt();

        switch (choice) {

            
            case 1:{

              
              roll();
              
              break;
            }

            case 2 :
            {
              thali();
              
              break;


            }

            case 3 :
            {
              briyani();
              
              break;


            }
              

          case 4 :
          {
            System.out.println("\n\n\t\t\t\t\t-----Thank you for using system-----");
            System.exit(0);
          
          break;
          }

            default:
            {
            System.out.println("Plese Enter Number (1-4)");
            System.exit(0);


                break;

            }
        }
    }while (choice2!=5);
 
   

}


} 
    



 public class micro {


             
          

 public static void main(String[] args) {
    

   Order i1 = new Order();


 

     System.out.println("--------------------------------------------Food Parcel Delivery Service--------------------------------------------");
     i1.getinfo();
     i1.food1();
    


     }


 }





