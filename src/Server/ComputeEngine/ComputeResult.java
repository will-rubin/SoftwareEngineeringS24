
public interface ComputeResult {

    static ComputeResult SUCCESS = () -> ComputeResultStatus.SUCCESS;
	static ComputeResult FAILURE = () -> ComputeResultStatus.FAILURE;

    ComputeResultStatus getResult();
    public static enum ComputeResultStatus {
        SUCCESS,
        FAILURE;
    }
}
