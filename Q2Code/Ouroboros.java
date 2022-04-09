

public class Ouroboros {

	private static int[] OUROBOROS_KEY;

	public Ouroboros(int[] key) {
		OUROBOROS_KEY = key;
	}

	protected String encryptOuroboros(int[] am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in + new String(new char[am.length - (in.length() % am.length)]).replace("\0", " ");
		for(int i = 0; i < use.length(); i += am.length) {
			char[] next = new char[am.length];
			for(int j = 0; j < am.length; j++) {
				next[j] = use.charAt(i + am[j]);
			}
			out.append(new String(next));
		}
		return out.toString();
	}
	
	protected String decryptOuroboros(int[] am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in+"";
		for(int i = 0; i < use.length(); i += am.length) {
			char[] next = new char[am.length];
			for(int j = 0; j < am.length; j++) {
				next[am[j]] = use.charAt(i + j);
			}
			out.append(new String(next));
		}
		return out.toString();
	}

    public String encrypt(String in) {
        return encryptOuroboros(OUROBOROS_KEY, in);
    }

    public String decrypt(String in) {
        return decryptOuroboros(OUROBOROS_KEY, in);
    }
    
}
