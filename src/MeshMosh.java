import java.text.SimpleDateFormat;
import org.hashids;
import java.util.UUID;
import java.util.Random;

public class MeshMosh {
	public static String meshID(){
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Random rand = new Random();
		rand.nextInt(99);
		Hashids hashids = new Hashids("BlueMeshLibrary");
		String meshID = hashids.encode(UserID.returnUserUUID(), sdf, rand);
		return meshID;
	}
}
