package git;

import java.util.ArrayList;

public class ParkingSystem implements IParking,IParams{
	
public static void main(String[] args) throws Exception {
	    ParkingSystem params = IParking.parse("1,2,3,1");//ParkingSystem.parse();
        ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
        ps.s2=params.ss;
        ArrayList<Integer> plan = params.getPlanParking();
        for (int i = 0; i < plan.size(); i++) {
            ps.addCar(plan.get(i));
        }
        ps.print();
    }

int a;
int b;
int c;
String[] s ;
String ss;
String s2;
@Override
public void print() {
	System.out.println("车位:"+"["+this.getBig()+","+this.getMedium()+","+this.getSmall()+"]");
	String s1[]=this.s2.split(",");
	String s3="[";
	for(int i=0;i<s1.length;i++) {
		if(i<s1.length-1) {
		s3=s3+s1[i]+"],[";
		}else
			s3=s3+s1[i]+"]";
	}
	System.out.println("输入[:"+s3+"]");
	System.out.println("输出:["+ss+"]");
	
}

@Override
public boolean addCar(int carType) {
	if(carType==1&&this.a!=0) {
		this.a--;
	this.ss=this.ss+",true";
		return true;
	}
	if(carType==2&&this.b!=0) {
		this.b--;
		this.ss=this.ss+",true";
		return true;
	}
	if(carType==3&&this.c!=0) {
		this.c--;
		this.ss=this.ss+",true";
		return true;
	}
	this.ss=this.ss+",false";
	return false;
}
ParkingSystem(int Big,int Medium,int Small){
	this.a=Big;
	this.b=Medium;
	this.c=Small;
}
ParkingSystem(){
	
}

@Override
public int getBig() {
	return 1;
}

@Override
public int getMedium() {
	return 1;
}

@Override
public int getSmall() {
	return 0;
}

@Override
public ArrayList<Integer> getPlanParking() {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(Integer.valueOf(this.s[0]));
	a.add(Integer.valueOf(this.s[1]));
	a.add(Integer.valueOf(this.s[2]));
	a.add(Integer.valueOf(this.s[3]));
	return a;
}
}
