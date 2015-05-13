package com.parser.service;

import java.util.List;

import com.parser.main.TableNamesFinder;

import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.relational.Between;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SubSelect;

public class SelectService {

	public void analyseQuery(Statement statement) {
				
		Select selectStatement = (Select) statement;
		PlainSelect plainSelect = (PlainSelect) selectStatement.getSelectBody();
		TableNamesFinder tablesNamesFinder = new TableNamesFinder();
		List tableList = tablesNamesFinder.getTableList(selectStatement);
		//plainSelect.
		
		System.out.println(tableList.get(0));
		Expression where = plainSelect.getWhere();
		if( where instanceof AndExpression)
		{
			
			if(((AndExpression) where).getLeftExpression() instanceof Between)
			{
				Between between = (Between)((AndExpression) where).getLeftExpression();
				System.out.println(between.getBetweenExpressionStart());
				System.out.println(between.getBetweenExpressionEnd());
			}
			
			if(((AndExpression) where).getRightExpression() instanceof EqualsTo)
			{
				EqualsTo eq = (EqualsTo)((AndExpression) where).getRightExpression();
				if(eq.getLeftExpression() instanceof Column)
				{
					Column col = (Column)eq.getLeftExpression();
					System.out.println(col.getColumnName());
				}
				
				//Object obj = eq.getRightExpression();
				//System.out.println(obj.getClass());
				if(eq.getRightExpression() instanceof SubSelect)
				{
					//System.out.println("test2");
					SubSelect subSel = (SubSelect)eq.getRightExpression();
					tableList = tablesNamesFinder.getTableListSub(subSel);
					System.out.println(tableList.get(0));
				}
				
			}
			
			
		}
		
	}

}
