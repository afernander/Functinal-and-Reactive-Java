package Section9.CommandDesingPattern;

class ACAutomationRemote {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}
