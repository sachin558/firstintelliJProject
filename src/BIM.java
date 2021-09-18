//Q2) Design a class that can be used by a health care professional to keep track of
// a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),width(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.


class patient{
    String name;
    double hight;
    double width;
    patient(){
       name="sachin";
       hight=90;
       width=80;
    }
    double computeBMI(){
        return width/hight*hight;
    }
}

public class BIM {
    public static void main(String[] args) {
        patient obj=new patient();
        obj.computeBMI();
        System.out.println(obj.computeBMI());
    }

}
