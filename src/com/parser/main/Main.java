package com.parser.main;
import java.io.StringReader;

import com.parser.service.InsertService;
import com.parser.service.SelectService;
import com.parser.service.UpdateService;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.update.Update;

public class Main {

	public static void main(String[] args) throws JSQLParserException {
			CCJSqlParserManager pm = new CCJSqlParserManager();
			
			XmlParser parser = new XmlParser();
			parser.parseToObjects("./resources/tabele.xml");
			
			
			
/*			String sql = "SELECT tytus FROM bajki WHERE work BETWEEN 100 and 200"
					+ " AND gora = (SELECT count(*) FROM ballady);" ;
			
			net.sf.jsqlparser.statement.Statement statement = pm.parse(new StringReader(sql));
			
			// W zale¿noœci od typu zapytania, obslugujemy go w rozne sposoby
			if (statement instanceof Select) 
			{
				SelectService selectService = new SelectService();
				selectService.analyseQuery(statement);
				
				//selectService.getResults;
			}
			else if (statement instanceof Insert) 
			{
				InsertService insertService = new InsertService();
				// TODO : obs³uga Inserta
			}
			else if (statement instanceof Update) 
			{
				UpdateService updateService = new UpdateService();
				// TODO : obs³uga Update'a
			}*/
	}
	
	


}
