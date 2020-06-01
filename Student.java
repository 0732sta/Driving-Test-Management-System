import java.util.Scanner;

public class Student
{
     private String StudentId;
     private String StudentName;
     private String StudentNum;
     private String StudentAddress;
     private double CreditHour;
     private String StudentStatus;
     private double TotalPayment;
     private double PaymentPaid;
     
     public Student()
     {
         StudentId = null;
         StudentName = null;
         StudentNum = null;
         StudentAddress = null;
         CreditHour = 0.00;
         StudentStatus = null;
         TotalPayment = 0.00;
         PaymentPaid = 0.00;
     }
     
     public String getStudentId()
     {
         return StudentId;
         
     }
     
     public String getStudenName()
     {
         return StudentName;
         
     }
     
     public String getStudentNum()
     {
         return StudentNum;
         
     }
     
     public String getStudentAddress()
     {
         return StudentAddress;
         
     }
     
     public double CreditHour()
     {
         return CreditHour;
     }
     
     public String getStudentStatus()
     {
         return StudentStatus;
         
     }
     
     public double TotalPayment()
     {
         return TotalPayment;
     }
     
     public double PaymentPaid()
     {
         return PaymentPaid;
     }
        
     
     public void setAll(String id, String name, String num, String add, double chr, String s, double total, double paid)
     {
         this.StudentId = id;
         this.StudentName = name;
         this.StudentNum = num;
         this.StudentAddress = add;
         this.CreditHour = chr;
         this.StudentStatus = s;
         this.TotalPayment = total;
         this.PaymentPaid = paid;
     }
     
     public String toString()
     {
         return ("Student ID :" + StudentId);
     }
     
     public void displayBalance()
     {
      
        
      }
  }  
    