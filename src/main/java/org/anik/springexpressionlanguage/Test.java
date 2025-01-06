package org.anik.springexpressionlanguage;

import org.anik.lifecycle.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expressionlanguageconfig.xml");
        Demo demo = (Demo) context.getBean("demo");
        System.out.println(demo);

        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("99/3");
        System.out.println(expression.getValue());
    }
}
