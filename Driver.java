
public class Driver {
	String driver1Name;
	String driver2Name;
	int driver1Age;
	int driver2Age;
	boolean Nameresult; 
	boolean Ageresult;
	boolean NameandAgeresult;
	String WhoIsOlder;
	String WhoIsYounger;

public String getdriver1Name(String driver1Name){
	return this.driver1Name;
}

public int getdriver1Age(int driver1Age){
	return this.driver1Age;
}

public String getdriver2Name(String driver2Name){
	return this.driver2Name;
}

public int getdriver2Age(int driver2Age){
	return this.driver2Age;
}

public boolean CompareName(String driver1Name, String driver2Name){
	
	return this.Nameresult=driver1Name.equalsIgnoreCase(driver2Name);
	
}


public boolean CompareAge(int driver1Age, int driver2Age){
	if(driver1Age==driver2Age){
		return this.Ageresult=true;
	}
	else{
		return this.Ageresult=false;
	}
}

public boolean CompareNameandAge(String driver1Name, String driver2Name, int driver1Age, int driver2Age){
	if(driver1Age==driver2Age && driver1Name.equalsIgnoreCase(driver2Name)){
		return this.NameandAgeresult=true;
	}
	else{
		return this.NameandAgeresult=false;
	}
}

public String WhoIsOlder(int driver1Age, int driver2Age){
	String result="";
	if(driver1Age>driver2Age){
		result="driver 1 is older";
		}
	else if(driver1Age<driver2Age){
		result="driver 2 is older";	
	}
	else{
		result="Both drivers are of same age";
	}
	return this.WhoIsOlder=result;
}
public String WhoIsYounger(int driver1Age, int driver2Age){
	String result="";
	if(driver1Age>driver2Age){
		result="driver 2 is Younger";
		}
	else if(driver1Age<driver2Age){
		result="driver 1 is Younger";	
	}
	else{
		result="Both drivers are of same age";
	}
	return this.WhoIsYounger=result;
}
}
