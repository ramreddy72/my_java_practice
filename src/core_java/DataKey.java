package core_java;

public class DataKey {
    private String name;
	private int id;

        // getter and setter methods

	@Override
	public String toString() {
		return "DataKey [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// @Override
	// public int hashCode() {
	// 	final int prime = 31;
	// 	int result = 1;
	// 	result = prime * result + ((name == null) ? 0 : name.hashCode());
	// 	result = prime * result + id;
	// 	return result;
	// }

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	if (getClass() != obj.getClass())
	// 		return false;
	// 	DataKey other = (DataKey) obj;
	// 	if (name == null) {
	// 		if (other.name != null)
	// 			return false;
	// 	} else if (!name.equals(other.name))
	// 		return false;
	// 	if (id != other.id)
	// 		return false;
	// 	return true;
	// }

	
	
}
