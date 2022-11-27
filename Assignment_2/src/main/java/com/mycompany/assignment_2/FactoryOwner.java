package com.mycompany.assignment_2;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class FactoryOwner extends User {
   String storeName;
   Scanner input = new Scanner(System.in);
   FactoryOwner()
   {
       super();
       storeName= "none";
   }
   FactoryOwner(String name, String address, String userID, String storeName )
   {
       super(name,address,userID);
       this.storeName = storeName;
   }
    String pName;
   void Addproducts() 
   {
       System.out.println("How many Product you want to Add ?");
       int n = input.nextInt();
       File myfile = new File("AddProduct");
       try
       {
                myfile.createNewFile();
               FileWriter filewriter = new FileWriter("AddProduct");
       for(int i=0; i<n;i++)
       {
           System.out.println("Enter name of Product");
            pName = input.next();
           filewriter.write(pName);
           System.out.println("Emter Product ID");
           int id = input.nextInt();
           System.out.println("Enter Price of Product");
           int price = input.nextInt();
           filewriter.write(price);
           System.out.println("Enter Quantity of Product");
           int qty = input.nextInt();
           filewriter.write(qty);
       }
       filewriter.close();
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }
       System.out.println("Product Added");
   }       
   void DeleteProduct()
  {
      System.out.println("Enter Product name to delete");
      String dProduct = input.next();
      File file = new File("AddProduct.txt");
      File newfile = new File("newAddProduct");
      try
      {
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine())
      {
          if(dProduct == pName)
          {
              System.out.println("Record deleted");   
           }
          
      }
      file.delete();
      file.renameTo(newfile);
      }
      catch(FileNotFoundException e)
      {
          e.printStackTrace();
      }
  } 
 
  
  
  
  
  
  
  
 }
}

