import java.util.Arrays;
import java.util.List;
import ac.il.afeka.Submission.Submission;
import ac.il.afeka.fsm.DFSM;

public class Main implements Submission, Assignment1 {

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("318353356", "315000539", "208722710");
	}

	@Override
	public boolean compute(String dfsmEncoding, String input) throws Exception {
		DFSM dfsm= new DFSM(dfsmEncoding);
		return dfsm.compute(input);
	}
}
