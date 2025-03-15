package hafta2.oop.encapsulation;

public class Patient {

    String identityNumber;

    private String name;

    private String surname;

    private int age;

    public Patient(String identityNumber) {
        setIdentityNumber(identityNumber);
    }

    public Patient() {
    }

    public void setIdentityNumber(String identityNumber) {

        if (identityNumber.length() != 11) {
            System.out.println("11 haneden farklı bir TCKN giremezsiniz!");
        }else {
            this.identityNumber = identityNumber;
            System.out.println("Doğru TCKN girdiniz! Hasta kaydına ulaşıldı.");
        }
    }

    public String getidentityNumber() {
        return identityNumber;
    }

    public void setidentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

