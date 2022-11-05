package ie.atu;

public class PassengerInfo {
    private int countValue;
    private String titleValue;
    private String nameValue;
    private String IDValue;
    private String phoneValue;
    private int ageValue;
    int titleOK =0;
    int nameOK =0;
    int IDOK =0;
    int phoneOK =0;
    int ageOK =0;



    public PassengerInfo() {
        titleValue = "Mr";
        nameValue = "John Doe";
        IDValue = "1045";
        phoneValue = "0861234567";
        ageValue = 17;
    }

    public PassengerInfo(int tartingValue) {
        if (tartingValue > 5 ) {
            countValue = tartingValue;
        }
        else
        {
          throw new IllegalArgumentException("This is not a valid number");
        }
    }

    public int name() {
        if (nameValue.length() >= 3) {
            nameOK++;
        }
        return nameOK;
    }
    public int id() {
        if (IDValue.length() >= 10) {
            IDOK++;
        }
        return IDOK;
    }
    public int phone() {
        if (phoneValue.length() >= 7) {
            phoneOK++;
        }
        return phoneOK;
    }

    public int title() {
        if (titleValue == "Mrs" || titleValue == "Mr" || titleValue == "Ms") {
            titleOK++;
        }
        return titleOK++;
    }

    public int age() {
        if (ageValue >= 16) {
            ageOK++;
        }
    return ageOK;
    }
}
