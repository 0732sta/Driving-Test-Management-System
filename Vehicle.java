
import java.util.Scanner;

public class Vehicle
{
    public String RegNo;
    public String TransmissionCode;
    public double Fee;
    public double RepeatFee;
     
     public Vehicle()
     {
         RegNo = null;
         TransmissionCode = null;
         Fee = 0.00;
         RepeatFee = 0.00;
     }
     
     public String getRegNo()
     {
         return RegNo;
     }
     
     public String getTransmissionCode()
     {
         return TransmissionCode;
     }
     
     public double getFee()
     {
         return Fee;
     }
     
     public double getRepeatFee()
     {
         return RepeatFee;
     }
     
     
     public void setAll(String RegNo, String TransmissionCode, double Fee, double RepeatFee)
     {
         this.RegNo = RegNo;
         this.TransmissionCode= TransmissionCode;
         this.Fee = Fee;
         this.RepeatFee = RepeatFee;
     }
     
     public String toString()
     {
         return ("Vehicle Registration Number :" + RegNo);
     }
  }  
    