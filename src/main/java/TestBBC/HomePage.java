package TestBBC;

public class HomePage extends Utils {

    LoadProps loadProps=new LoadProps();

    public void VerifyUserIsOnHomePage(){
        validateURL(loadProps.getProperty("HomePageURL"));
    }

}
