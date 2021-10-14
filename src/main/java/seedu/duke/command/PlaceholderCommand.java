package seedu.duke.command;

import seedu.duke.NusModList;
import seedu.duke.Ui;
import seedu.duke.UserList;

/**
 * Place holder for command only. Please implement a real class.
 */
public class PlaceholderCommand extends Command {

    public PlaceholderCommand(String userInstruction) {
        super(userInstruction);
    }

    @Override
    public void execute(UserList myModules, Ui ui, NusModList allModules) {
        System.out.println("Do " + userInstruction);
    }
}
