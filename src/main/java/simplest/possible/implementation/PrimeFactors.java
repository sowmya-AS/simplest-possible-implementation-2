package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public <T> List<T> of(int number) {

        ArrayList primeFactors=new ArrayList();

        for (int factor=2;number>1;factor++)
            for(;number%factor==0;number/=factor)
                primeFactors.add(factor);

        return primeFactors;
    }
}
