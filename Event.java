// Name : Arun Prakash Themothy Prabu Vincent
//NetId : AXT161330

package proj2;

public class Event {
	
	int type; /* Type of Event 1-Arrival of packet for queue 1 
		                       2-Arrival of packet for queue 2
		                       3-Arrival of packet for queue 3
		                           0-Departure */
     double timeStamp; // Timestamp of Event
		
	 public Event(double time, int t){	
			timeStamp = time; // Initialization
			type = t;
		}


}
