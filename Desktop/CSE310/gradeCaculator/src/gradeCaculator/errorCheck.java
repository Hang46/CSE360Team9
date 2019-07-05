package gradeCaculator;

public class errorCheck {
public boolean gradeRange(int grade) {
	if (grade<0 || grade>100 ) {
		System.out.println("Input is out of range");
		return false;
	}
	else
		return true;
}
public boolean DataType() {
	
}
public boolean inputFormat() {
	
}
public boolean fileCheck( int f) {
	if (f==null ) {
		System.out.println("no file is read");
		return false;
	}
	else
		return true;
}
public boolean nameCheck( Node s , String n) {
	int count = 0;
	while(s.next != null) {
		if (n == s.name)
			count =1;
		s = s.next;
	}
		if(count == 1) {
		System.out.println("grade name is already exists");
		return false;
	}
	else
		return true;
}
}
