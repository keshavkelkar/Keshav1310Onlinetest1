package keshav1310Onlinetest1;

public class Candidate {

	
	String name;
	Integer canId;
	
	Candidate(Integer canId){
		this.canId=canId;
	}
	
	public Integer getFloorNumber(){
		return canId;
	}
	
}
