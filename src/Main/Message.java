import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import org.json.simple.*;

public class Message {
	public static String writeMessage(String messageIn, String meshID) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		SimpleDateFormat time = new SimpleDateFormat("yyyy MM dd HH:mm aaa");
			// Will output time like: "2017 03 03 01:18.AM"

		Map mappedMessage = new LinkedHashMap();
		mappedMessage.put("UserID", UserID.getUserUUID());
		mappedMessage.put("MeshID", meshID);
		mappedMessage.put("Timestamp", time.toString());
		mappedMessage.put("Hash", hashMessage(messageIn));
		mappedMessage.put("Message", messageIn);
		
		String JSONMessage = JSONValue.toJSONString(mappedMessage);
		return JSONMessage;
	}
	
	public static String hashMessage(String messageIn) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String messageHash = null;
		MessageDigest hash = MessageDigest.getInstance("SHA-256");
		hash.update(messageIn.getBytes("UTF-8"));
		byte[] messageHashByte = hash.digest();
		try {
			messageHash = new String(messageHashByte, "UTF-8"); 
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return messageHash;
	}
}
