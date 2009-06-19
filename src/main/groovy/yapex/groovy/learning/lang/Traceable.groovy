package yapex.groovy.learning.lang

import org.codehaus.groovy.runtime.InvokerHelper

class Traceable implements GroovyInterceptable {
	Writer writer = new PrintWriter(System.out)
	private int indent = 0
	
	Object invokeMethod(String name, Object args) {
		writer.write("\n" + '  '*indent + "before method '$name'") 
		writer.flush() 
		indent++
		
		def metaClass = InvokerHelper.getMetaClass(this)
		def result = metaClass.invokeMethod(this, name, args)
		
		indent-- 
		writer.write("\n" + '  '*indent + "after  method '$name'") 
		writer.flush() 
		return result
	}
}