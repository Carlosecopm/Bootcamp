package aula.modular.utils;

import aula.modular.utils.interno.DivHelper;
import aula.modular.utils.interno.MultHelper;
import aula.modular.utils.interno.SubHelper;
import aula.modular.utils.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;
    private MultHelper multHelper;


    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }
    public int sum(int a, int b) {
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b) {
        return subHelper.execute(a,b);
    }
    public int mult(int a, int b) {
        return multHelper.execute(a,b);
    }
    public int div(int a, int b) {
        return divHelper.execute(a,b);
    }
}
