package HospitalManagement;

public class Patient {
    private static int idCount=1;
    private int id;
    private String name;
    private int age;
    private String gender;
    public Patient(String name , int age, String gender){
        id=idCount++;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Patient ID : "+id+",Name : "+name+",Age : "+age+",Gender : "+gender;
    }
}
