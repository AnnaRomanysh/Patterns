package behavioral.chainofresponsibility;



public interface Parser {

    public void setParcer(Parser parcer);

    public void parse(File file);

    public String getParserName();



}
