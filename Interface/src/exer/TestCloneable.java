package exer;

public class TestCloneable {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Teacher t = new Teacher(1, "李老师");

		Object clone = t.clone();

		System.out.println(clone);
		System.out.println(t == clone);//false
		System.out.println(t.equals(clone));//true
	}
}
class Teacher implements Cloneable{
	private int id;
	private String name;
	public Teacher() {
		super();
	}
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}