package alex;

public class LightOnCommand implements ICommand {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	//HINT: This function is required by the interface
	public void execute() {
		light.on();
	}
}
