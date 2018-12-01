package ca.mcgill.cs.swdesign.m2;

import java.util.Comparator;

public class ByComparator implements Comparator<Card>
{
	@Override
	public int compare(Card o1, Card o2)
	{

		      return o1.getRank().ordinal() - o2.getRank().ordinal();

	}

}
