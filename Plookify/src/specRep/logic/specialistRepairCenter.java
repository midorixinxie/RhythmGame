/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specRep.logic;

/**
 *
 * @author pro
 */
public class specialistRepairCenter {
        //intance fields
	private String name;
	private String address;
	private int phone;
	private String emailAddress;
	private String expectedDeliveryDate;
        private int vehicleNo;
	private int costsOfSPC;
	private String expectedReturnDate;
        

	public specialistRepairCenter(String e) {
            this.name=name;
            this.address=address;
            this.phone=phone;
            this.emailAddress=e;
            this.vehicleNo=vehicleNo;
            
            
		
	}
        
        public String getName(){return name;}
        
        public String getAddress(){return address;}
        
        public int getPhone(){return phone;}
        
        public String getemailAddress(){return emailAddress;}

	public int getVehicleNo() {
		//get vehicle details
                return vehicleNo;
		
	}

	public String recordExpectedDeliveryDate() {
		// get expected date
                return expectedDeliveryDate;
		
	}
        
        public String recordExpectedReturnDate() {
		// get expected date
                return expectedReturnDate;
		
	}
        
        public void setExpectedDeliveryDate(String deli){}
        
        public void setExpectedReturnDate(String retu){}

	public void createSummaryList() {
		//set outstanding lists
		
	}

	//public void recordIndividualCosts() {
		// get individual cost of vehicle or part for each customer
		//throw new UnsupportedOperationException();
	//}

	public double getCostOfSPCrepairs() {
		//get total cost of special repair
		return costsOfSPC;
	}

	//public double getCostOfRegularRepairAndDiagonostics() {
		//get the cost of regular and diagonostics
	       return cost
	}

	//public double getTotalCost() {
		// calculate the total bill(regular and special)
		return costsOf
	}


}