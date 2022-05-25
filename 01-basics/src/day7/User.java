package day7;

public class User {

	String role;
	String name;
	int age;
	String age_level ;
	
	{
		if(age < 18)
			age_level = "young";
		else if(age >= 18 && age <= 60)
			age_level = "valid";
	}
	
	
}
