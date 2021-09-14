//Q2) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//   Name of the class - Patient
// Member Variables - patientName(String),height(double),width(double)
// Member Function - double computeBMI()
//  The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//  Create an object of the Patient class and check the results.

public class patient {
    String Name;
    double height;
    double width;
}
class pati{
public static void main(String []args) {
    patient obj=new patient();
   double vol;
   obj.Name="sachin";
    obj.height=30;
    obj.width=40;
     vol= obj.width/ obj.height*obj.height;
    System.out.println(obj.Name);
    System.out.println(vol+"in meter the ");
}
}
