package yapex.groovy.learning.lang

class MethodClosureSample {
	int limit
	
	MethodClosureSample(limit) {
		this.limit = limit
	}
	
	boolean validate(value) {
		return value.length() <= limit
	}
}