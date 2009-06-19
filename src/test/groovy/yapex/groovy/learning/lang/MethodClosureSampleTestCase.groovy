package yapex.groovy.learning.lang

class MethodClosureSampleTestCase extends GroovyTestCase {
	void test_closure() {
		MethodClosureSample first = new MethodClosureSample(6)
		MethodClosureSample lessThenFive = new MethodClosureSample(5)
		
		def lessThenSix = first.&validate
		
		def words = ['long string', 'medium', 'short', 'tiny']
		
		assert 'medium' == words.find(lessThenSix)
		assert 'short' == words.find(lessThenFive.&validate)
	}
}