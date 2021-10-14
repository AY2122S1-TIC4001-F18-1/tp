package seedu.duke.command;

import seedu.duke.NusModList;

import java.util.stream.IntStream;

public class ListCommand extends Command {

    public ListCommand(String userInstruction) {
        super(userInstruction);
    }

    @Override
    public void execute() {
        // System.out.println("Do " + userInstruction);

        // Get Data
        NusModList modData = NusModList.sharedInstance();
        // Check user Instruction, to refactor
        if (userInstruction.equals("all")) {
            // Refactor into UI Class

            //List and Format Data - List 15 Modules tbc
            System.out.println("Here are the list of available Modules (Limit to 10) : ");
            for (int i = 0; i < 15; i++) {
                System.out.println(modData.getMod(i).getModuleCode() + " | "
                        + modData.getMod(i).getModuleTitle());
            }
            System.out.println("* Data was retrieved using NUS MODS API. *");
        } else {
            // TODO: Make Search non-case sensitive.
            IntStream.range(0, modData.getSize()).filter(index -> modData.getMod(index)
                            .getModuleCode().contains(userInstruction))
                                .forEach(index -> System.out.println(modData.getMod(index).getModuleCode() + " | "
                                        + modData.getMod(index).getModuleTitle()));
        }




    }
}