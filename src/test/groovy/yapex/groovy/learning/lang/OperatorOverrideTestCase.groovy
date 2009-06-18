package yapex.groovy.learning.lang

class OperatorOverrideTestCase extends GroovyTestCase { 
	void testSimple() { 
    	def buck = new Money(1, 'USD')
		assert buck
		assert buck == new Money(1, 'USD')
		assert buck + buck == new Money(2, 'USD')
   } 
}