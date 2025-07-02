package HospitalManagement;

import java.util.ArrayList;
import java.util.*;

public class Management {
    public static void addPatient(Scanner sc){
        System.out.println("Enter Patient Name");
        String name = sc.next();
        System.out.println("Enter Patient Age");
        int age = sc.nextInt();
        System.out.println("Enter Patient Gender");
        String gender = sc.next();
        Patient p = new Patient(name,age,gender);
        patients.add(p);
        System.out.println("Patient added successfully...");
        System.out.println();

    }
    public static void addDoctor(Scanner sc){
        System.out.println("Enter Doctor Name");
        String name = sc.next();
        System.out.println("Enter Speciality");
        String sp = sc.next();
        Doctor d = new Doctor(name,sp);
        doctors.add(d);
        System.out.println("Doctor added successfully...");
        System.out.println();
    }
    public static void addSchedule(Scanner sc){
        System.out.println("Enter patient id");
        int p = sc.nextInt();
        System.out.println("Enter doctor id");
        int d = sc.nextInt();
        System.out.println("Enter date : (YYYY-MM-DD)");
        String date = sc.next();
        Patient patient=findPatientbyid(p);
        Doctor doctor = findDoctorbyid(d);
        if(doctor!=null && patient!=null){
            Appointment ap = new Appointment(patient,doctor,date);
            appointments.add(ap);
            System.out.println("Appointment added successfully...");
            System.out.println();
        }
        else{
            System.out.println("Invalid doctor or patient id");
        }
    }
    public static Patient findPatientbyid(int id){
        for(Patient u:patients){
            if(u.getId()==id) return u;
        }
        return null;
    }
    public static Doctor findDoctorbyid(int id){
        for(Doctor d:doctors){
            if(d.getId()==id) return d;
        }
        return null;
    }
    public static void viewPatients(){
        if(patients.isEmpty()){
            System.out.println("No data to be found");
            return;
        }
        for(Patient p : patients){
            System.out.println(p);
        }
    }
    public static void viewDoctors(){
        if(doctors.isEmpty()){
            System.out.println("No data to be found ");
            return;
        }
        for(Doctor d : doctors){
            System.out.println(d);
        }
    }
    public static void viewAppointment(){
        if(appointments.isEmpty()){
            System.out.println("No data to be found");
            return ;
        }
        for(Appointment ap : appointments){
            System.out.println(ap);
        }
    }
    static ArrayList<Patient> patients=new ArrayList<>();
    static ArrayList<Doctor> doctors= new ArrayList<>();
    static ArrayList<Appointment>appointments=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  ;
        while(true){
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            if(n==0){
                System.out.println("Exiting...");
                break;
            }
            else if(n==1){
                addPatient(sc);
            }
            else if(n==2){
                addDoctor(sc);
            }
            else if(n==3){
                addSchedule(sc);
            }
            else if(n==4){
                viewPatients();
            }
            else if(n==5){
                viewDoctors();
            }
            else if(n==6){
                viewAppointment();
            }
            else{
                System.out.println("Invalid value . Please Try Again");
            }
        }
    }
}
