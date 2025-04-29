import java.util.HashMap;
import java.util.Map;


public class OpcodeInstructionMap {
    public  static Map<String, InstructionInfo> opcodeMap;
    public OpcodeInstructionMap() {
        opcodeMap = new HashMap<>();
        initializeOpcodeMap();
    }

    public static void initializeOpcodeMap() {
        opcodeMap.put("18", new InstructionInfo("ADD E", "3/4"));
        opcodeMap.put("40", new InstructionInfo("AND m", "3/4"));
        opcodeMap.put("28", new InstructionInfo("COMP", "3/4"));
        opcodeMap.put("24", new InstructionInfo("DIV", "3/4"));
        opcodeMap.put("3C", new InstructionInfo("Jm", "3/4"));
        opcodeMap.put("30", new InstructionInfo("JBQ m", "3/4"));
        opcodeMap.put("34", new InstructionInfo("JGT", "3/4"));
        opcodeMap.put("38", new InstructionInfo("JLT m", "3/4"));
        opcodeMap.put("48", new InstructionInfo("JSUB", "3/4"));
        opcodeMap.put("00", new InstructionInfo("LDA m", "3/4"));
        opcodeMap.put("50", new InstructionInfo("LDCH", "3/4"));
        opcodeMap.put("08", new InstructionInfo("LDL", "3/4"));
        opcodeMap.put("04", new InstructionInfo("LDX m", "3/4"));
        opcodeMap.put("20", new InstructionInfo("MUL m", "3/4"));
        opcodeMap.put("44", new InstructionInfo("OR", "3/4"));
        opcodeMap.put("D8", new InstructionInfo("RD m", "3/4"));
        opcodeMap.put("4C", new InstructionInfo("RSUB", "3/4"));
        opcodeMap.put("0C", new InstructionInfo("STA", "3/4"));
        opcodeMap.put("54", new InstructionInfo("STCH", "3/4"));
        opcodeMap.put("14", new InstructionInfo("STL m", "3/4"));
        opcodeMap.put("E8", new InstructionInfo("STSW", "3/4"));
        opcodeMap.put("10", new InstructionInfo("STX", "3/4"));
        opcodeMap.put("1C", new InstructionInfo("SUB", "3/4"));
        opcodeMap.put("B0", new InstructionInfo("TD m", "3/4"));
        opcodeMap.put("2C", new InstructionInfo("TIX", "3/4"));
        opcodeMap.put("DC", new InstructionInfo("WD m", "3/4"));
        opcodeMap.put("C5", new InstructionInfo("FIX", "1"));
        opcodeMap.put("C9", new InstructionInfo("FLOAT", "1"));
        opcodeMap.put("F5", new InstructionInfo("ΗΙΟ", "1"));
        opcodeMap.put("C1", new InstructionInfo("NORM", "1"));
        opcodeMap.put("F1", new InstructionInfo("SIO", "1"));
        opcodeMap.put("F9", new InstructionInfo("TIO", "1"));
    }

    public static InstructionInfo getInstructionInfo(String opcode) {
        return opcodeMap.get(opcode);
    }

    public void printAllInstructions() {
        for (Map.Entry<String, InstructionInfo> entry : opcodeMap.entrySet()) {
            String opcode = entry.getKey();
            InstructionInfo info = entry.getValue();
           // System.out.println("Opcode: " + opcode + ", Instruction Name: " +
                  //  info.getInstructionName() + ", Format: " + info.getFormat());
        }
    }}

