package hello;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TranslationDemoTemplate t = new TranslationDemoTemplate();
		String res = t.generate("kkk");
		System.out.println(res);
	}

}
