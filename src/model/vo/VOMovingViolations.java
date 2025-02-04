package model.vo;

import java.util.Date;


import java.util.Iterator;


/**
 * Representation of a Trip object
 */
public class VOMovingViolations implements Iterable<VOMovingViolations>, Comparable<VOMovingViolations> 
{

	private int objectId , streetSegId , addressId  ;
	private String location, violationDes, violationCode;
	private String ticketIssue;
	private double fineamt, totalPaid;
	private boolean accidentIndicator;
	
	public VOMovingViolations( int pObjectId, String pLocation, int pAddressId, int pStreetId, double pFine, double pTotal, double pPenalty1, boolean pAccidentIndicator, String pTicketIssue, String pViolationCode, String pViolationDesc)
	{
		objectId = pObjectId;
		location = pLocation;
		
		addressId = pAddressId;
		streetSegId = pStreetId;
		
		fineamt = pFine;
		totalPaid = pTotal;
		
		accidentIndicator = pAccidentIndicator;
		ticketIssue = pTicketIssue;
		
		violationCode = pViolationCode;		
		violationDes = pViolationDesc;
		
	}
	
	/**
	 * @return id - Identificador Ãºnico de la infracciÃ³n
	 */
	public int objectId() {
		return objectId;
	} 
	/**
	 * @return location - DirecciÃ³n en formato de texto.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return date - Fecha cuando se puso la infracciÃ³n .
	 */
	public String getTicketIssueDate() {
		return ticketIssue;
	}
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagÃ³ el que recibiÃ³ la infracciÃ³n en USD.
	 */
	public double getTotalPaid() {
	
		return totalPaid;
	}
	public double getFine()
	{
		return fineamt;
	}
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public boolean  getAccidentIndicator() {
		// 
		return accidentIndicator;
	}
	/**
	 * @return description - Descripci�n textual de la infracci�n.
	 */
	public String  getViolationDescription() 
	{
		// 
		return violationDes;
	}
	
	public String getViolationCode()
	{
		return violationCode;
	}
	
	public int getStreetSegId() 
	{
		return streetSegId;
	}
	
	public int getAddressId() 
	{
		return addressId;
	}


	/*
	public double getPenalty1()
	{
		return penalty1;
	}
	
	public String getPenalty2() {
		return penalty2;
	}*/
	
	@Override
	public int compareTo(VOMovingViolations o) {
		// 
		if (o.objectId() == this.objectId() )
		{
			return 0;
		}
		else if (o.objectId() < this.objectId()) 
		{
			return 1;
		}
		else
			return -1;
	}


	@Override
	public Iterator<VOMovingViolations> iterator() {
		
		return (Iterator) this;
	}
	public String toString()
	{
		/**
		 * OBJECTID,	LOCATION,	TICKETISSUEDATE,	VIOLATIONCODE	y	FINEAMT
		 */
		return "{id: "+objectId+", location: "+location+" , ticketIssue:"+ticketIssue+" ,ViolationCode:"+violationCode+" , finemat:"+fineamt+ "}"  ;
	}
}
