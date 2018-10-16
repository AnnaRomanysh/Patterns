package behavioral.chainofresponsibility;

public class JsonParser implements Parser{
    private Parser parser;
    private String parserName;

    public JsonParser (String parserName){
        this.parserName = parserName;
    }
    public void setParcer(Parser parcer) {
        this.parser=parcer;
    }

    public void parse(File file) {
        if(file.getType().equalsIgnoreCase("json")){
            System.out.println("Parse file using"+ parserName);
        }
        else if(parser!=null){
            System.out.println("Parse file using "+parser.getParserName());
            parser.parse(file);
        }
        else {
            System.out.println("Type of file is not supported");
        }


    }

    public String getParserName() {
        return parserName;
    }
}
