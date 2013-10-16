package hello;

public class TranslationDemoTemplate implements IGenerator
 {
  protected static String nl;
  public static synchronized TranslationDemoTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    TranslationDemoTemplate result = new TranslationDemoTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + " Hello, ";
  protected final String TEXT_2 = "!";
  protected final String TEXT_3 = NL + " The current time is ";
  protected final String TEXT_4 = ".";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
     stringBuffer.append("Hello again!"); 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}