
package com.mycompany.assignment_2;
import java.io.*;
import java.util.*;
public class ShopOwner extends User
{
    String shopname;
    ShopOwner()
    {
        super();
        shopname= "none";
    }
    ShopOwner(String name, String address, String userID)
    {
        super(name,address,userID);
        shopname= "none";
    }
    Scanner input = new Scanner(System.in);
    void searchproduct() throws FileNotFoundException, IOException
    {
        System.out.println("Enter name of search product");
        String sProduct = input.next();
        FileReader fr = new FileReader("AddProduct.txt");    
          int i;    
          while((i=fr.read())!=-1) 
          {
              if(sProduct  == PName)
              {
                  System.out.println("Product available");
              }
              else
              {
                  System.out.println("Not available");
              }
          }
          fr.close();    
    }
    void buyProduct() 
    {
        System.out.println("Enter name of Product to buy");
        String bProduct = input.next();
        
    }
    void makepayment()
    {
        
    }
    
}
