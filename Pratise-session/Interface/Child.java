class Child implements Father,Mother
{
	public void height()
	{
		float ht=(Father.HT+Mother.HT)/2;
		System.out.println("child height"+ht);
	}
}
