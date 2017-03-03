import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.*;
import java.text.SimpleDateFormat;

public class Message {
	SimpleDateFormat time = new SimpleDateFormat("yyyy MM dd HH:mm aaa");
	MessageDigest 256Hash = MessageDigest.getInstance("SHA-256");
		// Will output time like: "2017 03 03 01:18.AM"
	
	public static string writeMessage(String messageIn, String meshID) throws IOException {
		Map mappedMessage = new LinkedHashMap();
		mappedMessage.put("UserID", UserId.getUserUUID());
		mappedMessage.put("MeshID", meshID);
		mappedMessage.put("Timestamp", time.toString());
		mappedMessage.put("Hash", hashMessage());
		mappedMessage.put("Message", messageIn);
		return String JSONMessage = JSONValue.toJSONString(mappedMessage);
	}
	
	public static string hashMessage(String messageIn) {
		256Hash.update(messageIn.getBytes("UTF-8"));
		byte[] messageHash = messageIn.digest();
		return messageHash;
	}
}
