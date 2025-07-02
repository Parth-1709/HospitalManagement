# 🏥 Hospital Management System (Java Console-Based)

This is a **Java console-based application** that allows users to manage patients, doctors, and their appointments. It demonstrates object-oriented programming principles using multiple classes and a simple menu-driven interface.

## 📌 Features

- ✅ Add new patients with auto-generated IDs
- ✅ Add new doctors with specializations and unique IDs
- ✅ Schedule appointments by matching patient and doctor IDs
- ✅ View lists of:
  - Patients
  - Doctors
  - Appointments
- ✅ Simple text-based menu interface using Java `Scanner`

---

## 🧱 Classes Used

### 1. `Patient.java`
- Fields: `id`, `name`, `age`, `gender`
- Auto-increments ID for each new patient
- Overrides `toString()` to display details

### 2. `Doctor.java`
- Fields: `id`, `name`, `speciality`
- Auto-increments ID for each new doctor
- Overrides `toString()` to display details

### 3. `Appointment.java`
- Links a `Patient` with a `Doctor` and a date
- Overrides `toString()` to show the appointment summary

### 4. `Management.java` (Main Class)
- Menu-based interface
- Stores all data in in-memory `ArrayList`s
- Contains static utility methods to add and view patients, doctors, and appointments

---

## 💻 Technologies Used

- Java 17+ (compatible with Java 8+)
- Console-based (no GUI)
- Standard Java Libraries only (`ArrayList`, `Scanner`)

---

## 🚀 How to Run

1. Clone or download the repository.
2. Open in your preferred IDE (VS Code, IntelliJ, Eclipse).
3. Compile and run the `Management.java` file.
4. Use the console menu to interact with the system.

```bash
javac Management.java
java Management
