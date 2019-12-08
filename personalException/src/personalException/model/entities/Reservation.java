package personalException.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import personalException.model.exception.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	// sdf é estático para que não haja outro objeto do tipo SimpleDateFormat pra cada objeto Reservation
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if( !checkOut.after(checkIn) ) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Long duration() {
		Long diff = checkOut.getTime() - checkIn.getTime();	// pega a diferença entre os tempos em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
 		
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		
		if( checkIn.before(now) || checkOut.before(now) ) {
			throw new DomainException("Reservation dates for update must be future dates.");
		}
		if( !checkOut.after(checkIn) ) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return this.checkIn;
	}

	public Date getCheckOut() {
		return this.checkOut;
	}
	
	@Override public String toString() {
		return "Room "
				+ this.getRoomNumber()
				+ ", Check-in: "
				+ sdf.format(checkIn)
				+ ", Check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ this.duration()
				+ " nights.";
	}
	
}
