package Calender;

public class Calender {
String color;
int month;

public Calender(String color,int month){
	this.color=color;
	this.month=month;
}
void info() {
	System.out.println(color+month);
}
void hang() {
	System.out.println(color+"달력은 벽에 걸수있습니다");
}
}
