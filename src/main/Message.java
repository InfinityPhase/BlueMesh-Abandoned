package Main;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.*;
import java.text.SimpleDateFormat;

public class Message {
	SimpleDateFormat time = new SimpleDateFormat("yyyy MM dd HH:mm aaa");
		// Will output time like: "2017 03 03 01:18.AM"
	
	public static string writeMessage(String messageIn, String meshID) {
		Map mappedMessage = new LinkedHashMap();
		mappedMessage.put("UserID", UserId.getUserUUID());
		mappedMessage.put("MeshID", meshID);
		mappedMessage.put("Timestamp", time.toString());
		mappedMessage.put("Message", messageIn);
		return String JSONMessage = JSONValue.toJSONString(mappedMessage);
	}
}
