package InClass_model;

import java.util.Objects;


public class Person {

    private String name;
    protected String phoneNumber;
    private String emailAddress;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean setEmailAddress(String emailAddress) {
        if (emailAddress != null && emailAddress.contains("@")) {
            this.emailAddress = emailAddress;
            return true;
        }
        return false;
    }

    public String getSignature() {
        String result;
        result = name.substring(0, 2);
        result += name.substring(name.length() - 2);
        return result.toUpperCase();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
       
        if(!(obj instanceof Person)){ return false  ;}
        
        final Person other = (Person) obj;
        return this.getName().equalsIgnoreCase(other.getName());
        
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
//            return false;
//        }
//        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
//            return false;
//        }
//        return true;
    }
    

    @Override
    public String toString() {
        return name + "\nphoneNumber: " + phoneNumber + "\nemailAddress: " + emailAddress;
    }
}
