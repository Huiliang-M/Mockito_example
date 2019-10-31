package MockTypes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class DeepMockTest {
	
	
	@Mock(answer = Answers.RETURNS_DEEP_STUBS)
	private LessonService service;
//	
//	@Mock
//	private lessonreturn result;
	
	
	

	@Before
	public void init() {
		
		MockitoAnnotations.initMocks(this);
	}
	
	
	//stubbing
	@Test
	public void deepmocktest() {
		
//		lessonreturn result = service.get();
//		result.foo();
//		
		
//		Mockito.when(service.get()).thenReturn(result);
//		lessonreturn re = service.get();
//		re.foo();
//		
		
		service.get().foo();
		
		
	}
	
}
