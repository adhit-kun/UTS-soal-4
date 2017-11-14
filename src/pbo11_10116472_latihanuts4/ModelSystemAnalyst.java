package pbo11_10116472_latihanuts4;

/**
 *
 * @author Adhitya Kuncoro Jatti
 */
public class ModelSystemAnalyst extends ModelEmployee {
    int bonus;
    public void bonusSystemAnalyst(){
        salary = 40000;
        bonus  = 90000;
        System.out.println("Salary Employee System Analyst = " + salary);
        System.out.println("Bonus System Analyst           = " + bonus );
    }
    
}
