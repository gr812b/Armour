import observer.BaseSite;

public class SiteOne implements BaseSite {

    @Override
    public void update() {
        System.out.println("Site 1 - Update the security system!");
    }

}
