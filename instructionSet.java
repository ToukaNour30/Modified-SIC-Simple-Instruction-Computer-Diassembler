import java.util.ArrayList;
public class instructionSet {
    private ArrayList<String[]> instructionList;
    public static String address;
    public static ArrayList<String> sympol_table_address = new ArrayList<>();
    public static ArrayList<String> Sympol_table_labels=new ArrayList<>();
    public static ArrayList<String>Object_Code=new ArrayList<>();

    public instructionSet() {
        this.instructionList = new ArrayList<>();
        initializeInstructions();
    }
    private void initializeInstructions() {
        // Populate the ArrayList with instructions from the table
        instructionList.add(new String[]{"ADD", "3/4", "18"});
        instructionList.add(new String[]{"AND", "3/4", "40"});
        instructionList.add(new String[]{"COMP", "3/4", "28"});
        instructionList.add(new String[]{"DIV", "3/4", "24"});
        instructionList.add(new String[]{"Jm", "3/4", "3C"});
        instructionList.add(new String[]{"JBQ", "3/4", "30"});
        instructionList.add(new String[]{"JGT", "3/4", "34"});
        instructionList.add(new String[]{"JLT", "3/4", "38"});
        instructionList.add(new String[]{"JSUB", "3/4", "48"});
        instructionList.add(new String[]{"LDA", "3/4", "00"});
        instructionList.add(new String[]{"LDCH", "3/4", "50"});
        instructionList.add(new String[]{"LDL", "3/4", "08"});
        instructionList.add(new String[]{"LDX", "3/4", "04"});
        instructionList.add(new String[]{"MUL", "3/4", "20"});
        instructionList.add(new String[]{"OR", "3/4", "44"});
        instructionList.add(new String[]{"RD", "3/4", "D8"});
        instructionList.add(new String[]{"RSUB", "3/4", "4C"});
        instructionList.add(new String[]{"STA", "3/4", "0C"});
        instructionList.add(new String[]{"STCH", "3/4", "54"});
        instructionList.add(new String[]{"STL", "3/4", "14"});
        instructionList.add(new String[]{"STSW", "3/4", "E8"});
        instructionList.add(new String[]{"STX", "3/4", "10"});
        instructionList.add(new String[]{"SUB", "3/4", "1C"});
        instructionList.add(new String[]{"TD", "3/4", "B0"});
        instructionList.add(new String[]{"TIX", "3/4", "2C"});
        instructionList.add(new String[]{"WD", "3/4", "DC"});
        instructionList.add(new String[]{"FIX", "1", "C4"});
        instructionList.add(new String[]{"FLOAT", "1", "C0"});
        instructionList.add(new String[]{"HIO", "1", "F4"});
        instructionList.add(new String[]{"NORM", "1", "E0"});
        instructionList.add(new String[]{"SIO", "1", "F0"});
        instructionList.add(new String[]{"TIO", "1", "F8"});
    }

    public ArrayList<String[]> getInstructionList() {
        return instructionList;
    }
    public static ArrayList<String> IncrementSymbolTable(ArrayList<String>Sympol_table_labels)
    {
        for (int i=0;i<LocationCounter.locationCounters.size();i++){
            Sympol_table_labels.add( "REF"+ i);
        }
        return (Sympol_table_labels);
    }

    public static void Format1(String opCode)
    {
        instructionSet.hexToBinary(opCode);
    }
    public static void Format3(String object_code)
    {
        String object_code_binary = instructionSet.hexToBinary(object_code);
      //  String opcode = object_code.substring(0, 2);
        String immediateF = object_code.substring(1, 2);
        String index = object_code.substring(2, 3);
        if (Integer.parseInt(immediateF) == 0) {
            address = object_code.substring(2, 5);
            sympol_table_address.add(address);
            Object_Code.add(object_code);
            if (!Object_Code.isEmpty()) {
                // Iterate over the elements in the ArrayList
                for (int i = 1; i < Object_Code.size(); i++) {
                    // Get the element at the current index
                    String currentAddress = Object_Code.get(i);
                }
            } else if (Integer.parseInt(immediateF) == 1) {
                String value = object_code.substring(2, 5);
            }
            if (Integer.parseInt(index) == 8)// 3rd bit lw equal 8 f 7nkhly lpcation counter = el address w el first bit bta3t el addres minus 8
            {
                int Address = Integer.parseInt(address) - 8000;
                LocationCounter.setLocationCount(String.valueOf(Address));
            } else if (Integer.parseInt(index) == 9) {
                int Address = Integer.parseInt(address) - 8000;
                LocationCounter.setLocationCount(String.valueOf(Address));

            }
        }
    }
        public static String hexToBinary (String hex)
        {
            // Convert hexadecimal to decimal
            int decimal = Integer.parseInt(hex, 16);

            // Convert decimal to binary
            String binary = Integer.toBinaryString(decimal);

            return binary;
        }
    }

