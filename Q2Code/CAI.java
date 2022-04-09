import java.util.ArrayList;
import java.util.Random;

import observer.*;

public class CAI implements Subject {

	//List of observers
	ArrayList<BaseSite> sites = new ArrayList<BaseSite>();

	//List of protocols
	ArrayList<Ouroboros> ouroboroses = new ArrayList<Ouroboros>();
	ArrayList<Cerebus> cerebuses = new ArrayList<Cerebus>();

	//Global protocol choice
	int ouroborosKey;
	int cerebusKey;

	//Setter for keys, private so CAI can only change it
	private void assignCerebusKey(int key) {
		cerebusKey = key;
		myNotify();
	}
	
	private void assignOuroborosKey(int key) {
		ouroborosKey = key;
		myNotify();
	}

	//Add and remove sites to CAI
	@Override
	public void add(BaseSite site) {
		sites.add(site);
	}

	@Override
	public void remove(BaseSite site) {
		sites.remove(site);
	}

	//Notify observers
	private void myNotify() {
		for(BaseSite site : sites) {
			site.update();
		}
	}

	//Add new protocols to the CAI
	private void addCerebus(Cerebus cerebus) {
		cerebuses.add(cerebus);
	}

	private void addOuroboros(Ouroboros ouroboros) {
		ouroboroses.add(ouroboros);
	}

	//Methods to send and recieve messages
	public String receiveOuroborosMessage(String in) {
		return ouroboroses.get(ouroborosKey).decrypt(in);
	}
	
	public String receiveCerebusMessage(String in) {
		return ouroboroses.get(cerebusKey).decrypt(in);
	}

	public String sendOuroborosMessage(String in) {
		return ouroboroses.get(ouroborosKey).encrypt(in);
	}
	
	public String sendCerebusMessage(String in) {
		return ouroboroses.get(cerebusKey).encrypt(in);
	}

	private Random rand;
		
	//---  Constructors   -------------------------------------------------------------------------
		
	public CAI() {
		rand = new Random();
	}

	public void simulateCAI() {
		//Assign keys
		assignCerebusKey(rand.nextInt(cerebuses.size()));
		assignOuroborosKey(rand.nextInt(ouroboroses.size()));
	}


	public static void main(String[] args) {
		CAI cai = new CAI();
		BaseSite site1 = new SiteOne();
		BaseSite site2 = new SiteTwo();
		BaseSite site3 = new SiteThree();
		//add SiteOne
		cai.add(site1);
		//add SiteTwo
		cai.add(site2);
		//add SiteThree
		cai.add(site3);

		//add protocols
		cai.addCerebus(new Cerebus(18));
		cai.addCerebus(new Cerebus(31));

		cai.addOuroboros(new Ouroboros(new int[] {3, 1, 0, 2}));
		cai.addOuroboros(new Ouroboros(new int[] {2, 5, 4, 1, 3, 0}));

		//Simulate CAI
		cai.simulateCAI();
		
	}

		
}

