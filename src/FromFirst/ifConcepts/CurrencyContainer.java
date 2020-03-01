package FromFirst.ifConcepts;

public class CurrencyContainer {
	private CurrencyContainer()
	{
		
	}
	public static Country getCountry(String country)
	{
		if(country.equals("INDIA"))
		{
			return new India();
		}
		else if(country.equals("UK"))
		{
			return new Uk();
		}
		else if(country.equals("USA"))
		{
			return new USA();
		}
		throw new IllegalArgumentException("Country name not found.....");
	}

}
