import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;

public class HTEHandling {

    public static String startingAddress;
    public static String instructionName;
    public static String instructionformat;
    public static String objectCodePart;


        public static void HandlingAll(String Line) {
        if (Line.startsWith("H")) {
            Hrecord(Line);
        } else if (Line.startsWith("T")) {
            Trecord(Line);
        } else {
            Erecord(Line);
        }
    }



        private static String convertStringToHex(String input) {
            StringBuilder hexString = new StringBuilder();

            for (char character : input.toCharArray()) {
                // Convert each character to hexadecimal representation
                String hex = Integer.toHexString(character);

                // Append the hexadecimal representation to the result
                hexString.append(hex);
            }

            return hexString.toString();
        }



    public static void Hrecord(String Line) {
        String programmName = Line.substring(1, 7);
        startingAddress = Line.substring(7, 13);
        String programLength = Line.substring(13, 19);
        String End = String.valueOf(Integer.parseInt(startingAddress) + Integer.parseInt(programLength));
    }


    public static void Trecord(String Line) {

//  String startAdd = Line.substring(1, 7);
//  String lengthRecord = Line.substring(7, 8);
//  String endRecord = startAdd + lengthRecord;
        ArrayList<String> objectCode = new ArrayList<>();
        String[] parts = Line.split("\\^");
        for (int i = 1; i < (parts.length); i += 3) {
            String startAddress = parts[i];
            String length = parts[i + 1];
            String objectCodePart = parts[i + 2];
            String opcode = objectCodePart.substring(0,2);
            InstructionInfo instructionInfo = OpcodeInstructionMap.getInstructionInfo(opcode);

            if (instructionInfo != null) {
                // If the opcode is found in the map, print the instruction name
                String instructionName = instructionInfo.getInstructionName();
                String instructionformat = instructionInfo.getFormat();
                System.out.println("Start Address: " + startAddress + ", Opcode: " + opcode + ", Instruction Name: " + instructionName);
            } else {
                // Handle the case where the opcode is not found in the map
                System.out.println("Start Address: " + startAddress + ", Opcode: " + opcode + ", Instruction Name: Not Found");
            }


        }

        System.out.println(parts);
    }

    public static void Erecord(String Line) {

        String startAddress = Line.substring(1, 7); //16 represents the base of the number converting from hex to dec.
    }


}
