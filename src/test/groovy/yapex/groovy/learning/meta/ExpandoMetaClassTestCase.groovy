package yapex.groovy.learning.meta

class ExpandoMetaClassTestCase extends GroovyTestCase {
	
	void test_add_method() {
		try {
			Person p = new Person(name:'Tom', age: 20)
			p.showMeTheMoney()
		} catch (MissingMethodException e) {
			println e.message
		}
		
		Person.metaClass.showMeTheMoney = { return "oh, my god ! so much money !" }
		Person p  = new Person(name:'Tom', age:20)
		assert "oh, my god ! so much money !" == p.showMeTheMoney()
	}
	
}

class Person {
	String name
	int age
}