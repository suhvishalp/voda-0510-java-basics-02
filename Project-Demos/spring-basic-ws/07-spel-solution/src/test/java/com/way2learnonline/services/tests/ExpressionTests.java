package com.way2learnonline.services.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.GregorianCalendar;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.model.Inventor;
import com.way2learnonline.model.PlaceOfBirth;



public class ExpressionTests {
	
	private BeanFactoryResolver  beanFactoryResolver;
	
	
	@Before
	public void init() throws Exception{
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("application-config.xml","test-infrastructure-config.xml");		
		
		  beanFactoryResolver= new BeanFactoryResolver(context);	
	}	
	
	@Test
	public void testEvaluateLiteral(){
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");
		String value = (String) exp.getValue();
		assertEquals("Hello World", value);
		
		
	}
	
	@Test
	public void testMethodCall(){
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.concat('!')");
		String value = (String) exp.getValue();
		assertEquals("Hello World!", value);
		
	}
	
	@Test
	public void testEvaluationContext(){
		
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		
		
		EvaluationContext context = new StandardEvaluationContext(tesla);

		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name");

		
		String name = (String) exp.getValue(context);
		
		assertEquals("Nikola Tesla", name);
	}
	
	
	
	@Test
	public void testgetValueByRoot(){
		
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		

		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name");
		
		String name = (String) exp.getValue(tesla);
		
		assertEquals("Nikola Tesla", name);
		
	}
	
	
	
	
	@Test
	public void testComparision(){
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);

		PlaceOfBirth placeOfBirth= new PlaceOfBirth();
		placeOfBirth.setCity("Smiljan");
		placeOfBirth.setCountry("Croatia");
		
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		tesla.setInventions(new String[]{"AC Motor","AC Electric Chair","Tesla Coil","radio-controlled boat"});
		tesla.setPlaceOfBirth(placeOfBirth);

		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name=='Nikola Tesla'");	

		
		boolean result = (Boolean) exp.getValue(tesla);
		assertTrue(result);
		
		String city = (String) parser.parseExpression("placeOfBirth.city").getValue(tesla);
		assertEquals("Smiljan", city);
		
		String invention = parser.parseExpression("inventions[3]").getValue(tesla, String.class);
		assertEquals("radio-controlled boat", invention);
		
		
		
	}
	
	
	@Test
	public void testBeanResolver() throws SQLException{
		ExpressionParser expressionParser= new SpelExpressionParser();
		
		StandardEvaluationContext evaluationContext= new StandardEvaluationContext();
		evaluationContext.setBeanResolver(beanFactoryResolver);
		
		Expression expression=expressionParser.parseExpression("@dataSource");
		
		Object result=expression.getValue(evaluationContext);
		
		assertTrue(result instanceof DataSource);
	}


}
