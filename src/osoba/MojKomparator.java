package osoba;

import java.util.Comparator;

public class MojKomparator implements Comparator<Osoba> {
	
	
	public int compare(Osoba o1, Osoba o2) {
	int i = o1.getJmbg().compareTo(o2.getJmbg());
	if(i>0) {
		return -1;
	} else if (i<0) {
		return 1;
	}
		return 0;
	}

	
}
