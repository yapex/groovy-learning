package yapex.groovy.learning.lang

class Money {
	private int amount
	private String currency
	
	Money(amountValue, currencyValue) {
		amount = amountValue
		currency = currencyValue
	}
	
	//override ==
	boolean equals(Object other) {
		if (null == other) return false
		if (! (other instanceof Money)) return false 
        if (currency != other.currency) return false
        if (amount   != other.amount)   return false 
        return true
	}
	
	int hashCode() {
		amount.hashCode() + currency.hashCode()
	}
	
	Money plus(Money other) {
		if (null == other) return this
		if (other.currency != this.currency) {
			throw new IllegalArgumentException("cannot add $other.currency to $currency")
		}
		return new Money(amount + other.amount, currency)
	}
	
	String toString() {
		return "$amount ($currency)"
	}
}