package by.htp.BasicOOP.Task04.bean;

import java.util.List;

public class Cave {
    private List<Treasure> treasures;

    public Cave(List<Treasure> treasures) {
	this.treasures = treasures;
    }

    public List<Treasure> getTreasures() {
	return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
	this.treasures = treasures;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return false;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Cave other = (Cave) obj;
	if (this.treasures == null) {
	    if (other.treasures != null) {
		return false;
	    }
	} else if (!this.treasures.equals(other.treasures)) {
	    return false;
	}
	return true;

    }

    @Override
    public String toString() {
	return "Cave [treasures=" + treasures + "]";
    }
}
