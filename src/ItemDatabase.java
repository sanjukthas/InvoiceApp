

import java.util.HashMap;
import java.util.Map;

import Invoice.LineItem;

public class ItemDatabase {
	
	private Map<String, LineItem> data;
	
	public void createItemDatabase() {
		Map<String, LineItem> data = new HashMap<String, LineItem>();
		data.put("J001", new LineItem("J001", "Java Book", 45.00,false));
		data.put("J002", new LineItem("J002", "Cobol Book", 50.00,false));
		data.put("J003", new LineItem("J003", "Mistery Book", 95.00,true));
		data.put("J004", new LineItem("J004", "Geography Book", 75.00,false));
		data.put("J005", new LineItem("J005", "C# Book", 25.00, true));
		this.data = data;
		
	}
	
	
	public LineItem getItem(String item) {
		return data.get(item);
		
	}


	public Map<String, LineItem> getData() {
		return data;
	}


	public void setData(Map<String, LineItem> data) {
		this.data = data;
	}
	

	
	

}