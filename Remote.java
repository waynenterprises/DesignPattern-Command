package alex;

//
// This is the invoker
//
public class Remote {

	ICommand onCommand;
	ICommand offCommand;
	ICommand brightenCommand;
	ICommand darkenCommand;

	public Remote(ICommand on, ICommand off, ICommand brighten, ICommand darken) {
		onCommand = on;
		offCommand = off;
		brightenCommand = brighten;
		darkenCommand = darken;
	}

 
	public void onButtonWasPushed() {
		onCommand.execute();
	}
 
	public void offButtonWasPushed() {
		/*TODO Implement code here.*/
	}

	public void brightenButtonWasPushed() {
		/*TODO Implement code here.*/
	}

	public void darkenButtonWasPushed() {
		/*TODO Implement code here.*/
	}
}
