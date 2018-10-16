package behavioral.chainofresponsibility;


public class Usage {

    public static void main(String[]args){
        Parser xml = new XMLParser("XML Parser");
        Parser json = new JsonParser("JSON Parser");
        Parser doc = new DocParser("DocParser");
        Parser csv = new CSVParser("CSV Parser");

        xml.setParcer(json);
        json.setParcer(doc);
        doc.setParcer(csv);


        xml.parse(new File("doc"));
        json.parse(new File("csv"));
        doc.parse(new File("doc"));
        csv.parse(new File("json"));


    }
}
