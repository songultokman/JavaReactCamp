package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	 public double hesapla(double tutar)
	   {
		   return tutar*1.10;
	   }
	
}

// Overridable (�zerine yaz�labilir)

// Basekrediden inherit yapar ama burda ayn� fonksyon oldu�u i�in ezer ve buray� �al��t�r�r.