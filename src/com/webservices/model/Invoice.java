package com.webservices.model;

public class Invoice {
	private int idInvoice;
	private String nameClient;
	private int numberArticles;
	private double priceArticles;
	private double totalInvoice;
	
	public Invoice() {}
	
	public Invoice(int idInvoice, String nameClient, int numberArticles, double priceArticles, double totalInvoice)
	{
		this.idInvoice = idInvoice;
		this.nameClient = nameClient;
		this.numberArticles = numberArticles;
		this.priceArticles = priceArticles;
		this.totalInvoice = totalInvoice;
	}
	
	public int getIdInvoice()
	{
		return idInvoice;
	}
	
	public void setIdInvoice(int idInvoice)
	{
		this.idInvoice = idInvoice;
	}
	
	public String getNameClient()
	{
		return nameClient;
	}
	
	public void setNameClient(String nameClient)
	{
		this.nameClient = nameClient;
	}
	
	public double getTotalInvoice()
	{
		return totalInvoice;
	}
	
	public void setTotalInvoice(double totalInvoice)
	{
		this.totalInvoice = totalInvoice;
	}
	
	public int getNumberArticles()
	{
		return numberArticles;
	}
	
	public void setNumberArticles(int numberArticles)
	{
		this.numberArticles = numberArticles;
	}
	
	public double getPriceArticles()
	{
		return priceArticles;
	}
	
	public void setPriceArticles(double priceArticles)
	{
		this.priceArticles = priceArticles;
	}
	
	public double calculateTotal(int numberArticles, double priceArticles)
	{
		
		this.totalInvoice = numberArticles * priceArticles;
		
		return totalInvoice;
	}
	
	
}
