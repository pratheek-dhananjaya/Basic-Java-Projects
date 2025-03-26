import java.util.Scanner;
public class Amazun
    {
        double amt;
        String p;
        int res;
        Scanner sc=new Scanner(System.in);
        
        Amazun()
        {
            amt=0.0;
            p="";
            res=-1;
        }
        void accept()
        {
        
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            System.out.println("************WELCOME TO AMAZUN INDIA************");
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            System.out.println("1.Shop By Department");
            System.out.println("2.Check Bumper Deals");
            System.out.println("3.Replacement");
            System.out.println("4.Customer Care");
            System.out.println("5.Display the list");
            System.out.println("Enter the number for desired choice");
        //accept the choice
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.Books");
                    System.out.println("2.Apparel");
                    System.out.println("3.Watches");
                    System.out.println("4.Electronics");
                    int op=sc.nextInt();
                    if(op==1)//option is books
                    {
                            System.out.println("1.New Arrivals");
                            System.out.println("2.Browse");
                            System.out.println("Please Enter your choice");
                            int op1=sc.nextInt();//option is new arrivals
                            if(op1==1)
                            {
                                    System.out.println("  Book                                         Author                      Price");
                                    System.out.println("1.Half Girlfriend                              Chetan Bhagat               Rs.175");
                                    System.out.println("2.Blood of Olympus                             Rick Riordan                Rs.400");
                                    System.out.println("3.Sachin Tendulkar:Doing it my way             Sachin Tendulkar            Rs.250");
                                    System.out.println("4.Adultry                                      Paulo Coelho                Rs.190");
                                    System.out.println("Enter Serial Number");
                                    int num=sc.nextInt();   
                                    System.out.println("Enter Quantity");
                                    int q1=sc.nextInt();
                                    if(num==1)
                                    {   
                                        amt=175*q1;
                                        p="Half Girlfriend ";
                                    }
                                    else if(num==2)
                                    {
                                        amt=400*q1;
                                        p="Blood of Olympus ";
                                    }
                                    else if(num==3)
                                    {
                                        amt=250*q1;
                                         p="Sachin Tendulkar:Doing it my way ";
                                    }
                                    else
                                    {
                                        amt=180*q1;
                                        p="Adultry ";
                                    }
                                }//op1 closes here; op1 is books
              
                
                                if(op1==2)//option is to browse books
                                {
                                 System.out.println(" Book                                     Author               Price");
                                 System.out.println("1.Inferno                                   Dan Brown            Rs.350");
                                 System.out.println("2.Diary of a Wimpy Kid                      Jeff Kinney          Rs.200");
                                 System.out.println("3.Percy Jackson and The Lighting Thief      Rick Riordan         Rs.300");
                                 System.out.println("4.Revolution 2020                           Chetan Bhagat        Rs.175");
                                 System.out.println("5.The Alchemist                             Paulo Coelo          Rs.190");
                                 System.out.println("6.Test of my Life                           Yuvraj Singh         Rs.235");
                                 System.out.println("Enter Serial Number");
                                 int serial=sc.nextInt();
                                 System.out.println("Enter Quantity");
                                 int q=sc.nextInt();
                                 if(serial==1){
                                        amt=350*q;
                                        p="Inferno";
                                 }
                                 else if(serial==2){
                                        amt=200*q;
                                        p="Diary of a Wimpy Kid ";
                                 }
                                 else if(serial==3){
                                        amt=300*q;
                                        p="Percy Jackson and The Lighting Thief";
                                 }
                                 else if(serial==4){
                                        amt=175*q;
                                        p="Revolution 2020";
                                 }
                                 else if(serial==5){
                                    amt=190*q;
                                    p="The Alchemist ";
                     }
                                 else if(serial==6){
                                    amt=235*q;
                                    p="Test of my Life ";}
                                 else{                                  
                                     System.out.println("Wrong Choice.Enter Again");
                                     int serial1=sc.nextInt();
                                     if(serial1==1){
                                            amt=350*q;
                                        p="Inferno";
                         }
                                         else if(serial1==2){
                                             amt=200*q;
                                             p="Diary of a Wimpy Kid ";
                         }
                                     else if(serial1==3){
                                             amt=300*q;
                                         p="Percy Jackson and The Lighting Thief";
                         }              
                                     else if(serial1==4){
                                            amt=175*q;
                                            p="Revolution 2020";
                         }
                                         else if(serial1==5){
                                            amt=190*q;
                                            p="The Alchemist ";
                         }
                                         else{
                                             amt=235*q;
                                             p="Test of my Life ";
                                     }
                    
                    
                            }
                    System.out.println("Do you wan to go back to Main Menu?Yes/No");
                                String menu=sc.next();
                    
                                if(menu.equalsIgnoreCase("Yes"))
                                accept();
                                else
                                display();
                    }//op1==2 closes here books-> browse
            }
                        if(op==2)//apparels
                        {
                                System.out.println(" Product               Colour             Price");         
                                System.out.println("1.UMM T-Shirt          Black/Blue         Rs.799");
                                System.out.println("2.RIG Shirt            Brown Striped      Rs.899");
                                System.out.println("3.Levis Shirt          Yellow/White       Rs.799");
                                System.out.println("4.Indigo Nations Pants Blue               Rs.1599");
                                System.out.println("5.Ajile Trousers       White              Rs.1099"); 
                                System.out.println("Enter Choice");
                                int choice=sc.nextInt();
                                System.out.println("Enter Size-S,M,L,XL");
                                String size=sc.next();
                                if (choice==1){
                                    amt=799;
                                    p="UMM T-Shirt  ";
                    }
                                else if(choice==2){
                                    amt=899;
                                    p="RIG Shirt ";
                    }
                                else if(choice==3){
                                    amt=799;
                                    p="Levis Shirt ";}
                                else if(choice==4){
                                    amt=1599;
                                    p="Indigo Nations Pants";}
                                else if(choice==5){
                                    amt=1099;
                                    p="Ajile Trousers";}
                                else
                                {
                                    System.out.println("Wrong Choice.Enter Again");
                                    int choice12=sc.nextInt();
                                    if (choice12==1){
                                        amt=799;
                                        p="UMM T-Shirt  ";}
                                    else if(choice12==2){
                                        amt=899;
                                        p="RIG Shirt ";}
                                    else if(choice12==3){
                                        amt=799;
                                        p="Levis Shirt ";}
                                    else if(choice12==4){
                                        amt=1599;
                                        p="Indigo Nations Pants";}
                                    else{ 
                                        amt=1099;
                                        p="Ajile Trousers";
                        }
                    
                        
                            }
                    System.out.println("Do you wan to go back to Main Menu?Yes/No");
                                String menu=sc.next();
                                //Amazun obj1=new Amazun();
                                if(menu.equalsIgnoreCase("Yes"))
                                accept();
                                else
                                display();
                }//op==2 closes here ->apparels

                 if(op==3)//watches
                  {
                                System.out.println("  Product                       Price");
                                System.out.println("1.Casio Edifice Brown Dial      Rs.6000");
                                System.out.println("2.Titan Raga Silver Dial        Rs.4000");
                                System.out.println("3.Timex Black Dial              Rs.7000");
                                System.out.println("4.Police White Dial             Rs.5000");
                                System.out.println("Enter Choice");
                                int choice1=sc.nextInt();
                                if (choice1==1){
                                    amt=6000;
                                    p="Casio Edifice Brown Dial";}
                                else if(choice1==2){
                                    amt=4000;
                                    p="Titan Raga Silver Dial ";}
                                else if(choice1==3){
                                    amt=7000;
                                    p="Timex Black Dial";}
                                else if(choice1==4){
                                    amt=5000;
                                    p="Police White Dial";}
                    
                                else{
                                    System.out.println("Wrong Choice.Enter Again");
                                    int ch1=sc.nextInt();
                                    if (ch1==1){
                                        amt=6000;
                                        p="Casio Edifice Brown Dial";}
                                    else if(ch1==2){
                                        amt=4000;
                                        p="Titan Raga Silver Dial ";}
                                    else if(ch1==3){
                                        amt=7000;
                                        p="Timex Black Dial";}
                                    else{ 
                                        amt=5000;
                                        p="Police White Dial";
                        }
                        
                            }
                    System.out.println("Do you wan to go back to Main Menu?Yes/No");
                                String menu=sc.next();
                                //Amazun obj1=new Amazun();
                                if(menu.equalsIgnoreCase("Yes"))
                                accept();
                                else
                                display();                
                                }//op==3 closes here ->watches
                        
                if(op==4)
                            {
                                System.out.println("  Product                  Price");
                                System.out.println("1.Saumsung 40' LED TV      Rs.40,000");
                                System.out.println("2.Sony 20W Speakers        Rs.7000");
                                System.out.println("3.JBL Headphones           Rs.6000");
                                System.out.println("4.Nokia XL                 Rs.5000");
                                System.out.println("5.Pioneer Car Speakers     Rs.19,000");
                                System.out.println("6.LG 2 Litre Oven          Rs.23,000");
                                System.out.println("Enter Serial Number");
                                int choice2=sc.nextInt();
                                if (choice2==1){
                                    amt=40000;
                                    p="Saumsung 40' LED TV ";}
                                else if(choice2==2){
                                    amt=7000;
                                    p="Sony 20W Speakers";}
                                else if(choice2==3){
                                    amt=6000;
                                    p="JBL Headphones ";}
                                else if(choice2==4){
                                    amt=5000;
                                    p="Nokia XL";}
                                else if(choice2==5){
                                    amt=19000;
                                    p="Pioneer Car Speakers";}
                                else if(choice2==6){
                                    amt=23000;
                                    p="LG 2 Litre Oven";}
                    
                                else
                                {
                                        System.out.println("Wrong Choice.Enter Again");
                                        int c=sc.nextInt();
                                        if (c==1){
                                            amt=40000;
                                            p="Saumsung 40' LED TV ";}
                                        else if(c==2){
                                            amt=7000;
                                            p="Sony 20W Speakers";}
                                        else if(c==3){
                                            amt=6000;
                                            p="JBL Headphones ";}
                                        else if(c==4){
                                            amt=5000;
                                            p="Nokia XL";}
                                        else if(c==5){
                                            amt=19000;
                                            p="Pioneer Car Speakers";}
                                        else{
                                            amt=23000;
                            p="LG 2 Litre Oven";
                                    }
                    }   
                    System.out.println("Do you wan to go back to Main Menu?Yes/No");
                                String menu=sc.next();
                                //Amazun obj1=new Amazun();
                                if(menu.equalsIgnoreCase("Yes"))
                                    accept();
                                else
                    
                                    display();      
                    
                            }//op4 closes ->electronics
                
                    
                    //res=1;
                
                    
                
                    break;
                
        case 2://bumper deals
                    System.out.println("---------------------------------------");
                    System.out.println("--------------BUMPER DEALS-------------");
                    System.out.println("---------------------------------------");
                    System.out.println("  Product               Old Price                New Price");
                    System.out.println("1.Motorola X            31,000                   21,000");
                    System.out.println("2.Philips Shaver XL     3,500                    1,000");
                    System.out.println("3.Sony 50'LED TV        53,000                   24,000");
                    System.out.println("4.3 Mistakes of My Life 190                      99");
                    System.out.println("Please Enter Choice");
                    int s=sc.nextInt();
                        if(s==1){
                            amt=21000;
                            p="Motorola X";}
                        else if(s==2){
                            amt=1000;
                            p="Philips Shaver XL";}
                        else if(s==3){
                            amt=24000;
                            p="Sony 50'LED TV";}
                        else if(s==4){
                            amt=99;
                            p="3 Mistakes of My Life";}
                        else
                        {
                            System.out.println("Wrong Choice.Enter Again");
                            int ss=sc.nextInt();
                            if(ss==1){
                                amt=21000;
                                p="Motorola X";}
                            else if(ss==2){
                                amt=1000;
                                p="Philips Shaver XL";}
                            else if(ss==3){
                                amt=24000;
                                p="Sony 50'LED TV";}
                            else {
                                    amt=99;
                                p="3 Mistakes of My Life";
                }
                        }
                    
                        System.out.println("Do you wan to go back to Main Menu?Yes/No");
                        String menu=sc.next();
                  
                        if(menu.equalsIgnoreCase("Yes"))
                        accept();
                        else
                        display();
                        System.exit(0);
                        //res=1;
                    break;
                
        case 3://replacement
                System.out.println("----------REPLACEMENT-----------");
                System.out.println("Enter Name");
                String name=sc.next();
                System.out.println("Enter 5-Digit Product Code");
                long code=sc.nextLong();
                System.out.println("Enter Product Name");
                String pro=sc.next();
                System.out.println("Enter New Product Name");
                String newname=sc.next();
                System.out.println("Enter Reason for Replacement");
                String problem=sc.next();
                System.out.println("-------------Replacement Invoice-----------");
                System.out.println("Name:"+name);
                System.out.println("Original Product Code:"+code);
                System.out.println("Product Name:"+pro);
                System.out.println("New Product:"+newname);
                System.out.println("------------------------------------------");
                break;

                case 4://customer care
                System.out.println("---------CUSTOMER CARE-----------");
                System.out.println("CALL US 24/7- 08025567897/08026653246");
                System.out.println("Do you want to give Feedback?Yes/No");
                String option=sc.next();
                   if(option.equalsIgnoreCase("Yes"))
                   {
                    System.out.println("Enter Feedback");
                    String feed=sc.next();
                    System.out.println("We appreciate your feedback");
                  
                   }
                    else
                    {
                      System.out.println("Enter Your Name");
                      String name1=sc.next();
                      System.out.println("Enter 5-Digit Product Code");
                      int code1=sc.nextInt();
                      System.out.println("How can we help you?Please tell us about your problem");
                      String assist=sc.next();
                      System.out.println("We are sorry for the inconvenience.Our Sales Executive shall attend to you soon.");
                      
                    }
                break;
                case 5:
                    display();
                
                    
                    }//switch closes
                }//accept() closes
            
                
                    void display()
                    {
                    System.out.println("***********AMAZUN CHECK OUT RECEIPT*********");
                    System.out.println("Product="+p);
                    System.out.println("Amount="+amt);
                    //System.out.println("**********THANK YOU VISIT AGAIN**************");
                    System.out.println("Choose Payment Option");
                    System.out.println("1.Cash on Delivery");
                    System.out.println("2.Credit Card");
                    int ans = sc.nextInt();
                    if(ans==1)
                    {
                        System.out.println("Enter Name");
                        String name1=sc.next();
                        System.out.println("Enter Mobile Number");
                        double mobile=sc.nextDouble();
                        System.out.println("Enter Address");
                        String address=sc.next();
                        System.out.println("Item will be delivered in 3-5 Business Days");
                         System.out.println("**********THANK YOU VISIT AGAIN**************");
                         System.exit(0);
                     }
                     else
                     {
                            System.out.println("Enter Visa/Mastercard");
                            String bank=sc.next();
                             System.out.println("Enter Credit Card Number");
                             double cardno=sc.nextDouble();
                             System.out.println("Enter Name on credit Card");
                             String cardname=sc.next();
                             System.out.println("Enter CVV Number");
                             int cvv=sc.nextInt();
                             System.out.println("Paymemt Successful.");
                             System.out.println("**********THANK YOU VISIT AGAIN**************");
                             System.exit(0);
                       }
        }//display closes
                        
                public void main()
                    {
                   accept();
                   //if(res!=-1)
                   display();
                }
            
        
    }

        
