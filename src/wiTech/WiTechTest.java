package wiTech;

import org.junit.jupiter.api.Test;

public class WiTechTest {

	@Test
		void Test() {
		WiTech wi = new WiTech();
		wi.openSite("https://wipwitech.wordpress.com/");
		wi.clickAboutUs();
		wi.click1YearCelebration();
		wi.scrollDown();
		// wi.clickWiteckitnetwork();
		wi.clickWiTechNu();
		wi.clickInstaLink();
	}

}
