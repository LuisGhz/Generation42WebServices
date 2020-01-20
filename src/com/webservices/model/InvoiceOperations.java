package com.webservices.model;

public class InvoiceOperations {
	
	public double CalculateInvoiceTotal(Invoice myInvoice)
	{
		myInvoice.setTotalInvoice(myInvoice.getNumberArticles() * myInvoice.getPriceArticles());
		
		return myInvoice.getTotalInvoice();
	}
}
