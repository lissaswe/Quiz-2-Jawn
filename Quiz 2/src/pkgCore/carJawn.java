package pkgCore;
public class carJawn {
private double priceOfCar;
private double downPayment;
private int lengthLoan;
private double interestRateofLoan;

public carJawn(double pOC, double dPayment, int lOfPayment, double iRate)

{
	this.priceOfCar = pOC;
	this.downPayment = dPayment;
	this.lengthLoan = lOfPayment;
	this.interestRateofLoan = iRate;
}

public double findMonthlyPay()

{
	double intmonth = (this.interestRateofLoan)/12;
	double numerator = intmonth * (priceOfCar - downPayment);
	double bottom = (1- Math.pow((1 + intmonth), -lengthLoan));
	return numerator/bottom;
	
}

public double findTotalInterest()
{
	return (this.findMonthlyPay() - ((priceOfCar - downPayment) / lengthLoan)) * lengthLoan;
}

public double findPriceofCar() {
	return priceOfCar;
	
}

public void setTotalP(double priceOfCar) {
	this.priceOfCar = priceOfCar;
}

public double finddPayment() {
	return downPayment;
}

public void setdPayment(double downPayment) {
	this.downPayment = downPayment;
	
}
public int getLoanLength() {
	return lengthLoan;
}

public void setLoanLength(int loanLength) {
	this.lengthLoan = loanLength;
}
public double getIntRate() {
	return interestRateofLoan;
	
}
public void setIntRate(double interestRateofLoan) {
	this.interestRateofLoan = interestRateofLoan;
}
}

