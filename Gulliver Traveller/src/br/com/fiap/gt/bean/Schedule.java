package br.com.fiap.gt.bean;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@NamedQuery(name = "Schedule.FindByRentalCompany", query = "SELECT new br.com.fiap.gt.bean.Schedule(s.day, s.openingHour, s.closingHour) "
		+ "FROM Schedule s WHERE s.rentalCompany = :rc")

@Entity
@Table(name = "T_GT_SCHEDULE")
@SequenceGenerator(name = "schedule", sequenceName = "SQ_T_GT_SCHEDULE", allocationSize = 1)
public class Schedule {

	@Id
	@Column(name = "id_schedule")
	@GeneratedValue(generator = "schedule", strategy = GenerationType.SEQUENCE)
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_rental_comp", nullable = false)
	private RentalCompany rentalCompany;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_day", nullable = false, length = 60)
	private Day day;

	@Column(name = "hr_opening")
	private LocalTime openingHour;

	@Column(name = "hr_closing")
	private LocalTime closingHour;

	public Schedule() {
	}

	public Schedule(RentalCompany rentalCompany, Day day, LocalTime openingHour, LocalTime closingHour) {
		super();
		this.rentalCompany = rentalCompany;
		this.day = day;
		this.openingHour = openingHour;
		this.closingHour = closingHour;
	}

	public Schedule(int id, RentalCompany rentalCompany, Day day, LocalTime openingHour, LocalTime closingHour) {
		super();
		this.id = id;
		this.rentalCompany = rentalCompany;
		this.day = day;
		this.openingHour = openingHour;
		this.closingHour = closingHour;
	}

	
	public Schedule(Day day, LocalTime openingHour, LocalTime closingHour) {
		super();
		this.day = day;
		this.openingHour = openingHour;
		this.closingHour = closingHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RentalCompany getRentalCompany() {
		return rentalCompany;
	}

	public void setRentalCompany(RentalCompany rentalCompany) {
		this.rentalCompany = rentalCompany;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public LocalTime getOpeningHour() {
		return openingHour;
	}

	public void setOpeningHour(LocalTime openingHour) {
		this.openingHour = openingHour;
	}

	public LocalTime getClosingHour() {
		return closingHour;
	}

	public void setClosingHour(LocalTime closingHour) {
		this.closingHour = closingHour;
	}

	@Override
	public String toString() {
		return "Schedule [Day=" + day + ", Opening Hour=" + openingHour.format(DateTimeFormatter.ISO_TIME) + ", Closing Hour=" + closingHour.format(DateTimeFormatter.ISO_TIME) + "]";
	}
}
