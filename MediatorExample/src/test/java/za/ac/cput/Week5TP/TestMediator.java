package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestMediator extends TestCase {



    Mediator mediator;
    Buyer swedishBuyer;
    Buyer frenchBuyer;
    float sellingPriceinDollars;
    AmericanSeller americanSeller;
    DollarConverter dollarConverter;
    float swedishBidInKronor;
    float frenchBidInEuros;

    @Override
    public void setUp() throws Exception {

        mediator = new Mediator();
        swedishBuyer = new SwedishBuyer(mediator);
        frenchBuyer = new FrenchBuyer(mediator);
        sellingPriceinDollars = 10.0f;
        americanSeller = new AmericanSeller(mediator, sellingPriceinDollars);
        dollarConverter = new DollarConverter(mediator);
        swedishBidInKronor = 55.0f;
        frenchBidInEuros = 3.0f;

    }


    public void testMediator() throws Exception {

        while (!swedishBuyer.attemptToPurchase(swedishBidInKronor)) {
            swedishBidInKronor += 15.0f;
        }

        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5f;
        }

    }
}
