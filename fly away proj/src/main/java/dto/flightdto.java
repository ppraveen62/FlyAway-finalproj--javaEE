package dto;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class flightdto {
	@Id
	private int flightno;
	private String airline;
	private String source;
	private String destination;
	private String departuretime;
	private String arrivaltime;
	private double tripfare;
	
	
	public flightdto(int flightno, String airline, String source, String destination, String departuretime, String arrivaltime,
			double tripfare) {
		super();
		this.flightno = flightno;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.departuretime = departuretime;
		this.arrivaltime = arrivaltime;
		this.tripfare = tripfare;
	}


	public int getFlightno() {
		return flightno;
	}


	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDeparturetime() {
		return departuretime;
	}


	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	
	public String getArrivaltime() {
		return arrivaltime;
	}


	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}


	public double getTripfare() {
		return tripfare;
	}


	public void setTripfare(double tripfare) {
		this.tripfare = tripfare;
	}





	@Override
	public String toString() {
		return "flightdto [flightno=" + flightno + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + ", departuretime=" + departuretime + ", arrivaltime=" + arrivaltime + ", tripfare="
				+ tripfare + "]";
	}


	
	
	
	

	

	
	
	
	

}
