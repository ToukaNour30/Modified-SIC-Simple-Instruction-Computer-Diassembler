import java.util.ArrayList;

public class LocationCounter {
    public static ArrayList<String> locationCounters;
    private static String LocationCount;


    public static String getLocationCount() {
        return LocationCount;
    }

    public static void setLocationCount(String locationCount) {
        LocationCount = locationCount;
    }

    public LocationCounter( String locationCount)
    {
        this.locationCounters = new ArrayList<>();
        this.LocationCount=LocationCount;
    }
    public static void incrementLocationCounter(InstructionInfo instructionInfo) {
        String format = instructionInfo.getFormat();
        if ("1".equals(format)) {
            // Perform your logic here
           setLocationCount(getLocationCount()+1);
        }
        else {
            setLocationCount(getLocationCount()+3);

        }
        locationCounters.add(getLocationCount());
    }
//    public static void initializeLocationCounters()
//    {
//        locationCounters.add(0);
//    }
//    public static void setLsbOfLocationCounter(int value) {
//        // Get the current location counter value
//        int currentLocation = locationCounters.get(locationCounters.size() - 1);
//
//        // Set the least significant bit to the specified value
//        int newLocation = (currentLocation & 0xFFFFFFFE) | (value & 1);
//
//        // Update the location counter with the new value
//        locationCounters.set(locationCounters.size() - 1, newLocation);
//    }

}
