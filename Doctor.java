import java.util.*;

class Patient{
    private String patientname;
    private String patientid;
    private String illness;

    public Patient(String patientname, String patientid, String illness) {
        this.patientname = patientname;
        this.patientid = patientid;
        this.illness = illness;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient{");
        sb.append("patientname=").append(patientname);
        sb.append(", patientid=").append(patientid);
        sb.append(", illness=").append(illness);
        sb.append('}');
        return sb.toString();
    }
   
    
}
public class Doctor {
    private String doctorname;
    private int doctorid;
     private String specialization;
     private List<Patient> patients;

     

     public void addPatient(Patient p){
        patients.add(p);
    }

    public Doctor( int doctorid,String doctorname, String specialization) {
        this.doctorname = doctorname;
        this.doctorid = doctorid;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    
    public String getDoctorname() {
        return doctorname;
    }
    
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
    
    public int getDoctorid() {
        return doctorid;
    }
    
    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public List<Patient> getPatients() {
        return patients;
    }
    
    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    

    public static List<String> getUniqueIllnessses(List<Doctor> doctorlist,int doctorid)
    {
        
        Doctor doctor=null;
        for(Doctor d:doctorlist ){
            if(d.getDoctorid()==(doctorid)){
                doctor=d;
                break;
            }
        }
        if(doctor==null){
            System.out.println("No doctor found");
            return Collections.emptyList();
        }
        Set<String> illnesss=new HashSet<>();
        for(Patient p:doctor.getPatients()){
            illnesss.add(p.getIllness());
        }
        
        List<String> UniqueIllnesses=new ArrayList<>(illnesss);
        return UniqueIllnesses;        
    }

    public static List<String> getDoctorsBySpecialization(List<Doctor> Doctorlist,String Specialization){
        List<String> dl=new ArrayList();
        for(Doctor d:Doctorlist){
            if(d.getSpecialization().equals(Specialization)){
                dl.add(d.getDoctorname());
                
            }
        }
        if(dl.isEmpty()){
            System.out.println("No doctor found");
            return null;
        }
        return dl;
    }
    public static void main(String[] args) {
        Doctor doc1 = new Doctor(1, "Dr. Smith", "Cardiology");
        Doctor doc2 = new Doctor(2, "Dr. Johnson", "Neurology");
        Doctor doc3 = new Doctor(3, "Dr. Williams", "Cardiology");

        // Create patients
        Patient pat1 = new Patient("1", "Alice", "Hypertension");
        Patient pat2 = new Patient("2", "Bob", "Diabetes");
        Patient pat3 = new Patient("3", "Charlie", "Hypertension");
        Patient pat4 = new Patient("4", "David", "Epilepsy");

        // Assign patients to doctors
        doc1.addPatient(pat4);
        doc2.addPatient(pat2);
        doc3.addPatient(pat3);
        doc1.addPatient(pat1);


        ArrayList doctors=new ArrayList();
        doctors.add(doc1);
        doctors.add(doc2);
        doctors.add(doc3);

        System.out.println(Doctor.getUniqueIllnessses(doctors, 1)); // Should print illnesses of Dr. Smith
        System.out.println(Doctor.getDoctorsBySpecialization(doctors, "Cardiology"));
        System.out.println("test 2");
        System.out.println(Doctor.getUniqueIllnessses(doctors, 22)); // Should print illnesses of Dr. Smith
       

    }
}
