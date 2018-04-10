package sun.utils;

import java.util.List;

import sun.pojo.Line;

public final class DataUtils {

	private DataUtils() {}
	
	public static final String pojoToJson(Line line) {
		
		String lineID = line.getLineID();
		String lineName =line.getLineName();
		String days = line.getDays();
		String price = line.getPrice();
		String vehicle = line.getVehicle();
		String hotel = line.getHotel();
		String hasMeal = line.getHasMeal();
		
		StringBuilder json = new StringBuilder();
		json.append("{\"lineID\":\"").append(lineID).append("\",");
		json.append("\"lineName\":\"").append(lineName).append("\",");
		json.append("\"days\":\"").append(days).append("\",");
		json.append("\"price\":\"").append(price).append("\",");
		json.append("\"vehicle\":\"").append(vehicle).append("\",");
		json.append("\"hotel\":\"").append(hotel).append("\",");
		json.append("\"hasMeal\":\"").append(hasMeal).append("\"}");
		
		return json.toString();
	}

	public static final String listToJson(List<Line> list) {
		
		StringBuilder json = new StringBuilder();
		
		for(Line line : list) {
			if(json.length() != 0) {
				json.append(",");
			}
			
			String str = pojoToJson(line);
			json.append(str);
		}
		
		return "[" + json + "]";
	}
}