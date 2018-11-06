package com.finsoft.core;

public class Studentt {
	public int id;
	public String name;
	public Studentt(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
@Override
public String toString() {
	return "Studentt [id=" + id + ", name=" + name + "]";
}
}


