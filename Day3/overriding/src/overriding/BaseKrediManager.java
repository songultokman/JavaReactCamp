package overriding;

public  class BaseKrediManager {
   public double hesapla(double tutar)
   {
	   return tutar*1.18;
   }
}

/* public  final class BaseKrediManager {
public double hesapla(double tutar)
{
	   return tutar*1.18;
}

e�er final yazarsak OgrenciKrediManager k�sm�nda overriding edemez.*/