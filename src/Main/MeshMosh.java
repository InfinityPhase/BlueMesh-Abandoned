package Main;
import java.text.SimpleDateFormat;
import com.hashids();
import java.util.UUID;
import java.util.Random;

public class MeshMosh {
	public static String meshID(){
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Random rand = new Random();
		int random = rand.nextInt(99);
		Hashids hashids = new Hashids("BlueMeshLibrary", 4, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String meshID = hashids.encode(UserID.returnUserUUID(), sdf, random);
		return meshID;
	}
}
