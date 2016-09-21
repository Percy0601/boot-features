package io.training.boot.features.test.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class SimpleMockitoTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testSimple() {
		List<String> mockedList = mock(List.class);
		when(mockedList.get(0)).thenReturn(new String("HelloWorld"));
		// 使用mock对象
		mockedList.add("one");
		mockedList.clear();

		// 验证函数的调用次数
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}

}
