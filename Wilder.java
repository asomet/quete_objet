public class Wilder {


	// attibuts

     	private String Firstname;
	private boolean aware;
			


	// constructor
	public Wilder(String Firstname, boolean aware) {
	
	this.Firstname = Firstname;
	this.aware = aware;
	
	}


	
	// méthode

	public  String WhoAmI() {
	
	if(this.aware == true) {
	return "Je m'appelle " + this.getFirstname() + "et je suis aware";
	 }
	else {
	return "Je m'appelle " + this.getFirstname() + "et je ne suis pas aware"; 
	}

	
	}
	// accesseurs (getters)

	public String getFirstname() {
		return this.Firstname;

	}

	public boolean isAware() {
		return this.aware;

	}


	 // mutateurs (setters)

	public void setFirstname(String Firstname) {
	
		this.Firstname = Firstname;
	
	}

	public void setAware(boolean aware) {

		this.aware = aware;

	}

}


	









