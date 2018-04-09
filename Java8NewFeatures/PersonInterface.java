
public interface PersonInterface {
	
	// not including public keyword, public is assumed in interfaces
	void setName(String name);
	String getName();
	void setAge(int age);
	int getAge();
	
	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
	
	static String getPersonInfoStatic(Person p) {
		return p.getName() + " (" + p.getAge() + ")";
	}
}
