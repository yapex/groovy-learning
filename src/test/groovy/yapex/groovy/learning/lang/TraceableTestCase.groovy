package yapex.groovy.learning.lang

import org.codehaus.groovy.runtime.StringBufferWriter

class TraceableTestCase extends GroovyTestCase {
	void test_interceptor() {
		def log = new StringBuffer()
		def traceMe = new Whatever(writer: new StringBufferWriter(log))
		
		assert 1 == traceMe.outer()
		assert log.toString().indexOf("before method 'outer'") > 0
	}
}

class Whatever extends Traceable {
	int outer() {
		return inner()
	}
	
	int inner() {
		return 1
	}
}