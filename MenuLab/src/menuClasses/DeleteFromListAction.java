package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) args; 
		String name = io.getInput("Enter the name of the list to remove a value: ");
		int value = Integer.parseInt(io.getInput("Enter the value to add: ")); 
		dm.removeElementFromList(name, value); 
	}

}
