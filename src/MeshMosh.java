import java.text.SimpleDateFormat;
//import org.hashids;
import java.util.UUID;
import java.util.Random;

public class MeshMosh {
	public static String meshID(){
		String meshID = null;
		/* Gets the current time as an int */
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		/* Generates random # */
		Random rand = new Random();
		rand.nextInt(99);
		
		return meshID;
	}
}
