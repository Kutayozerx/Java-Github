package hafta2.oop.encapsulation;

public class HospitalTest {

    public static void main(String[] args) {
        Patient patient = new Patient("123");
        patient.identityNumber = "123";
        patient.setName("Ahmet");
        patient.setSurname("Ak");
        patient.setAge(33);


        Patient patient1 = new Patient("1234");
        patient1.setName("Ayşe");
        patient1.setSurname("Sarı");

        Patient patient2 = new Patient("12345678901");
        patient1.setName("Fatma");
        patient1.setSurname("Beyaz");
    }
}
