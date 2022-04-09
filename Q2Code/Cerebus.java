

public class Cerebus {

	private static final int CEREBUS_INIT_VALUE = 32;
	private static final int CEREBUS_ALPH_SIZE = 128;

	private static int CEREBUS_KEY;

	public Cerebus(int key) {
		CEREBUS_KEY = key;
	}

	protected String encryptCerebus(int am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in.toLowerCase();
		for(char a : use.toCharArray()) {
			out.append((char)(((a + am - CEREBUS_INIT_VALUE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
		}
		return out.toString();
	}

	protected String decryptCerebus(int am, String in) {
		StringBuilder out = new StringBuilder();
		String use = in.toLowerCase();
		for(char a : use.toCharArray()) {
			out.append((char)(((a - am  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
		}
		return out.toString();
	}

    public String encrypt(String in) {
        return encryptCerebus(CEREBUS_KEY, in);
    }

    public String decrypt(String in) {
        return decryptCerebus(CEREBUS_KEY, in);
    }
    
    
}
