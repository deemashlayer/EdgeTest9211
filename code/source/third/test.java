package third;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class test

{
	// ---( internal utility methods )---

	final static test _instance = new test();

	static test _newInstance() { return new test(); }

	static test _cast(Object o) { return (test)o; }

	// ---( server methods )---




	public static final void newJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(newJava)>> ---
		// @sigtype java 3.5
		System.out.println("Test text here");
		// --- <<IS-END>> ---

                
	}
}

