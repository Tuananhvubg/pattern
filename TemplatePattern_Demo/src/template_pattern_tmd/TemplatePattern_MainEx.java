package template_pattern_tmd;

public class TemplatePattern_MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PageTemplate homePage = new HomePage();
        homePage.showPage();
         
        System.out.println();
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
 
        System.out.println();
        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
	}

}
