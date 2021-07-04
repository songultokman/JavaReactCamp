package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	 public double hesapla(double tutar)
	   {
		   return tutar*1.10;
	   }
	
}

// Overridable (Üzerine yazılabilir)

// Basekrediden inherit yapar ama burda aynı fonksyon olduğu için ezer ve burayı çalıştırır.