package keshav1310Onlinetest1;

public class EVM {

	CU c = new CU();
	BU b = new BU();
	
	public void getVottedCandidate(){
		//System.out.println("Selected Candidate is  "+b.getCandidate());
	}
	
	public void sendToCU(){
		
		c.forTotal(b.getCandidate());
	}
	//c.sendToCU(b.getCandidate());
	
}
