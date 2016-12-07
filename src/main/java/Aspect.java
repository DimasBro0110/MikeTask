import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by DmitriyBrosalin on 07/12/2016.
 */
public class Aspect {
    private String informDivision;
    private String warnUser;

    public Object performOperationInterception(ProceedingJoinPoint pjp) throws Throwable {
        Object[] argumentsPassed = pjp.getArgs();
        float val1 = new Float(argumentsPassed[0].toString());
        float val2 = new Float(argumentsPassed[1].toString());
        System.out.println(informDivision + ": " + val1 + ", : " + val2);
        if(val2 != 0){
            Object res = pjp.proceed();
            System.out.println("Результат вычисления: " + res);
            return pjp.proceed();
        }else{
            System.out.println(warnUser);
            return 0;
        }
    }

    public void setInformDivision(String informDivision) {
        this.informDivision = informDivision;
    }

    public void setWarnUser(String warnUser) {
        this.warnUser = warnUser;
    }
}
