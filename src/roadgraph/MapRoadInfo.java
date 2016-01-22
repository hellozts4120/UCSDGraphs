package roadgraph;

import geography.GeographicPoint;

public class MapRoadInfo {

	private geography.GeographicPoint FromLocation;
	private geography.GeographicPoint ToLocation;
	private String Name;
	private String Type;
	private double Length;
	
	public MapRoadInfo(GeographicPoint FromLocation, GeographicPoint ToLocation, 
			String roadName, String roadType, double roadLength) {
		
		this.FromLocation = FromLocation;
		this.ToLocation = ToLocation;
		this.Name = roadName;
		this.Type = roadType;
		this.Length = roadLength;
		
	}
	
	public GeographicPoint getFromLocation(){
		return this.FromLocation;
	}

	public GeographicPoint getToLocation(){
		return this.ToLocation;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getType(){
		return this.Type;
	}
	
	public double getLength(){
		return this.Length;
	}
}
