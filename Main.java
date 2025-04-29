import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;

public class Main {


    public static void main(String[] args) {
        LocationCounter l = new LocationCounter(HTEHandling.startingAddress);
         String lines;
        List<AssemblyInstruction> Assemblycode= new ArrayList<>();
        //Assemblycode.add(LocationCounter.locationCounters,HTEHandling.instructionName,HTEHandling.objectCodePart);
//        AssemblyInstruction e = new AssemblyInstruction(LocationCounter.getLocationCount(),HTEHandling.instructionName,HTEHandling.objectCodePart);
//        Assemblycode.add(AssemblyInstruction e);
//        AssemblyInstruction a = new AssemblyInstruction(LocationCounter.getLocationCount(), HTEHandling.instructionName, HTEHandling.objectCodePart);
//        Assemblycode.add(a);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Diassembley2/diassemble 1.txt"));
            String test;
            while ((test = reader.readLine()) != null)
            {

                HTEHandling.HandlingAll(test);
            }
            reader.close();

        }
        catch(IOException e)
        {
            throw new RuntimeException(e);

        }
        try {
          //  BufferedWriter write = new BufferedWriter(new FileWriter("C:/Diassembley2/Assembly_code.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("C:/Diassembley2/diassemble 1.txt"));
            // write.write("location counter /t instructions /t object code /n");
//            write.write(HTEHandling.startingAddress +"/t"+ "start" +"/n" );
//            write.write(HTEHandling.startingAddress+ "/t"  + );
//            for (AssemblyInstruction assemblyInstruction : Assemblycode) {
//                write.write(assemblyInstruction.getLocationCounter() + "\t" +
//                        assemblyInstruction.getInstructionName() + "\t" +
//                        assemblyInstruction.getObjectCode() + "\n");
            int lineCount=0;
            while ((lines = reader.readLine()) != null) {
                // Increment the line count for each line read
                lineCount++;
            }
            while ((lineCount != 0) && (lines = reader.readLine()) != null) {
                String[] parts = lines.split("\\.");
                String locationCounter = parts[0];
                String instructionName = parts[1];
                String objectCode = parts[2];

                AssemblyInstruction a = new AssemblyInstruction();
                Assemblycode.add(a);
                lineCount--;
        }

            }
            catch(IOException e){
                throw new RuntimeException(e);
        }
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("Assembly_code.txt"));
            write.write("location counter\tinstructions\tobject code\n");
//            List<AssemblyInstruction> Assemblycode = new ArrayList<>();
            for (AssemblyInstruction instruction : Assemblycode) {
               // System.out.println("jhdfakjvjkdvf" + instruction.getLocationCounter() + "\t" +
                        instruction.getMnemonic() + "\t" +
                        instruction.getObjectCode() + "\n");
                write.write(instruction.getLocationCounter() + "\t" +
                        instruction.getMnemonic() + "\t" +
                        instruction.getObjectCode() + "\n");
            }
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter write1 = new BufferedWriter(new FileWriter("SymbolTable.txt"));
            write1.write("labels \t \t location counter");

            for (int i = 0; i < instructionSet.Sympol_table_labels.size(); i++) {
                write1.write(instructionSet.Sympol_table_labels.get(i) + "\t" + instructionSet.sympol_table_address.get(i) + "\n");
                //System.out.println("kjefvhdbjfg" + (instructionSet.Sympol_table_labels.get(i) + "\t" + instructionSet.sympol_table_address.get(i) + "\n"));
                write1.write(String.valueOf(instructionSet.Sympol_table_labels) + instructionSet.sympol_table_address);

            }
            write1.close();
    }
        catch (IOException e) {
            throw new RuntimeException(e);}

    }
}


