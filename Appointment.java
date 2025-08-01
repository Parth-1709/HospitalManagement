package HospitalManagement;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    String date;
    public Appointment(Patient patient,Doctor doctor,String date){
        this.patient=patient;
        this.doctor=doctor;
        this.date=date;
    }
    public String toString(){
        return "Appointment: [Patient: " + patient + ", Doctor: " + doctor + ", Date: " + date + "]";
    }
}
