package ie.atu;

public class PassengerInfo {
    private String titleValue;
    private String nameValue;
    private String idValue;
    private String phoneValue;
    private int ageValue;
    int titleOK =0;
    int nameOK =0;
    int idOK =0;
    int phoneOK =0;
    int ageOK =0;



    public PassengerInfo() {
        titleValue = "Mr";
        nameValue = "John Doe";
        idValue = "1234567890";
        phoneValue = "0861234567";
        ageValue = 17;
    }


    public int name() {
        if (nameValue.length() >= 3) {
            nameOK++;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid Name");
        }

        return nameOK;
    }
    public int id() {
        if (idValue.length() >= 10) {
            idOK++;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid ID number");
        }

        return idOK;
    }
    public int phone() {
        if (phoneValue.length() >= 7) {
            phoneOK++;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid phone number");
        }

        return phoneOK;
    }

    public int title() {
        if (titleValue == "Mrs" || titleValue == "Mr" || titleValue == "Ms") {
            titleOK++;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid Title");
        }

        return titleOK++;
    }

    public int age() {
        if (ageValue >= 16) {
            ageOK++;
        }
        else
        {
            throw new IllegalArgumentException("You are not old enough to fly");
        }

        return ageOK;
    }
}
