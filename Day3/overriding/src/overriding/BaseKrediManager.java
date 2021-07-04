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

eğer final yazarsak OgrenciKrediManager kısmında overriding edemez.*/