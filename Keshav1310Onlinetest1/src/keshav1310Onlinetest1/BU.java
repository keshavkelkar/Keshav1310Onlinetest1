package keshav1310Onlinetest1;

import java.util.ArrayList;


public class BU {

	public int selectedCandidate=0;

	ArrayList <Candidate> can = new ArrayList<Candidate>();
	ArrayList <BlueButton> blueBut = new ArrayList<BlueButton>();
	
	BU(){}
	
	BU(Integer totalCandidates){
		
		for(Integer i=0;i<totalCandidates;i++ ){
			Candidate c1=new Candidate(i);
			can.add(c1);
		}
		
		for(Integer i=0;i<totalCandidates;i++ ){
			BlueButton blueBut1=new BlueButton(i);
			blueBut.add(blueBut1);
		}
		
	}
	
	public void castVote(Integer vote){
		
		for(Integer i=0;i<blueBut.size();i++){
			if(blueBut.get(i).blueBId==vote){//when respective PannelButton is pressed then Elevator will be called on that Floor
				
				//Call to elevator by pressing pannel Button
				selectedCandidate=selectCandidate(blueBut.get(i).blueBId);
				
				System.out.println("IN SELECTCANDIDATE  Selected Candidate is  "+selectedCandidate);
				//break;
			}
		}
		
		
	}

	public  Integer selectCandidate(Integer blueBId) {
		// TODO Auto-generated method stub
		for(Integer i=0;i<can.size();i++){
			if(can.get(i).canId==blueBId){//when respective PannelButton is pressed then Elevator will be called on that Floor
				Integer votedCandidate = can.get(i).canId;

				//Call to elevator by pressing pannel Button
			}
		}

		return blueBId;

		
	}
	
	 public  Integer getCandidate(){
			//System.out.println("IN return  Selected Candidate is  "+selectedCandidate);

		return selectedCandidate;

	}
	

}
