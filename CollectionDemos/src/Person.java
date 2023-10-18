
 public class Person implements Comparable<Person> {

      private String firstName;

      private String lastName;

      private String email;

      private Gender gender;

      private int age;

      public Person() {

      }
      
      

      public Person(String firstName, String lastName,

                        String email, Gender gender, int age) {

            this.firstName = firstName;

            this.lastName = lastName;

            this.email = email;

            this.gender = gender;

            this.age = age;

      }

    


      public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int compareTo(Person another) {

            return this.age - another.getAge();

      }

      public String toString() {

            return this.firstName + " " + this.lastName;

      }

}


