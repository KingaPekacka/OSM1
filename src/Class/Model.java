package Class;

import java.util.ArrayList;

public class Model 
{
	private static Model instance = null; /* Signleton kurwa! */
	ArrayList<Patient> patients = new ArrayList<Patient>();
	

	private Model() {
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}
	
	public void addPatient(Patient patient)
	{
		patients.add(patient);
	}
	
	public ArrayList<Patient> getAllPatients()
	{
		return patients;
	}
	
	public String[][] getAllPatientsAsArray()
	{
		String patients[][] = {{"Ola", "Brogowska"}};
		
		return patients;
	}
}
