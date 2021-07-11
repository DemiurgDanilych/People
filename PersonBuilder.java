public class PersonBuilder {
	
	protected String name;
	protected String surname;
	protected int age;
	protected String address;
	
	
	public PersonBuilder setName(String name) {
		try {
			this.name = name;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public PersonBuilder setSurname(String surname) {
		try {
			this.surname = surname;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public PersonBuilder setAge(int age) {
		try {
			this.age = age;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Person build() throws IllegalStateException {
		
		if (name.equals(null) || surname.equals(null)) {
			throw new IllegalStateException("Не введено имя или фамилия!");
		}
		if (age < 0) {
			throw new IllegalArgumentException("Ввведен некорректный возраст!");
		}
		
		return new Person(this);
	}
}