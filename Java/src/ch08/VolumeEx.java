package ch08;

public class VolumeEx {
	
	public static void main(String[] args) {
		
//		TV t = new TV();
//		Radio r = new Radio();
//		Speaker s = new Speaker();
//		
//		t.volumeUp();
//		t.volumeDown();
//		r.volumeUp();
//		r.volumeDown();
//		s.volumeUp();
//		s.volumeDown();
		
		Volume[] vols = {new TV(), new Radio(), new Speaker()};
		for(Volume vol : vols) {
			vol.volumeUp();
			vol.volumeDown();
		}
		
	}

}
