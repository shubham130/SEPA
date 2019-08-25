class Date {
	int date, month, year;

	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public void printDate() {
		print(date + "-" + month + "-" + year);
	}
	public void calculateAge(Date date) {
		print(date.year - this.year + " years " + (date.month % this.month) + " months " + (date.day % this.day));
	}
	
}
