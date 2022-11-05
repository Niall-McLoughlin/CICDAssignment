package ie.atu;

public class PassengerInfo {
    private int countValue;
    public PassengerInfo() {
        countValue = 0;
    }
    public PassengerInfo(int startingValue) {
        if (startingValue > 5 ) {
            countValue = startingValue;
        }
        else
        {
          throw new IllegalArgumentException("This is not a valid number");
        }
    }

    public int increment() {
countValue++;
return countValue;
    }
}
