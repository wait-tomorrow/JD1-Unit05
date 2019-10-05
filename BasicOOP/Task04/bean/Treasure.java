package by.htp.BasicOOP.Task04.bean;

public class Treasure {
    private String name;
    private double cost;

    public Treasure(String name, double cost) {
	this.cost = cost;
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getCost() {
	return cost;
    }

    public void setCost(double coast) {
	this.cost = coast;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Treasure other = (Treasure) obj;
	if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost)) {
	    return false;
	}
	if (name == null) {
	    if (other.name != null) {
		return false;
	    }
	} else if (!name.equals(other.name)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "Treasure [name=" + name + ", cost=" + cost + "]";
    }
}
