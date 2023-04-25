public abstract class AbstractConverter<T> implements ListConverter<T> {
    protected StringBuilder builder = new StringBuilder();
    protected void resetBuilder(){
        this.builder = new StringBuilder();
    }
    protected void printResult(String result){
       System.out.println(result);
    }
}
