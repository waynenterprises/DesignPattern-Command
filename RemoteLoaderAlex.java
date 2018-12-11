package alex;

public class RemoteLoaderAlex {

	public static void main(String[] args) {

		//first we have the light
		Light livingRoomLight = new Light(10);

		//next we have the commands this light can do:
		/*TODO Instanciate the concrete commands here*/

		//finally we have the remote
		//we need to pass the concrete commands made made to it
		Remote remoteControl = new Remote(livingRoomLightOn,
				livingRoomLightOff,
				livingRoomLightBrighten,
				livingRoomLightDarken);

		System.out.println("Remote was instanciated with an initial brightness of 10");

		//test the code
		remoteControl.onButtonWasPushed();
		remoteControl.offButtonWasPushed();
		remoteControl.offButtonWasPushed();
		remoteControl.darkenButtonWasPushed();
		remoteControl.darkenButtonWasPushed();
		remoteControl.darkenButtonWasPushed();
		remoteControl.onButtonWasPushed();
		remoteControl.offButtonWasPushed();
		remoteControl.brightenButtonWasPushed();

		//Expected Output:
		//on 10
		//off 10
		//off 10
		//off 9
		//off 8
		//off 7
		//on 7
		//off 7
		//off 8
		//on 8
	}
}
