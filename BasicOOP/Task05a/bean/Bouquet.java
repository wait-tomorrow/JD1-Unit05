package by.htp.BasicOOP.Task05a.bean;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private String name;
    private List<Flower> flowers;
    private Cover cover;

    public Bouquet(String name) {
	this.name = name;
	this.flowers = new ArrayList<Flower>();
	this.cover = new Cover("", 0);
    }

    public Bouquet(List<Flower> flowers, Cover cover) {
	this.flowers = flowers;
	this.cover = cover;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<Flower> getFlowers() {
	return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
	this.flowers = flowers;
    }

    public Cover getCover() {
	return cover;
    }

    public void setCover(Cover cover) {
	this.cover = cover;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((cover == null) ? 0 : cover.hashCode());
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
	Bouquet other = (Bouquet) obj;
	if (flowers == null) {
	    if (other.flowers != null)
		return false;
	} else if (!flowers.equals(other.flowers))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (cover == null) {
	    if (other.cover != null)
		return false;
	} else if (!cover.equals(other.cover))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Bouquet [name=" + name + ", flowers=" + flowers + ", cover=" + cover + "]";
    }
}
