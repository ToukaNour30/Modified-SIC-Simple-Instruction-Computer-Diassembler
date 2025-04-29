import java.util.HashMap;
import java.util.Map;
public class InstructionInfo {
    private final String instructionName;
    private final String format;

    public InstructionInfo(String instructionName, String format) {
        this.instructionName = instructionName;
        this.format = format;
    }

    public  String getInstructionName() {
        return instructionName;
    }

    public String getFormat() {
        return format;
    }
}
