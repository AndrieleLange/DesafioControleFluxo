public class ParametrosInvalidosException extends Exception{
    private int arg1;
    private int arg2;

    public ParametrosInvalidosException(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        return "ParametrosInvalidosException: o número " + arg1 + " é maior que " + arg2;
    }

    
    
}
