package spring;

public class Company {
 int id;
 String name;
 int noemp;
 String turnover;
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
public int getNoemp() {
	return noemp;
}
public void setNoemp(int noemp) {
	this.noemp = noemp;
}
public String getTurnover() {
	return turnover;
}
public void setTurnover(String turnover) {
	this.turnover = turnover;
}
 public void showCompany()
 {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(noemp);
	 System.out.println(turnover);
 }
}
