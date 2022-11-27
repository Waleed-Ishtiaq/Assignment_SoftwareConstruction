
package com.mycompany.assignment_2;
public class User 
{
  String name;
  String Address;
  String userID;
  User()
  {
       name="none";
       Address="none";
       userID="none";
  }
  User(String name, String Address, String userID)
  {
      this.name= name;
      this.Address = Address;
      this.userID = userID;
  }
  void display()
  {
      System.out.println("Name: "+name);
      System.out.println("Address:"+Address);
      System.out.println("User ID"+userID);
  }
}
